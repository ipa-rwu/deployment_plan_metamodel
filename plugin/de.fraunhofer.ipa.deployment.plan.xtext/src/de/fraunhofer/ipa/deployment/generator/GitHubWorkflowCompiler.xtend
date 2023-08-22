package de.fraunhofer.ipa.deployment.generator

import deploymentPlan.AbstractDeploymentPlan
import deploymentPlan.RosMiddleware

class GitHubWorkflowCompiler {

    def gitHubWorkflowCompiler(AbstractDeploymentPlan plan, String reusedWorkflowPath, NamingHelper namingHelper)'''
name: «plan.name»
on:
  push:
    paths:
      - "«namingHelper.getAbsolutePlanFolderPath»/**"
env:
  BUILDER_PREFIX: "ghcr.io/ipa-rwu/"
  BUILDER_SUFFIX: ":latest"
  CMAKE_ARGS: "-DCMAKE_BUILD_TYPE=Release"
  REGISTRY: «namingHelper.defaultRegistry»

jobs:
  EnvSetup:
    runs-on: ubuntu-latest
    name: Setup Dynamic Environment Variables
    outputs:
      registry: ${{ steps.set-output-defaults.outputs.registry }}
      build-prefix: ${{ steps.set-output-defaults.outputs.build-prefix }}
      build-suffix: ${{ steps.set-output-defaults.outputs.build-suffix }}
      cmake-args: ${{ steps.set-output-defaults.outputs.cmake-args }}
    steps:
      - name: set outputs with default values
        id: set-output-defaults
        run: |
          echo "registry=$REGISTRY" >> $GITHUB_OUTPUT
          echo "build-prefix=$BUILDER_PREFIX" >> $GITHUB_OUTPUT
          echo "build-suffix=$BUILDER_SUFFIX" >> $GITHUB_OUTPUT
          echo "cmake-args=$CMAKE_ARGS" >> $GITHUB_OUTPUT
  «FOR assignment : plan.realize.realizations»
  «assignment.name»:
    needs: [EnvSetup]
    uses: «namingHelper.absoluteDefaultGithubReuseableWorkflowPath»
    with:
      context-path: «namingHelper.getAbsoluteAssignmentFolderPath(assignment.name)»
      ros-distro: «(assignment.middleware as RosMiddleware).value.getName»
      registry: ${{needs.EnvSetup.outputs.registry}}
      image-name: ${{ github.repository_owner }}/«assignment.name»
      build-prefix: ${{needs.EnvSetup.outputs.build-prefix}}
      build-suffix: ${{needs.EnvSetup.outputs.build-suffix}}
      cmake-args: ${{needs.EnvSetup.outputs.cmake-args}}
«ENDFOR»
    '''

    def ReusableWorkflow()'''
name: Test_Build_Docker_Image_Template

on:
  workflow_call:
    inputs:
      context-path:
        required: true
        type: string
      ros-distro:
        required: true
        type: string
      registry:
        required: true
        type: string
      image-name:
        required: true
        type: string
      build-prefix:
        required: true
        type: string
      build-suffix:
        required: true
        type: string
      cmake-args:
        required: true
        type: string

jobs:
  test_source_code_build_image:
    runs-on: ubuntu-latest
    steps:
      - name: Checkout
        uses: actions/checkout@v3
      - name: Log in to the Container registry
        uses: docker/login-action@v2
        with:
          registry: ${{ inputs.registry }}
          username: ${{ github.actor }}
          password: ${{ secrets.GITHUB_TOKEN }}
      - name: Set up QEMU
        uses: docker/setup-qemu-action@v2
      - name: Set up Docker Buildx
        uses: docker/setup-buildx-action@v2
      - name: Cache Docker layers
        uses: actions/cache@v2
        with:
          path: /tmp/.buildx-cache
          key: ${{ runner.os }}-buildx-${{ github.sha }}
          restore-keys: |
            ${{ runner.os }}-buildx-
      - name: Docker meta
        id: docker_meta
        uses: docker/metadata-action@v4
        with:
          images: ${{ inputs.registry }}/${{ inputs.image-name }}
          tags: |
            type=ref,event=branch
            type=raw,value=latest,enable=${{ github.ref == format('refs/heads/{0}', 'main') }}
      - name: Build Docker
        uses: docker/build-push-action@v3
        if: ${{ github.ref != format('refs/heads/{0}', github.event.repository.default_branch) }}
        with:
          context: ${{ inputs.context-path }}
          push: false
          tags: ${{ steps.docker_meta.outputs.tags }}
          labels: ${{ steps.docker_meta.outputs.labels }}
          cache-from: type=local,src=/tmp/.buildx-cache
          cache-to: type=local,dest=/tmp/.buildx-cache-new,mode=max
          build-args: |
            ROS_DISTRO=${{ inputs.ros-distro }}
            BUILDER_PREFIX=${{ inputs.build-prefix }}
            BUILDER_SUFFIX=${{ inputs.build-suffix }}
            CMAKE_ARGS=${{ inputs.cmake-args }}
      - name: Build and Push Docker Image
        uses: docker/build-push-action@v3
        if: ${{ github.ref == format('refs/heads/{0}', github.event.repository.default_branch) }}
        with:
          context: ${{ inputs.context-path }}
          push: true
          tags: ${{ steps.docker_meta.outputs.tags }}
          labels: ${{ steps.docker_meta.outputs.labels }}
          cache-from: type=local,src=/tmp/.buildx-cache
          cache-to: type=local,dest=/tmp/.buildx-cache-new,mode=max
          build-args: |
            ROS_DISTRO=${{ inputs.ros-distro }}
            BUILDER_PREFIX=${{ inputs.build-prefix }}
            BUILDER_SUFFIX=${{ inputs.build-suffix }}
            CMAKE_ARGS=${{ inputs.cmake-args }}
      - name: Move cache
        run: |
          rm -rf /tmp/.buildx-cache
          mv /tmp/.buildx-cache-new /tmp/.buildx-cache
    '''
}

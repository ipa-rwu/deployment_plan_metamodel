package de.fraunhofer.ipa.deployment.generator

import deploymentPlan.AbstractDeploymentPlan
import deploymentPlan.RosMiddleware
import jakarta.inject.Inject

class GitLabCICompiler {

  @Inject
  extension DeploymentHelper

  def gitlabCICompiler(AbstractDeploymentPlan plan, NamingHelper namingHelper)'''
  include:
    - local: «namingHelper.absoluteRootPrefix»/«namingHelper.gitlabJobTemplatePath»
    - local: «namingHelper.absoluteRootPrefix»/«namingHelper.gitlabRuleTemplatePath»

  variables:
    ROSINSTALL_CI_JOB_TOKEN: "true"

  .common:
    tags: &kaniko_runner
      - todo

  «FOR assignment : plan.realize.realizations»
  «assignment.name»:
    tags: *kaniko_runner
    stage: build
    before_script:
      # use "export" to overide global variables
      # - export BASE_IMAGE_PREFIX="«chooseBaseImage(getProcessorArchitecture(assignment).getName)»"
      # - export BASE_IMAGE_SUFFIX="«(assignment.middleware as RosMiddleware).value.getName»-ros-core"
      - echo BASE_IMAGE_PREFIX=${BASE_IMAGE_PREFIX}
      - echo BASE_IMAGE_SUFFIX=${BASE_IMAGE_SUFFIX}
      - echo "IMAGE_NAME=${IMAGE_NAME}"
      - !reference [.common, setup_image_tag_script]
      - !reference [.common, setup_base_image_script]
      - echo "DOCKERFILE_FOLDER=${DOCKERFILE_FOLDER}"
      - echo "DOCKERFILE_NAME=${DOCKERFILE_NAME}"
      - echo "SELECT_PKGS=${SELECT_PKGS}"
      - echo "CMAKE_ARGS=${CMAKE_ARGS}"
      - echo "TARGET=${TARGET}"
      - export BUILDER_SUFFIX=$BUILDER_SUFFIX
    extends:
      - .build_with_kaniko
      - .on_always
    variables:
      IMAGE_NAME: "«assignment.name»_«(assignment.middleware as RosMiddleware).value.getName»"
      DOCKERFILE_FOLDER: "«namingHelper.getAbsoluteAssignmentFolderPath(assignment.name)»/"
      BASE_IMAGE_PREFIX: "«chooseBaseImage(getProcessorArchitecture(assignment).getName)»"
      BASE_IMAGE_SUFFIX: "«(assignment.middleware as RosMiddleware).value.getName»-ros-core"
      SELECT_PKGS: ""
      COLCON_OPTION: ""

  publish_«assignment.name»:
    tags: *kaniko_runner
    stage: publish
    extends:
      - .publish
      - .on_merge_tag
    variables:
      IMAGE_NAME: "«assignment.name»_«(assignment.middleware as RosMiddleware).value.getName»"
    needs:
      - «assignment.name»
  «""»
    «ENDFOR»

  doc:
    tags: *kaniko_runner
    stage: doc
    extends:
      - .sphinxdoc
      - .on_doc_change
      - .on_merge_tag
    variables:
      DOC_PATH: "«namingHelper.absoluteRootPrefix»/«namingHelper.relativePlanFolderPath»/doc/source"

  «var assPerExecutors = collectAssignmentPerExecutor(plan.realize.realizations)»
  «FOR entryset: assPerExecutors.entrySet()»
  «var compDev = entryset.key»
  ansible_deploy:
    tags:
      - «compDev.name»
    stage: ansible_deploy
    before_script:
      - "command -v ssh-agent >/dev/null || ( apt-get update -y && apt-get install openssh-client -y )"
      - eval $(ssh-agent -s)
      - chmod 400 "$SSH_PRIVATE_KEY_«compDev.name.toUpperCase»"
      - ssh-add "$SSH_PRIVATE_KEY_«compDev.name.toUpperCase»"

      - mkdir -p ~/.ssh
      - chmod 700 ~/.ssh

      - echo -e "Host *\n\tStrictHostKeyChecking no\n\n" > ~/.ssh/config

      - apk add ansible -v
    script:
      - cd «namingHelper.absoluteRootPrefix»/«namingHelper.relativePlanFolderPath»/ansible
      - ansible-playbook -i inventory_ci.yaml --private-key "$SSH_PRIVATE_KEY_«compDev.name.toUpperCase»" playbook_deploy_files.yaml
    variables:
      ANSIBLE_HOST_KEY_CHECKING: "False"
    extends:
      - .on_merge_tag
    when: manual
  «ENDFOR»

  stages:
    - ansible_deploy
    - build
    - publish
    - doc
  «""»
  '''

  def gitlabRuleTemplate()'''
  .on_always:
    rules:
      - if: $CI_PIPELINE_SOURCE == "parent_pipeline"
      - if: $CI_PIPELINE_SOURCE == "merge_request_event"
      - if: $CI_MERGE_REQUEST_ID
      - if: $CI_COMMIT_BRANCH && $CI_OPEN_MERGE_REQUESTS
        when: never
      - if: $CI_COMMIT_BRANCH
      - if: $CI_COMMIT_TAG != null

  .on_tag:
    rules:
      - if: $CI_COMMIT_TAG != null

  .on_merge_event:
    rules:
      - if: $CI_PIPELINE_SOURCE == "merge_request_event"
      - if: $CI_MERGE_REQUEST_ID

  .on_merge_tag:
    rules:
      - if: $CI_PIPELINE_SOURCE == "merge_request_event"
      - if: $CI_MERGE_REQUEST_ID
      - if: $CI_COMMIT_BRANCH && $CI_OPEN_MERGE_REQUESTS
        when: never
      - if: $CI_COMMIT_TAG != null
      - if: "$CI_COMMIT_BRANCH == $CI_DEFAULT_BRANCH"

  .on_doc_change:
    rules:
      - if: $CI_COMMIT_BRANCH
        changes:
          compare_to: "refs/heads/main" #so far, it doesn't allow to use variable here
          paths:
            - "${DOC_PATH}/*"
  «""»
  '''

  def gitlabJobTemplate()'''
  variables:
    BASE_IMAGE_PREFIX: public.ecr.aws/docker/library/ros
    BASE_IMAGE_SUFFIX: "TODO"
    BUILDER_PREFIX: "ghcr.io/ipa-rwu/"
    BUILDER_SUFFIX: ":latest"
    CMAKE_ARGS: "-DCMAKE_BUILD_TYPE=RELEASE"
    DOCKER_BUILDKIT: 1
    DOCKER_TLS_CERTDIR: ""
    PREFIX: "${CI_PIPELINE_ID}:"
    ROSINSTALL_CI_JOB_TOKEN: "true"
    STABLE_BRANCH: main
    SUFFIX: ""
    DOC_NAME: "TODO"
    ADOC_PATH: "TODO"
    DOC_IMAGE_PATH: "TODO"
    SELECT_PKGS: ""
    COLCON_OPTION: ""
    STAGE: deploy
    DOCKERFILE_NAME: "Dockerfile"

  .common:
    create_release_tag_script:
      - |
        TARGET=${CI_REGISTRY_IMAGE}/${IMAGE_NAME}:${CI_COMMIT_REF_NAME//\//-}
        if [ "$CI_COMMIT_REF_NAME" = "main" ] || [ "$CI_COMMIT_REF_NAME" = "master" ]; then
          TARGET=${CI_REGISTRY_IMAGE}/${IMAGE_NAME}:latest
        fi
        if [[ $(expr match "$CI_COMMIT_REF_NAME" ".*$STABLE_BRANCH") != 0 ]]; then
          TARGET=${CI_REGISTRY_IMAGE}/${IMAGE_NAME}:latest
        fi
        if [ $CI_COMMIT_TAG ]; then
          convert_tag=${CI_COMMIT_TAG//\//-}
          for ros_version in $ROS_VERSIONS; do
            if [[ $(expr match "$convert_tag" ".*$ros_version-") != 0 ]]; then
              distro_prefix=${ros_version}-
              remove_distro_tag=${convert_tag#"$distro_prefix"}
              TARGET_RELEASE=${CI_REGISTRY_IMAGE}/${IMAGE_NAME}:${remove_distro_tag}
              TARGET=$TARGET_RELEASE
              break
            fi
          done;
        fi
    setup_image_tag_script:
      - export TARGET=${CI_REGISTRY_IMAGE}/${IMAGE_NAME}:${CI_COMMIT_REF_NAME//\//-}
      - echo "TARGET=${TARGET}"
    setup_base_image_script:
      - export BASE_IMAGE="$BASE_IMAGE_PREFIX:$BASE_IMAGE_SUFFIX"
      - echo "BASE_IMAGE=${BASE_IMAGE}"

  .precommit:
    image: python:3.12.0b4-slim
    script:
      - apt update && apt install -y --no-install-recommends git
      - pip install pre-commit
      - pre-commit run --all-files


  .build_with_kaniko:
    image:
      name: gcr.io/kaniko-project/executor:debug
      entrypoint: [""]
    script:
      - echo "commit=${CI_COMMIT_REF_NAME//\//-}"
      - echo "Target=$TARGET"
      - /kaniko/executor
        --context "${CI_PROJECT_DIR}/${DOCKERFILE_FOLDER}"
        --build-arg SUFFIX
        --build-arg PREFIX
        --build-arg BUILDER_PREFIX
        --build-arg BUILDER_SUFFIX
        --build-arg BASE_IMAGE
        --build-arg ROS_DISTRO
        --build-arg ROSINSTALL_CI_JOB_TOKEN
        --build-arg CI_JOB_TOKEN
        --build-arg BUILDKIT_INLINE_CACHE=1
        --build-arg CMAKE_ARGS
        --build-arg SELECT_PKGS
        --build-arg COLCON_OPTION
        --target ${STAGE}
        --dockerfile "${CI_PROJECT_DIR}/${DOCKERFILE_FOLDER}${DOCKERFILE_NAME}"
        --no-push
        --destination "${TARGET}"
        --tar-path ${PREFIX//:/-}${IMAGE_NAME}${SUFFIX}.tar
    artifacts:
      name: ${CI_JOB_NAME}
      paths:
        - ${PREFIX//:/-}${IMAGE_NAME}${SUFFIX}.tar
      expire_in: 10 minutes

  .build_with_kaniko_push:
    image:
      name: gcr.io/kaniko-project/executor:debug
      entrypoint: [""]
    script:
      - echo "commit=${CI_COMMIT_REF_NAME//\//-}"
      - echo "Target=$TARGET"
      - /kaniko/executor
        --context "${CI_PROJECT_DIR}/${DOCKERFILE_FOLDER}"
        --build-arg SUFFIX
        --build-arg PREFIX
        --build-arg BUILDER_PREFIX
        --build-arg BUILDER_SUFFIX
        --build-arg BASE_IMAGE
        --build-arg ROS_DISTRO
        --build-arg ROSINSTALL_CI_JOB_TOKEN
        --build-arg CI_JOB_TOKEN
        --build-arg BUILDKIT_INLINE_CACHE=1
        --build-arg CMAKE_ARGS
        --build-arg SELECT_PKGS
        --build-arg COLCON_OPTION
        --target ${STAGE}
        --dockerfile "${CI_PROJECT_DIR}/${DOCKERFILE_FOLDER}${DOCKERFILE_NAME}"
        --destination "${TARGET}"
        --tar-path ${PREFIX//:/-}${IMAGE_NAME}${SUFFIX}.tar
    artifacts:
      name: ${IMAGE_NAME}
      paths:
        - ${PREFIX//:/-}${IMAGE_NAME}${SUFFIX}.tar
      expire_in: 10 minutes

  .publish:
    image:
      name: gcr.io/go-containerregistry/crane:debug
      entrypoint: [""]
    script:
      - !reference [.common, create_release_tag_script]
      - crane auth login -u $CI_REGISTRY_USER -p $CI_REGISTRY_PASSWORD $CI_REGISTRY
      - crane push ${PREFIX//:/-}${IMAGE_NAME}${SUFFIX}.tar ${TARGET}


  .doxygen-job:
    image: ubuntu:latest
    before_script:
      - apt-get update -qq
      - apt-get install -y -qq doxygen graphviz
    script:
      - doxygen Doxyfile
      - mv doc/html/ public/
    artifacts:
      paths:
      - public
    when: always


  .adoc:
    image: "asciidoctor/docker-asciidoctor"
    before_script:
      - apk add graphicsmagick-dev ruby-dev musl-dev gcc
      - gem install prawn-gmagick asciidoctor-diagram
    script:
      - asciidoctor-pdf -a pdf-style=doc/theme.yml -r asciidoctor-diagram -v --failure-level=INFO "${ADOC_PATH}.adoc" -o "${DOC_NAME}.pdf"
      - asciidoctor -r asciidoctor-diagram -v --failure-level=INFO "${ADOC_PATH}.adoc" -o "index.html" -D html
      - cp -r ${DOC_IMAGE_PATH} html
    artifacts:
      paths:
        - ${DOC_NAME}.pdf
        - html/
      expire_in: 1 hour

  .pages:
    dependencies:
      - doc
    script:
      - mv html public
    artifacts:
      paths:
        - public

  .sphinxdoc:
    image: sphinxdoc/sphinx:latest
    before_script:
      - apt-get update -qq
      - pip install myst-parser
      - pip install sphinx-rtd-theme
      - pip install sphinx-mdinclude
      - pip install sphinxcontrib-plantuml
      - apt install -y -qq plantuml
    script:
      - sphinx-build -b html ${DOC_PATH} public
    artifacts:
      name: documentation
      paths:
        - public
  «""»
  '''
}

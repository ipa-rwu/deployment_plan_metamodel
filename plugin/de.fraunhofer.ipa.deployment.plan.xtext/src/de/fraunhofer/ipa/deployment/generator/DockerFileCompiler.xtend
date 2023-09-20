package de.fraunhofer.ipa.deployment.generator

import deploymentPlan.AbstractComputationAssignment

class DockerFileCompiler {


 def dockerFileCompiler(AbstractComputationAssignment assignment, NamingHelper naminghepler, Boolean ifRunBash)'''
# syntax=docker/dockerfile:1
ARG BUILDER_SUFFIX=
ARG BUILDER_PREFIX=
ARG BASE_IMAGE
FROM ${BASE_IMAGE} as base
FROM ${BUILDER_PREFIX}builder${BUILDER_SUFFIX} as builder

«stagePrebuild(ifRunBash, naminghepler.getAptInstallFile(assignment.name))»

FROM pre_build as build
ARG CMAKE_ARGS=
ENV CMAKE_ARGS $CMAKE_ARGS
RUN apt-get update -qq && \
    /builder/workspace.bash build_workspace /root/ws && \
    rm -rf /var/lib/apt/lists/*

FROM build as test
RUN apt-get update -qq && \
    /builder/workspace.bash test_workspace /root/ws && \
    rm -rf /var/lib/apt/lists/*

FROM test as install
RUN apt-get update -qq && \
    /builder/workspace.bash install_workspace /root/ws && \
    rm -rf /var/lib/apt/lists/*

FROM base as deploy
COPY --from=install /root/ws/DEPENDS /root/ws/DEPENDS
COPY --from=install /ros_entrypoint.sh /ros_entrypoint.sh
COPY --from=builder workspace.bash /builder/workspace.bash
RUN apt-get update -qq
«IF ifRunBash»
COPY --from=install /root/ws/src/«naminghepler.getAptInstallFile(assignment.name)» /root/ws/src/«naminghepler.getAptInstallFile(assignment.name)»
RUN /builder/workspace.bash run_sh_files /root/ws «naminghepler.getAptInstallFile(assignment.name)»
«ENDIF»
RUN /builder/workspace.bash install_depends /root/ws
RUN rm -rf /var/lib/apt/lists/*
COPY --from=install /root/ws/install /root/ws/install
 '''

 def dockerFileCompiler(AbstractComputationAssignment assignment, NamingHelper naminghepler)'''
 «dockerFileCompiler(assignment, naminghepler, false)»
 '''

 def stagePrebuild(Boolean ifRunBash, String bashName)'''
 FROM base as pre_build
 COPY . /root/ws/src/
 COPY --from=builder workspace.bash /builder/workspace.bash
 ARG ROSINSTALL_CI_JOB_TOKEN=
 ENV ROSINSTALL_CI_JOB_TOKEN $ROSINSTALL_CI_JOB_TOKEN
 ARG CI_JOB_TOKEN=
 ENV CI_JOB_TOKEN $CI_JOB_TOKEN
 RUN apt-get update -qq && \
     /builder/workspace.bash install_from_rosinstall_folder /root/ws
 «IF ifRunBash»
 RUN apt-get update -qq && \
     /builder/workspace.bash run_sh_files /root/ws «bashName»
 «ENDIF»
 RUN rm -rf /var/lib/apt/lists/*
 '''

 def stagePrebuild()'''
 «stagePrebuild(false, null)»
 '''
}

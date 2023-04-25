package de.fraunhofer.ipa.deployment.generator

import de.fraunhofer.ipa.deployment.util.ProcessorArchitectureType
import de.fraunhofer.ipa.deployment.util.ProcessorArchitectureValue
import deploymentPlan.AbstractComputationAssignment
import device.ArchitectureProcessorProperty
import targetEnvironment.ComputationDeviceInstance

class DockerFileCompiler {


 def dockerFileCompiler(AbstractComputationAssignment assignment, Boolean ifRunBash)'''
# syntax=docker/dockerfile:1
ARG BUILDER_SUFFIX=
ARG BUILDER_PREFIX=
ARG ROS_DISTRO=
FROM «chooseBaseImage(getProcessorArchitecture(assignment).getName)» as base
FROM ${BUILDER_PREFIX}builder${BUILDER_SUFFIX} as builder

«stagePrebuild(ifRunBash, String.format("%s_%s.sh", assignment.name, assignment.executedBy.name))»

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
COPY --from=builder workspace.bash /builder/workspace.bash
RUN apt-get update -qq && \
    /builder/workspace.bash install_depends /root/ws && \
    rm -rf /var/lib/apt/lists/*
COPY --from=install /opt/ros/$ROS_DISTRO /opt/ros/$ROS_DISTRO
 '''

 def dockerFileCompiler(AbstractComputationAssignment assignment)'''
 «dockerFileCompiler(assignment, false)»
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

 def getProcessorArchitecture(AbstractComputationAssignment cas){
    for(cp : (cas.executedBy as ComputationDeviceInstance).configDeviceProperty){
        if(cp.refProperty instanceof ArchitectureProcessorProperty){
            if(cp.value instanceof ProcessorArchitectureValue){
            var architecture = (cp.value as ProcessorArchitectureValue).value
            System.out.println(String.format("getProcessorArchitecture:%s", architecture.getName))
            return architecture
            }
        }

    }

 }

 def chooseBaseImage(String arch){
    switch (arch) {
        case ProcessorArchitectureType.X86.getName: {
            "public.ecr.aws/docker/library/ros:${ROS_DISTRO}-ros-core"
        }
        case ProcessorArchitectureType.ARM64V8.getName: {
            "arm64v8/ros:${ROS_DISTRO}-ros-core"
        }
        case ProcessorArchitectureType.ARM64.getName: {
            "arm64/ros:${ROS_DISTRO}-ros-core"
        }
                case ProcessorArchitectureType.ARM32.getName: {
            "arm32/ros:${ROS_DISTRO}-ros-core"
        }
        default: {
            throw new IllegalArgumentException("Undefined Processor Architecture: " + arch)
        }
    }
 }
}

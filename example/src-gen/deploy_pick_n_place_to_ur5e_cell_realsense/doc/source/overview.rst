.. _overview:

############################
Deployment overview
############################

This documentation is about deploying a software system consisting of
    * color_pose_estimation
    * robot_skills
    * realsense2_camera_driver
    * ur_robot_driver
  to a target environment including devices as follows:

  * rwu_laptop (type: PC)
  * arm (type: UR5E)
  * gripper (type: EGP50)
  * camera_realsense (type: Realsense_camera)

  The sources of components are as follows:

  color_pose_estimation:

  .. list-table:: color_pose_estimation

    * - component name
      - repository
      - version

    * - color_pose_estimation
      - https://github.com/ipa-anm/color_pose_estimation.git
      - humble-devel

  robot_skills:

  .. list-table:: robot_skills

    * - component name
      - repository
      - version

    * - robot_skills
      - https://github.com/ipa-rwu/pick_place_ros2
      - humble-devel

  realsense2_camera_driver:

  .. list-table:: realsense2_camera_driver

    * - component name
      - repository
      - version

    * - realsense2_camera_driver
      - https://github.com/IntelRealSense/realsense-ros
      - ros2-development

  ur_robot_driver:

  .. list-table:: ur_robot_driver

    * - component name
      - repository
      - version

    * - ur_robot_driver
      - https://github.com/UniversalRobots/Universal_Robots_ROS2_Driver.git
      - humble

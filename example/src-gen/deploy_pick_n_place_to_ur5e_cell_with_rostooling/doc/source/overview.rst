.. _overview:

############################
Deployment overview
############################

This documentation is about deploying a software system consisting of
    * realsense_camera_driver
    * realsense_camera_driver
    * aruco_marker_detection
    * pick_place_application
  to a target environment including devices as follows:

  * rwu_laptop (type: PC)
  * arm (type: UR5E)
  * gripper (type: EGP50)
  * camera_realsense (type: Realsense_camera)

  The sources of components are as follows:
  realsense_driver:

  .. list-table:: realsense_driver

    * - component name
      - repository
      - version

    * - realsense-ros
      - https://github.com/IntelRealSense/realsense-ros
      -

  pick_place_task:

  .. list-table:: pick_place_task

    * - component name
      - repository
      - version


  ur5e_driver:

  .. list-table:: ur5e_driver

    * - component name
      - repository
      - version

    * - realsense-ros
      - https://github.com/IntelRealSense/realsense-ros
      -

  marker_detection:

  .. list-table:: marker_detection

    * - component name
      - repository
      - version

    * - aruco_ros
      - https://github.com/ipa-rwu/aruco_ros
      - humble-devel

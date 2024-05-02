from ament_index_python.packages import get_package_share_directory
from launch import LaunchDescription
from launch.actions import DeclareLaunchArgument, IncludeLaunchDescription
from launch.launch_description_sources import PythonLaunchDescriptionSource
from launch.substitutions import (LaunchConfiguration, PathJoinSubstitution,
                                  PythonExpression, TextSubstitution)
from launch_ros.actions import Node


def generate_launch_description():
    ld = LaunchDescription()

    include_aruco_marker_detection = IncludeLaunchDescription(
        PythonLaunchDescriptionSource([get_package_share_directory(
            'aruco_marker_detection') + '/launch/aruco_marker_detection.launch.py'])
    )
    include_bt_manipulation_framwork = IncludeLaunchDescription(
        PythonLaunchDescriptionSource([get_package_share_directory(
            'bt_manipulation_framwork') + '/launch/bt_manipulation_framwork.launch.py'])
    )
    include_ur5e_cell_moveit_config = IncludeLaunchDescription(
        PythonLaunchDescriptionSource([get_package_share_directory(
            'ur5e_cell_moveit_config') + '/launch/robot.launch.py'])
    )
    include_realsense_camera_calibrated = IncludeLaunchDescription(
        PythonLaunchDescriptionSource([get_package_share_directory(
            'realsense_camera_calibrated') + '/launch/realsense_camera_calibrated.py'])
    )

    ld.add_action(include_aruco_marker_detection)
    ld.add_action(include_bt_manipulation_framwork)
    ld.add_action(include_ur5e_cell_moveit_config)
    ld.add_action(include_realsense_camera_calibrated)

    return ld

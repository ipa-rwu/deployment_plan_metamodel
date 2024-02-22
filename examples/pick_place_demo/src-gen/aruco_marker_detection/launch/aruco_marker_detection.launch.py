from launch import LaunchDescription
from launch.actions import DeclareLaunchArgument, IncludeLaunchDescription
from launch.launch_description_sources import PythonLaunchDescriptionSource
from launch.substitutions import (LaunchConfiguration, PathJoinSubstitution,
                                  PythonExpression, TextSubstitution)
from launch_ros.actions import Node


def generate_launch_description():
    ld = LaunchDescription()

    camera_frame_arg = DeclareLaunchArgument(
        "camera_frame", default_value=TextSubstitution(text="camera_color_optical_frame")
    )
    ld.add_action(camera_frame_arg)
    reference_frame_arg = DeclareLaunchArgument(
        "reference_frame", default_value=TextSubstitution(text="tool0")
    )
    ld.add_action(reference_frame_arg)
    marker_size_arg_arg = DeclareLaunchArgument(
        "marker_size_arg", default_value=TextSubstitution(text="0.02")
    )
    ld.add_action(marker_size_arg_arg)
    raw_image_topic_arg = DeclareLaunchArgument(
        "raw_image_topic", default_value=TextSubstitution(text="camera/color/image_raw")
    )
    ld.add_action(raw_image_topic_arg)
    camera_info_topic_arg = DeclareLaunchArgument(
        "camera_info_topic", default_value=TextSubstitution(text="camera/color/camera_info")
    )
    ld.add_action(camera_info_topic_arg)

    aruco_marker_publisher = Node(
        package="aruco_ros",
        executable="marker_publisher",
        prefix='xterm -e',
        output='screen',
        name="aruco_marker_publisher",
        parameters=[{
            "camera_frame": LaunchConfiguration("camera_frame"),
            "reference_frame": LaunchConfiguration("reference_frame"),
            "marker_size": LaunchConfiguration("marker_size_arg"),
            "raw_image_topic": LaunchConfiguration("raw_image_topic"),
            "camera_info_topic": LaunchConfiguration("camera_info_topic"), }]
    )

    ld.add_action(aruco_marker_publisher)

    return ld

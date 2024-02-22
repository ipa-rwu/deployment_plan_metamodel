from launch import LaunchDescription
from launch.actions import DeclareLaunchArgument, IncludeLaunchDescription
from launch.launch_description_sources import PythonLaunchDescriptionSource
from launch.substitutions import (LaunchConfiguration, PathJoinSubstitution,
                                  PythonExpression, TextSubstitution)
from launch_ros.actions import Node


def generate_launch_description():
    ld = LaunchDescription()

    node_sequence_arg = DeclareLaunchArgument(
        "node_sequence", default_value=TextSubstitution(text="[bt_operator, detect_aruco_marker_action_server, moveit_skill_server, set_path_constrains_server]")
    )
    ld.add_action(node_sequence_arg)
    load_bt_plugins_arg = DeclareLaunchArgument(
        "load_bt_plugins", default_value=TextSubstitution(text="[detect_aruco_marker_client, compute_path_to_state_client, compute_path_to_pose_client, compute_path_to_point_client, execute_trajectory_client, set_path_constraints_client, get_current_ik_frame_pose_client, print_value, update_pose]")
    )
    ld.add_action(load_bt_plugins_arg)
    use_sim_time_arg = DeclareLaunchArgument(
        "use_sim_time", default_value=TextSubstitution(text="false")
    )
    ld.add_action(use_sim_time_arg)
    use_sim_time_arg = DeclareLaunchArgument(
        "use_sim_time", default_value=TextSubstitution(text="false")
    )
    ld.add_action(use_sim_time_arg)

    lifcyclenode_manager = Node(
        package="nav2_lifecycle_manager",
        executable="lifecycle_manager",
        prefix='xterm -e',
        output='screen',
        name="lifcyclenode_manager",
        parameters=[{
            "node_names": LaunchConfiguration("node_sequence"), }]
    )
    bt_operator = Node(
        package="man2_bt_operator",
        executable="bt_operator",
        prefix='xterm -e',
        output='screen',
        name="bt_operator",
        parameters=[{
            "customized_plugin_lib_names": LaunchConfiguration("load_bt_plugins"),
            "use_sim_time": LaunchConfiguration("use_sim_time"), }]
    )
    bt_skill_client_ = Node(
        package="man2_bt_skill_clients",
        executable="bt_skill_client_",
        prefix='xterm -e',
        output='screen',
        name="bt_skill_client_"
    )
    detect_aruco_marker_action_server = Node(
        package="detect_aruco_marker_skill",
        executable="detect_aruco_marker_action_server",
        prefix='xterm -e',
        output='screen',
        name="detect_aruco_marker_action_server"
    )
    moveit_skill_server = Node(
        package="moveit_skills",
        executable="moveit_skill_server_node",
        prefix='xterm -e',
        output='screen',
        name="moveit_skill_server",
        parameters=[{
            "use_sim_time": LaunchConfiguration("use_sim_time"), }]
    )
    set_path_constraints_client = Node(
        package="moveit_skills",
        executable="moveit_skill_server_node",
        prefix='xterm -e',
        output='screen',
        name="set_path_constraints_client"
    )

    ld.add_action(lifcyclenode_manager)
    ld.add_action(bt_operator)
    ld.add_action(bt_skill_client_)
    ld.add_action(detect_aruco_marker_action_server)
    ld.add_action(moveit_skill_server)
    ld.add_action(set_path_constraints_client)

    return ld

# bt_manipulation_framwork

This package has be created automatically using the [RosTooling](https://github.com/ipa320/RosTooling).


It holds the launch file to run the following nodes:
- lifcyclenode_manager
- bt_operator
- bt_skill_client_
- detect_aruco_marker_action_server
- moveit_skill_server
- set_path_constraints_client

The listed nodes offer the following connections:
- ActionServer: start_application [man2_msgs/RunApplication]
- ActionClient: detect_aruco_marker_client [detect_aruco_marker_skill/ArucoMarkerDetection]
- ActionClient: compute_path_to_state_client [moveit_skills/ComputePathToState]
- ActionClient: compute_path_to_pose_client [moveit_skills/ComputePathToPose]
- ActionClient: compute_path_to_point_client [moveit_skills/ComputePathToPoint]
- ActionClient: execute_trajectory_client [moveit_skills/ExecuteTrajectory]
- ServiceClient: set_path_constraints_client [moveit_skills/SetPathConstrains]
- ActionClient: get_current_ik_frame_pose_client [moveit_skills/GetCurrentIKFramePose]
- Subscriber: get_aruco_markers [aruco_msgs/MarkerArray]
- ActionServer: detect_aruco_marker [detect_aruco_marker_skill/ArucoMarkerDetection]
- ActionServer: compute_path_to_pose [moveit_skills/ComputePathToPose]
- ActionServer: compute_path_to_point [moveit_skills/ComputePathToPoint]
- ActionServer: compute_path_to_state [moveit_skills/ComputePathToState]
- ActionServer: execute_trajectory [moveit_skills/ExecuteTrajectory]
- ActionServer: get_current_ik_frame_pose [moveit_skills/GetCurrentIKFramePose]
- ServiceServer: set_path_constrains_server [moveit_skills/SetPathConstrains]

## Installation

### Using release

This package can be copied to a valid ROS 2 workspace. To be sure that all the related dependencies are intalles the command **rosdep install** can be used.
Then the workspace must be compiled using the common ROS 2 build command:

```
mkdir -p ros2_ws/src
cd ros2_ws/
cp PATHtoTHISPackage/bt_manipulation_framwork src/.
rosdep install --from-path src/ -i -y
colcon build
source install/setup.bash
```


### From source code
```
mkdir -p ros2_ws/src
cd ros2_ws/
git clone https://gitlab.cc-asp.fraunhofer.de/ipa326/demonstrator/bt_based_application_framework.git -b v1.0.0git clone https://gitlab.cc-asp.fraunhofer.de/ipa326/demonstrator/bt_based_application_framework.git -b v1.0.0git clone https://gitlab.cc-asp.fraunhofer.de/ipa326/demonstrator/bt_based_application_framework.git -b v1.0.0git clone https://gitlab.cc-asp.fraunhofer.de/ipa326/demonstrator/bt_based_application_framework.gitgit clone https://gitlab.cc-asp.fraunhofer.de/ipa326/demonstrator/bt_based_application_framework.git
rosdep install --from-path src/ -i -y
colcon build
source install/setup.bash
```

## Usage


To execute the launch file, the following command can be called:

```
ros2 launch bt_manipulation_framwork bt_manipulation_framwork.launch.py
```

The generated launch files requires the xterm package, it can be installed by:

```
sudo apt install xterm
```

# ur5e_cell_system

This package has be created automatically using the [RosTooling](https://github.com/ipa320/RosTooling).


It holds the launch file to run the following nodes:
- aruco_marker_publisher
- lifcyclenode_manager
- bt_operator
- bt_skill_client_
- detect_aruco_marker_action_server
- moveit_skill_server
- set_path_constraints_client
- color_pose_estimation

The listed nodes offer the following connections:

## Installation

### Using release

This package can be copied to a valid ROS 2 workspace. To be sure that all the related dependencies are intalles the command **rosdep install** can be used.
Then the workspace must be compiled using the common ROS 2 build command:

```
mkdir -p ros2_ws/src
cd ros2_ws/
cp PATHtoTHISPackage/ur5e_cell_system src/.
rosdep install --from-path src/ -i -y
colcon build
source install/setup.bash
```


### From source code
```
mkdir -p ros2_ws/src
cd ros2_ws/
git clone https://github.com/ipa-rwu/color_pose.git -b vsp/color_pose_testing_with_bt
rosdep install --from-path src/ -i -y
colcon build
source install/setup.bash
```

## Usage


To execute the launch file, the following command can be called:

```
ros2 launch ur5e_cell_system ur5e_cell_system.launch.py
```

The generated launch files requires the xterm package, it can be installed by:

```
sudo apt install xterm
```

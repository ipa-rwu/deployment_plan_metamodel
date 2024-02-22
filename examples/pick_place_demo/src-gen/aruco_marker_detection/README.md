# aruco_marker_detection

This package has be created automatically using the [RosTooling](https://github.com/ipa320/RosTooling).


It holds the launch file to run the following nodes:
- aruco_marker_publisher

The listed nodes offer the following connections:
- Subscriber: camera_image_sub [sensor_msgs/Image]

## Installation

### Using release

This package can be copied to a valid ROS 2 workspace. To be sure that all the related dependencies are intalles the command **rosdep install** can be used.
Then the workspace must be compiled using the common ROS 2 build command:

```
mkdir -p ros2_ws/src
cd ros2_ws/
cp PATHtoTHISPackage/aruco_marker_detection src/.
rosdep install --from-path src/ -i -y
colcon build
source install/setup.bash
```


### From source code
```
mkdir -p ros2_ws/src
cd ros2_ws/
git clone https://github.com/ipa-rwu/aruco_ros.git -b humble-devel
rosdep install --from-path src/ -i -y
colcon build
source install/setup.bash
```

## Usage


To execute the launch file, the following command can be called:

```
ros2 launch aruco_marker_detection aruco_marker_detection.launch.py
```

The generated launch files requires the xterm package, it can be installed by:

```
sudo apt install xterm
```

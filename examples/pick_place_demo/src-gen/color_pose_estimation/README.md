# color_pose_estimation

This package has be created automatically using the [RosTooling](https://github.com/ipa320/RosTooling).


It holds the launch file to run the following nodes:
- color_pose_estimation


## Installation

### Using release

To launch this system there is already an existing package that contains the launch file.

The package can be easily installed with the following command:

```
sudo apt install ros-ROSDISTRO-color-pose-estimation
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

To launch this system there is already an existing package that contains the launch file. It can be started by:

```
ros2 launch color_pose_estimation color_pose_estimation_scene.launch.py
```

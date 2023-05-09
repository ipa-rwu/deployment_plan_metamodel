.. _tavEnv_config:

#################################
Target Environment Configuration
#################################


Check device configurations
#################################

* Configured properties for Device: "rwu_laptop":

  .. list-table:: Configured properties for Device: "rwu_laptop"

    * - property name
      - value

    * - os_name
      - ubuntu
    * - os_version
      - focal
    * - processor_architecture
      - x86

* Configured properties for Device: "arm":

  .. list-table:: Configured properties for Device: "arm"

    * - property name
      - value

    * - device_type
      - UR5E

* Configured properties for Device: "gripper":

  There are no properties defined for Device: "gripper"
* Configured properties for Device: "camera_realsense":

  .. list-table:: Configured properties for Device: "camera_realsense"

    * - property name
      - value

    * - device_type
      - D435


Check communication connection between devices
###############################################

* arm, gripperand are connected via **Io_tip**

* arm, rwu_laptopand are connected via **Ethernet**

* rwu_laptop, camera_realsenseand are connected via **Usb_01**


Check configurations for Device: "rwu_laptop" are as follows:

  For Ethernet:

  .. code-block::

     IP address: 192.168.56.1
     Subnet mask: 255.255.255.0
     gateway: 192.168.56.1
     DNS server: 0.0.0.0



  For USB_01:

  .. code-block::

     Volumes:
       - /dev/video2
       - /dev/video3
       - /dev/video4
       - /dev/video5
       - /dev/video6
       - /dev/video7
Check configurations for Device: "arm" are as follows:



  For Ethernet:

  .. code-block::

     IP address: 192.168.56.2
     Subnet mask: 255.255.255.0
     gateway: 192.168.56.1
     DNS server: 0.0.0.0

Check configurations for Device: "gripper" are as follows:


Check configurations for Device: "camera_realsense" are as follows:

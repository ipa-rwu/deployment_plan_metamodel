package de.fraunhofer.ipa.deployment.generator

import java.util.Set
import java.util.stream.Collectors
import targetEnvironment.ComputationDeviceInstance
import targetEnvironment.TargetDeployEnviroment
import deploymentPlan.AbstractDeploymentPlan
import javax.inject.Inject
import targetEnvironment.DeviceInstance
import deploymentPlan.ConfigSoftwareComponent
import implementationDescription.SoftwareComponent
import deployPlanWithRosModel.ConfigRosSoftwareComponent
import system.RosSystem
import java.util.Map
import deploymentPlan.AbstractComputationAssignment
import java.util.List
import de.fraunhofer.ipa.deployment.util.NetworkCommunicationType
import targetEnvironment.ConnectedDevice
import device.NetworkConnection
import device.UsbConnection
import java.util.ArrayList

class DeploymentDocumentCompiler {

@Inject
extension DeploymentHelper

def deploymentIntroduction(AbstractDeploymentPlan plan, String overviewFileName, Map<AbstractComputationAssignment, List<RepoInfo>> repoMap)'''
.. _«overviewFileName.substring(0, overviewFileName.lastIndexOf('.'))»:

############################
Deployment overview
############################

This documentation is about deploying a software system consisting of
    «plan.realize.realizations.stream.map[softwareComponents].
    collect(Collectors.toList).flatten.map[component|getAbstarctConfigSoftwareComponentName(component)]
    .toList.stream.collect(Collectors.joining("\n* ","* ", ""))»
  to a target environment including devices as follows:

  «FOR dev : plan.deployTo.includeDevice»
  * «dev.name» (type: «dev.abstractDeviceInstanceType.name»)
  «ENDFOR»

  The sources of components are as follows:
  «FOR component : plan.realize.realizations.stream.map[softwareComponents].collect(Collectors.toList).flatten»
  «IF component instanceof ConfigSoftwareComponent && (component as ConfigSoftwareComponent).component instanceof SoftwareComponent»
  «var software = ((component as ConfigSoftwareComponent).component as SoftwareComponent)»

  «var repo_info = getRepoInfo(software)»
  «software.name»:

  .. list-table:: «software.name»

    * - component name
      - repository
      - version

    * - «software.name»
      - «repo_info.url»
      - «repo_info.version»
  «ENDIF»
«ENDFOR»
  «IF repoMap !== null»
  «FOR entrySet: repoMap.entrySet»
  «entrySet.key.name»:

  .. list-table:: «entrySet.key.name»

    * - component name
      - repository
      - version

    «FOR repo_info: entrySet.value»
    * - «repo_info.name»
      - «repo_info.url»
      - «repo_info.version»
«ENDFOR»

«ENDFOR»
«ENDIF»

'''

def targetEnvriomentDescription(TargetDeployEnviroment tarEnv, String targetEnvConfigFileName)'''
.. _«targetEnvConfigFileName.substring(0, targetEnvConfigFileName.lastIndexOf('.'))»:

#################################
Target Environment Configuration
#################################


Check device configurations
#################################

«FOR dev : tarEnv.includeDevice»
* Configured properties for Device: "«dev.name»":

  «IF dev.configDeviceProperty.size > 0»
  .. list-table:: Configured properties for Device: "«dev.name»"

    * - property name
      - value

    «FOR property: dev.configDeviceProperty»
    * - «property.name»
      - «property.value.valueFromPropertyValue»
    «ENDFOR»

  «ELSE»
  There are no properties defined for Device: "«dev.name»"
  «ENDIF»
«ENDFOR»

Check communication connection between devices
###############################################

«FOR connection: tarEnv.configConnections»
«connection.connectDevice.map[deviceInstance | deviceInstance.refDevice.name]
.stream.collect(Collectors.joining(", ", "* ", "and"))» are connected via **«connection.connectDevice.get(0).refConnection.name.toFirstUpper»**

«ENDFOR»

«FOR dev : tarEnv.includeDevice»
Check configurations for Device: "«dev.name»" are as follows:
«var connectedDevices = getConnectedDeviceFomTargetEnv(tarEnv, dev)»
  «FOR connectedDevice: connectedDevices»

  «IF connectedDevice.refConnection instanceof NetworkConnection»
  For «connectedDevice.refConnection.name.toFirstUpper»:

  «createConfigForNetworkCommunication(connectedDevice)»
  «ENDIF»

  «IF connectedDevice.refConnection instanceof UsbConnection &&
    getDeviceVolumes(connectedDevice) !== null &&
    getDeviceVolumes(connectedDevice).size > 0»
  For «connectedDevice.refConnection.name.toUpperCase»:

  «createConfigForUsbCommunication(connectedDevice)»
  «ENDIF»
«ENDFOR»
«ENDFOR»
'''

def createConfigForNetworkCommunication(ConnectedDevice connectDev)'''
«var netInfo = parserNetworkInfo(connectDev)»
.. code-block::

   IP address: «netInfo.address»
   Subnet mask: «netInfo.netmask»
   gateway: «netInfo.gateway»
   DNS server: 0.0.0.0
'''

def createConfigForUsbCommunication(ConnectedDevice connectDev)'''
«var volumes = getDeviceVolumes(connectDev)»
«IF volumes !== null»
.. code-block::

   Volumes:
     «FOR volume: volumes»
     - «volume.valueFromPropertyValue»
   «ENDFOR»
«ENDIF»
'''

def ansibleInstruction(TargetDeployEnviroment tarEnv, String ansibleDocumentName)'''
.. _«ansibleDocumentName.substring(0, ansibleDocumentName.lastIndexOf('.'))»:

############################
Setup Ansible
############################

Ansible automates the management of remote systems and controls their desired state.
A basic Ansible environment has three main components:


Control node
   A system on which Ansible is installed.
   You run Ansible commands such as ``ansible`` or ``ansible-inventory`` on a control node.

Managed node
   A remote system, or host, that Ansible controls.

Inventory
   A list of managed nodes that are logically organized.
   You create an inventory on the control node to describe host deployments to Ansible.

If you did not install Ansible yet, you can install it as follows:

#. Install Ansible:

   .. code-block:: bash

      python3 -m pip install --user ansible

#. Fill an inventory by adding the IP address, username (default ``anisble``) and also add IP address in ``/etc/ansible/hosts``.
   The following example adds the IP addresses of three virtual machines in KVM:

#. Verify the hosts in your inventory.

   .. code-block:: bash

      ansible all --list-hosts

#. Set up SSH connections so Ansible can connect to the managed nodes.

   a. Add your public SSH key to the ``authorized_keys`` file (path: ``.ssh/authorized_keys``) on each remote system as follow:

      «FOR compDev: tarEnv.includeDevice.stream.filter[it instanceof ComputationDeviceInstance].collect(Collectors.toList)»
      * «compDev.name»
      «ENDFOR»

   b. Test the SSH connections, for example:

   .. code-block:: bash

      ssh username@192.0.2.50

   If the username on the control node is different on the host, you need to pass the ``-u`` option with the ``ansible`` command.

#. Ping the managed nodes.

   .. code-block:: bash

      ansible all -m ping

«ansibleInstructionAddSecret(tarEnv)»

#. Start application.

   .. code-block:: bash

      ansible-playbook -i inventory.yaml playbook.yaml --ask-vault-pass «
      »«FOR compDev: tarEnv.includeDevice.stream.filter[it instanceof ComputationDeviceInstance].collect(Collectors.toList)»«
      »--extra-vars '@vars/«compDev.name»/passwords.yml' --verbose
      «ENDFOR»
'''

def ansibleInstructionAddSecret(TargetDeployEnviroment tarEnv)'''
#. Add and encrypt "sudo passward"

    To run containers with docker, we need to ensure docker is installed in each remote system.
    Therefore, it needs ''sudo password'' to perform that. ''sudo password'' will be encrypted!

    To do so, you can run:

   .. code-block:: bash

      «FOR compDev: tarEnv.includeDevice.stream.filter[it instanceof ComputationDeviceInstance].collect(Collectors.toList)»
      ansible-vault create vars/«compDev.name»/passwords.yml

      «ENDFOR»

    It requires you to provide a password that you will use to edit your passwords.

    After creating files, now you provide your ''sudo password'' by

   .. code-block:: bash

      «FOR compDev: tarEnv.includeDevice.stream.filter[it instanceof ComputationDeviceInstance].collect(Collectors.toList)»
      ansible-vault edit vars/«compDev.name»/passwords.yaml

      «ENDFOR»

    In each file, you need to enter as follows:

   .. code-block:: bash

      «FOR compDev: tarEnv.includeDevice.stream.filter[it instanceof ComputationDeviceInstance].collect(Collectors.toList)»
      «compDev.name»_sudo: "sudo password"

      «ENDFOR»
'''

def mainIndex(Set<String> files)'''
Deployment documentation
====================================

.. toctree::
   :maxdepth: 2
   :caption: ReadMe
   :glob:

   «FOR file: files»
   «file»
«ENDFOR»
'''

def confPy(String planName)'''
# Configuration file for the Sphinx documentation builder.
#
# For the full list of built-in configuration values, see the documentation:
# https://www.sphinx-doc.org/en/master/usage/configuration.html

# -- Project information -----------------------------------------------------
# https://www.sphinx-doc.org/en/master/usage/configuration.html#project-information

project = 'Deployment Documentation for "«planName»"'
copyright = '2023, Fraunhofer IPA'
author = 'Auto-gen'

# -- General configuration ---------------------------------------------------
# https://www.sphinx-doc.org/en/master/usage/configuration.html#general-configuration

extensions = []

templates_path = ['_templates']
exclude_patterns = []


# -- Options for HTML output -------------------------------------------------
# https://www.sphinx-doc.org/en/master/usage/configuration.html#options-for-html-output

html_theme = 'alabaster'
html_static_path = ['_static']

'''

def makeBat()'''
@ECHO OFF

pushd %~dp0

REM Command file for Sphinx documentation

if "%SPHINXBUILD%" == "" (
    set SPHINXBUILD=sphinx-build
)
set SOURCEDIR=source
set BUILDDIR=build

%SPHINXBUILD% >NUL 2>NUL
if errorlevel 9009 (
    echo.
    echo.The 'sphinx-build' command was not found. Make sure you have Sphinx
    echo.installed, then set the SPHINXBUILD environment variable to point
    echo.to the full path of the 'sphinx-build' executable. Alternatively you
    echo.may add the Sphinx directory to PATH.
    echo.
    echo.If you don't have Sphinx installed, grab it from
    echo.https://www.sphinx-doc.org/
    exit /b 1
)

if "%1" == "" goto help

%SPHINXBUILD% -M %1 %SOURCEDIR% %BUILDDIR% %SPHINXOPTS% %O%
goto end

:help
%SPHINXBUILD% -M help %SOURCEDIR% %BUILDDIR% %SPHINXOPTS% %O%

:end
popd

'''

def localBuildScript()'''
#!/bin/sh
IMAGE=ghcr.io/ipa-rwu/latex_builder:latest
exec docker run --rm -i --user="$(id -u):$(id -g)" --net=none -v "$PWD/build/latex":/data "$IMAGE" "$@"

'''
}

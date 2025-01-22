package de.fraunhofer.ipa.deployment.generator

import deploymentPlan.AbstractDeploymentPlan
import targetEnvironment.TargetDeployEnviroment
import targetEnvironment.ComputationDeviceInstance
import java.util.stream.Collectors
import jakarta.inject.Inject

class AnsibleCompiler {

@Inject
extension DeploymentHelper

def ansibleConfig()'''
[defaults]
host_key_checking = False
private_key_file = ~/.ssh/id_ed25519
inventory = inventory.yaml
deprecation_warnings=False
'''

def inventory(TargetDeployEnviroment tarEnv)'''
«tarEnv.name»:
  hosts:
    «FOR compDev: tarEnv.includeDevice.stream.filter[it instanceof ComputationDeviceInstance].collect(Collectors.toList)»
    «compDev.name»:
      ansible_host: #TODO: IP
      ansible_user: ansible #UserName
«ENDFOR»
'''

def playbook(AbstractDeploymentPlan plan, AnsibleNamingHelper ansibleNaming)'''
«{ansibleNaming.relativeAnsibleFolderPath = plan.name; ""}»
«var assPerExecutors = collectAssignmentPerExecutor(plan.realize.realizations)»
«FOR entryset: assPerExecutors.entrySet()»
«var compDev = entryset.key»
- name: «plan.name»_«compDev.name»
  hosts: «compDev.name»
  vars:
    docker_compose_dir: «compDev.name»
    ori_docker_compose_dir_path: "../{{ docker_compose_dir }}"
    «{ansibleNaming.setDestDeployFolderPath("{{ ansible_user }}", plan.name); ""}»
    dest_docker_compose_dir_path: "«ansibleNaming.destDeployFolderPath»/{{ docker_compose_dir }}"
    ansible_become_pass: "{{ «compDev.name»_sudo }}"
  roles:
    - common
    - «ansibleNaming.appicationRoleName»
«ENDFOR»
'''

def playbook_deploy_files(AbstractDeploymentPlan plan, AnsibleNamingHelper ansibleNaming)'''
«{ansibleNaming.relativeAnsibleFolderPath = plan.name; ""}»
«var assPerExecutors = collectAssignmentPerExecutor(plan.realize.realizations)»
«FOR entryset: assPerExecutors.entrySet()»
«var compDev = entryset.key»
- name: «plan.name»_«compDev.name»
  hosts: «compDev.name»
  vars:
    docker_compose_dir: «compDev.name»
    ori_docker_compose_dir_path: "../{{ docker_compose_dir }}"
    «{ansibleNaming.setDestDeployFolderPath("{{ ansible_user }}", plan.name); ""}»
    dest_docker_compose_dir_path: "«ansibleNaming.destDeployFolderPath»/{{ docker_compose_dir }}"
  roles:
    - deploy_files
«ENDFOR»
'''

def playbook_start_components(AbstractDeploymentPlan plan, AnsibleNamingHelper ansibleNaming)'''
«{ansibleNaming.relativeAnsibleFolderPath = plan.name; ""}»
«var assPerExecutors = collectAssignmentPerExecutor(plan.realize.realizations)»
«FOR entryset: assPerExecutors.entrySet()»
«var compDev = entryset.key»
- name: «plan.name»_«compDev.name»
  hosts: «compDev.name»
  vars:
    docker_compose_dir: «compDev.name»
    ori_docker_compose_dir_path: "../{{ docker_compose_dir }}"
    «{ansibleNaming.setDestDeployFolderPath("{{ ansible_user }}", plan.name); ""}»
    dest_docker_compose_dir_path: "«ansibleNaming.destDeployFolderPath»/{{ docker_compose_dir }}"
«««    ansible_become_pass: "{{ «compDev.name»_sudo }}"
  roles:
    - common
    - start_components
«ENDFOR»
'''


def taskDeployFiles(NamingHelper naming)'''
- name: Make sure docker-compose file is present
  ansible.builtin.stat:
    path: "{{ ori_docker_compose_dir_path }}/{{ item }}"
  loop:
    - «naming.cyclonConfigFileName»
    - «naming.dockerComposeFileName»

- name: Make sure destination dir exists
  ansible.builtin.stat:
    path: "{{ dest_docker_compose_dir_path }}"

- name: Copy compose files
  ansible.builtin.copy:
    src: "{{ ori_docker_compose_dir_path }}/{{ item }}"
    dest: "{{ dest_docker_compose_dir_path }}/{{ item }}"
    owner: "{{ ansible_user }}"
    group: "{{ ansible_user }}"
    mode: "0644"
  loop:
    - «naming.cyclonConfigFileName»
    - «naming.dockerComposeFileName»

- name: Debug output
  ansible.builtin.debug:
    var: output
'''

def taskStartApplication(NamingHelper naming)'''
- name: Make sure docker-compose file is present
  ansible.builtin.stat:
    path: "{{ ori_docker_compose_dir_path }}/{{ item }}"
  loop:
    - «naming.cyclonConfigFileName»
    - «naming.dockerComposeFileName»

- name: Make sure destination dir exists
«««  become: true
  file:
    path: "{{ dest_docker_compose_dir_path }}"
    state: directory
    owner: "{{ ansible_user }}"
    group: "{{ ansible_user }}"

- name: Copy compose files
  ansible.builtin.copy:
    src: "{{ ori_docker_compose_dir_path }}/{{ item }}"
    dest: "{{ dest_docker_compose_dir_path }}/{{ item }}"
    owner: "{{ ansible_user }}"
    group: "{{ ansible_user }}"
    mode: "0644"
  loop:
    - cyclonedds.xml
    - docker-compose.yaml

- name: Tear down existing services
  community.general.docker_compose:
    project_src: "{{ dest_docker_compose_dir_path }}"
    stopped: true
    state: present

- name: Create and start services
  community.general.docker_compose:
    project_src: "{{ dest_docker_compose_dir_path }}"
    pull: true
  register: output

- name: Debug output
  ansible.builtin.debug:
    var: output
'''

def taskStartComponents(AbstractDeploymentPlan plan, NamingHelper naming)'''
- name: Make sure docker-compose file is present
  ansible.builtin.stat:
    path: "{{ ori_docker_compose_dir_path }}/{{ item }}"
  loop:
    - «naming.cyclonConfigFileName»
    - «naming.dockerComposeFileName»

- name: Make sure destination dir exists
  become: true
  file:
    path: "{{ dest_docker_compose_dir_path }}"
    state: directory
    owner: "{{ ansible_user }}"
    group: "{{ ansible_user }}"

- name: Copy compose files
  ansible.builtin.copy:
    src: "{{ ori_docker_compose_dir_path }}/{{ item }}"
    dest: "{{ dest_docker_compose_dir_path }}/{{ item }}"
    owner: "{{ ansible_user }}"
    group: "{{ ansible_user }}"
    mode: "0644"
  loop:
    - cyclonedds.xml
    - docker-compose.yaml

«var assPerExecutors = collectAssignmentPerExecutor(plan.realize.realizations)»
«FOR entryset: assPerExecutors.entrySet()»
«var compDev = entryset.key»
«var ass_list = entryset.value»
«FOR ass: ass_list»
- name: Tear down existing "«ass.name»" service
  community.general.docker_compose:
    project_src: "{{ dest_docker_compose_dir_path }}"
    stopped: true
    state: present
    services:
      - «ass.name»
  tags:
    - stop_service
    - «ass.name»
    - «compDev.name»
  register: output

- name: Create and start "«ass.name»" service
  community.general.docker_compose:
    project_src: "{{ dest_docker_compose_dir_path }}"
    pull: true
    services:
      - «ass.name»
  tags:
    - start_service
    - «ass.name»
    - «compDev.name»
  register: output

«ENDFOR»
«ENDFOR»
- name: Debug output
  ansible.builtin.debug:
    var: output
«" "»
'''

def taskCheckSudo()'''
- name: check_become_permission
  become: true
  command: id -u
  register: id_output
'''

def taskRunCommonTasks(AnsibleNamingHelper ansibleNaming)'''
- include_tasks: «ansibleNaming.taskCheckSudoFileName»
- include_tasks: «ansibleNaming.taskInstallDockerFileName»
'''

def taskCheckInstallDocker()'''
- name: Check If Docker Is Installed
  command: docker --version
  register: docker_valid
  ignore_errors: true

- name: Remove files
  become: true
  ansible.builtin.file:
    state: absent
    path: "{{ item }}"
  with_items:
    - /etc/apt/keyrings/docker.gpg
    - /etc/apt/sources.list.d/docker.list
    - /etc/apt/sources.list.d/download_docker_com_linux_ubuntu.list
  when: docker_valid.failed

- name: Install dependencies
  apt:
    name: "{{ packages }}"
    state: present
    update_cache: yes
  vars:
    packages:
      - apt-transport-https
      - ca-certificates
      - curl
      - software-properties-common
      - gnupg-agent
  become: true
  when: docker_valid.failed

- name: Import PGP key
  become: true
  apt_key:
    url: "https://download.docker.com/linux/{{ ansible_distribution | lower }}/gpg"
    state: present
  when: docker_valid.failed

- name: Add Docker repository
  become: true
  apt_repository:
    repo: "deb [arch=amd64] https://download.docker.com/{{ ansible_system | lower }}/{{ ansible_distribution | lower }} {{ ansible_distribution_release }} stable"
    state: present
    update_cache: yes
    mode: 0644
    validate_certs: yes
  when: docker_valid.failed

- name: Install Docker-CE
  become: true
  apt:
    name: "{{ item }}"
    state: latest
    autoclean: yes
    cache_valid_time: 86400
  loop:
    - docker-ce
    - docker-ce-cli
    - containerd.io
  when: docker_valid.failed

- name: Ensure user is in Docker group
  become: true
  user:
    name: "{{ ansible_user }}"
    groups: docker
    append: yes
  when: docker_valid.failed

- name: Ensure Docker dependensies are installed
  ansible.builtin.pip:
    name:
      - docker
      - docker-compose
  when: docker_valid.failed

- name: Install python3-docker
  ansible.builtin.apt:
    name: python3-docker
    state: present

- name: Ensure docker-compose are installed
  ansible.builtin.pip:
    name:
      - docker-compose
    state: present
«""»
'''

    def gitignore()'''
    vars/**/passwords.yaml
    inventory.yaml
    '''

}

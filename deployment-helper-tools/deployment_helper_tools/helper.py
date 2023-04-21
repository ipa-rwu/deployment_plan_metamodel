# coding:utf-8

import subprocess

import rosinstall_generator.distro as distro


def get_packages_repo(distro_name):
    ros_distro = distro.get_distro(distro_name)
    pkg_names = distro.get_package_names(ros_distro)
    for pkg_name in pkg_names[0]:
        pkg = ros_distro.release_packages[pkg_name]
        repo = ros_distro.repositories[pkg.repository_name].source_repository
        try:
            yield pkg_name, repo.url, repo.version
        except AttributeError as exc:
            pass


def get_package_repo(pkg_name: str, distro_name: str):
    for name, url, version in get_packages_repo(distro_name):
        if pkg_name == name:
            print(url, version)
            return pkg_name, url, version
    else:
        raise KeyError(f"Couldn't find released package for '{pkg_name}'")


def get_packages_repos(pkg_name: list, distro_name: str):
    tmp = []
    for name, url, version in get_packages_repo(distro_name):
        if name in pkg_name:
            tmp.append(name)
            print(name, url, version)
            # yield name, url, version
    not_found = [x for x in pkg_name if x not in tmp]
    if len(not_found) > 0:
        raise KeyError(f"Couldn't find released package for '{not_found}'")

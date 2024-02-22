#!/usr/bin/env python

from setuptools import find_packages, setup

setup(
    name="deployment_helper_tools",
    version="0.0.1",
    description="python functions that using in deployment toolchain",
    packages=find_packages("rosinstall_generator"),
    include_package_data=True,
    install_requires=["rosinstall_generator"],
    license="Apache License, Version 2.0",
    python_requires=">=3.6",
    entry_points={"console_scripts": [
        "dhelp = deployment_helper_tools.cli:main"]},
)

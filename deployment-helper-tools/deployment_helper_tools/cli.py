import argparse

from deployment_helper_tools.helper import get_package_repo, get_packages_repos

ROS_DISTRO = ['neotic', 'foxy', 'galactic', 'rolling', 'humble']


def main():
    """CLI entry point."""
    parser = argparse.ArgumentParser(
        description="Helper function for generating deployment artifacts")

    subparsers = parser.add_subparsers(dest='command', help='Commands to run')
    get_repo_parser = subparsers.add_parser("repo")

    get_repo_parser.add_argument(
        '--ros-distro',
        '-d',
        help="ROS distro",
        required=True,
        choices=ROS_DISTRO
    )

    get_repo_parser.add_argument(
        '--package',
        '-pkg',
        nargs='+',
        help="Package name",
        required=True
    )
    args = parser.parse_args()

    if args.command == 'repo':
        get_packages_repos(args.package, args.ros_distro)

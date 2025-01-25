package de.fraunhofer.ipa.deployment.toolbar.utils;

import deployPlanWithRosModel.DeployRossystemPlan

class OtherTemplates {
  def generatePrecommitConfig()'''
# To use:
#
#     pre-commit run -a
#
# Or:
#
#     pre-commit install  # (runs every time you commit in git)
#
# To update this file:
#
#     pre-commit autoupdate
#
# See https://github.com/pre-commit/pre-commit

repos:
  - repo: https://github.com/Lucas-C/pre-commit-hooks
    rev: v1.5.5
    hooks:
      - id: forbid-crlf
      - id: remove-crlf
      - id: forbid-tabs
      - id: remove-tabs
        args: [--whitespaces-count, "2"] # defaults to: 4
        files: \.(mach|skill|agent|ros|ros2|rossystem|capa|agentin)$
      - id: remove-tabs
        args: [--whitespaces-count, "4"] # defaults to: 4
        exclude: \.(mach|skill|agent|ros|ros2|rossystem|capa|agentin)$
      - id: chmod
        args: ["644"]
        files: \.md$
      - id: insert-license
        files: \.groovy$
        args:
          - --license-filepath
          - src/license_header.txt # defaults to: LICENSE.txt
          - --comment-style
          - // # defaults to:  #
          - --use-current-year
          - --no-extra-eol # see below

  # Standard hooks
  - repo: https://github.com/pre-commit/pre-commit-hooks
    rev: v5.0.0
    hooks:
      - id: check-added-large-files
      - id: check-case-conflict
      - id: check-json
      - id: check-merge-conflict
      - id: check-symlinks
      - id: check-yaml
        args: ["--unsafe"]
        files: \.(mach|skill|agent|ros|ros2|rossystem|capa)$
        exclude: "ci/gitlab_templates/JOB_TEMPLATE.yml"
      - id: debug-statements
      - id: destroyed-symlinks
      - id: detect-private-key
      - id: end-of-file-fixer
      - id: mixed-line-ending
      - id: pretty-format-json
      - id: trailing-whitespace

  - repo: https://github.com/codespell-project/codespell
    rev: v2.3.0
    hooks:
      - id: codespell
        args:
          [
            "--write-changes",
            "--ignore-words=.codespell_words",
            '--skip="*.eps"',
          ]
        exclude: CHANGELOG.rsts

'''

def generateCodeSpell()'''
nextgen

'''

def generateGitIgnore()'''
.vscode

'''
def generateRunBash()'''
#!/bin/bash

# Function to check if pre-commit is installed, and install if not
install_pre_commit() {
    if ! command -v pre-commit &> /dev/null; then
        echo "pre-commit is not installed. Installing it now..."
        pip install pre-commit
        if [ $? -ne 0 ]; then
            echo "Failed to install pre-commit. Please install it manually."
            exit 1
        fi
        echo "pre-commit installed successfully."
    fi
}

# Function to check if git is installed, and install if not
install_git() {
    if ! command -v git &> /dev/null; then
        echo "git is not installed. Please install git and try again."
        exit 1
    fi
}

# Function to check if pre-commit is initialized
check_pre_commit_initialized() {
    if [ ! -f .pre-commit-config.yaml ]; then
        echo ".pre-commit-config.yaml not found. Please initialize pre-commit using 'pre-commit install' and configure it."
        exit 1
    fi
}

# Function to check if it's a git repository, if not, initialize it
check_git_repo() {
    if [ ! -d .git ]; then
        echo "Not a git repository. Initializing git repository..."
        git init -b main
        if [ $? -ne 0 ]; then
            echo "Failed to initialize git repository. Please check your Git installation."
            exit 1
        fi
    fi
}

# Main script execution
install_git
install_pre_commit
check_git_repo
check_pre_commit_initialized

git add .
# Run pre-commit hooks on all files
pre-commit run --all-files

'''

def generateCopyfilesBash()'''
#!/bin/bash

# Define the source and destination directories
NEW_CONTROL_FLOW_DIR="nextgen/control_flow"

# Ensure the new control flow directory exists, create it if it doesn't
if [[ ! -d "$NEW_CONTROL_FLOW_DIR" ]]; then
    echo "The new control flow directory does not exist. Creating it now..."
    mkdir -p "$NEW_CONTROL_FLOW_DIR"
fi

# Function to find the .mach file in the root of the existing control flow directory
find_mach_file() {
    local mach_file=$(find "." -maxdepth 1 -type f -name "*.mach")
    if [[ -z "$mach_file" ]]; then
        echo "No .mach file found in the root of the existing control flow directory."
        exit 1
    fi
    echo "$mach_file"
}

# Function to get the machine name from the .mach file (first line without ":")
get_machine_name() {
    local mach_file="$1"
    local machine_name=$(head -n 1 "$mach_file" | cut -d ':' -f 1 | xargs)
    echo "$machine_name"
}

# Locate the .mach file and get the machine name
MACH_FILE=$(find_mach_file)
MACHINE_NAME=$(get_machine_name "$MACH_FILE")
echo "Machine Name: $MACHINE_NAME"

EXISTING_CONTROL_FLOW_DIR="src-gen/$MACHINE_NAME/control_flow"

# Ensure required directories exist
if [[ ! -d "$NEW_CONTROL_FLOW_DIR" || ! -d "$EXISTING_CONTROL_FLOW_DIR" ]]; then
    echo "Both new and existing control flow directories must be specified and exist."
    exit 1
fi

# Extract station names from the .mach file
stations=$(grep -oP 'station_\K\w+' "$MACH_FILE" | sort -u)

# Print out extracted station names for debugging
echo "Extracted stations:"
if [[ -z "$stations" ]]; then
    echo " - None found"
else
    for station in $stations; do
        echo " - $station"
    done
fi

# Create rsync exclude patterns for the extracted station names
exclude_patterns=()
preserved_files=()
for station in $stations; do
    exclude_patterns+=("--exclude=${station}/${station}-*.xml")

    # Find the process XML files that are being preserved
    preserved=$(find "$EXISTING_CONTROL_FLOW_DIR/$station" -name "${station}-*.xml" 2>/dev/null)
    if [[ -n "$preserved" ]]; then
        preserved_files+=("$preserved")
    fi
done

# Print out the rsync command for debugging
echo "Rsync command will be executed as follows:"
if [[ ${#exclude_patterns[@]} -gt 0 ]]; then
    echo "rsync -av --ignore-existing ${exclude_patterns[*]} \"$NEW_CONTROL_FLOW_DIR/\" \"$EXISTING_CONTROL_FLOW_DIR/\""
else
    echo "rsync -av \"$NEW_CONTROL_FLOW_DIR/\" \"$EXISTING_CONTROL_FLOW_DIR/\""
fi

# Check if any exclude patterns exist
if [[ ${#exclude_patterns[@]} -gt 0 ]]; then
    # Use rsync to copy files without overriding existing station process XMLs
    rsync -av --ignore-existing "${exclude_patterns[@]}" "$EXISTING_CONTROL_FLOW_DIR/" "$NEW_CONTROL_FLOW_DIR/"
else
    # No station-specific files to preserve, so copy everything
    rsync -av "$EXISTING_CONTROL_FLOW_DIR/" "$NEW_CONTROL_FLOW_DIR/"
fi

# Print preserved process XML files
echo "Preserved process XML files:"
if [[ ${#preserved_files[@]} -eq 0 ]]; then
    echo " - None found. Copied all files."
else
    for file in "${preserved_files[@]}"; do
        echo " - $file"
    done
fi

# Print status
echo "New control flow copied. Existing station process XML files are preserved."

'''

def generateReadme(DeployRossystemPlan plan)'''
# Deployment Models of «plan.name»

'''

}

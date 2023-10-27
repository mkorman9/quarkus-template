# Quarkus project template

Quick setup

```sh
git clone git@github.com:mkorman9/quarkus-template.git && rm -rf quarkus-template/.git quarkus-template/README.md
```

`create-quarkus-project` script

```sh
#!/usr/bin/env bash

PROJECT_NAME="$1"

if [[ -z "$PROJECT_NAME" ]]; then
  echo "usage: create-quarkus-project <PROJECT_NAME>"
  exit 1
fi

git clone git@github.com:mkorman9/quarkus-template.git "${PROJECT_NAME}" && \
  rm -rf "${PROJECT_NAME}/.git" "${PROJECT_NAME}/README.md" && \
  sed -i "s/quarkus-template-project/${PROJECT_NAME}/g" "${PROJECT_NAME}/pom.xml"

```

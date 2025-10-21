#!/bin/bash
# Скрипт - пример последовательности команд для выполнения лабораторной работы

git config --global user.name "Ваше Имя"
git config --global user.email "you@example.com"

git init
git add .gitignore README.md CHANGELOG.md src/
git commit -m "v0.0 - initial project structure and files"

git checkout -b feature/models
git add src/model
git commit -m "add model classes: Product, Category, Customer"

git checkout -b feature/main
git add src/Main.java
git commit -m "add Main with search and filter demo"

git checkout main
git merge --no-ff feature/models -m "merge models"
git merge --no-ff feature/main -m "merge main logic"

git tag v0.1

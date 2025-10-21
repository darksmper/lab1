# Отчёт по лабораторной работе №1 — Системы контроля версий (Git)
**Вариант:** 5 — Интернет-магазин  
**Язык:** Java  
**IDE:** IntelliJ IDEA

## 1. Цель и задачи работы
- Изучить возможности Git: инициализация репозитория, ветвления, теги, разрешение конфликтов, откат изменений.
- Реализовать простое приложение на Java и оформить репозиторий (README, CHANGELOG, .gitignore).
- Подготовить отчёт с историей команд и скриншотами ключевых этапов.

## 2. Краткое описание ПО
Небольшая модель интернет-магазина с сущностями: `Product`, `Category`, `Customer`.
Программа демонстрирует:
- поиск товаров по категории;
- фильтрацию покупателей по сумме покупок.

## 3. Структура проекта
```
OnlineStore/
├── .gitignore
├── README.md
├── CHANGELOG.md
└── src/
    ├── model/
    │   ├── Product.java
    │   ├── Category.java
    │   └── Customer.java
    └── Main.java
```

## 4. История команд (пример для выполнения в терминале)
```bash
# Установка/настройка (однократно)
git config --global user.name "Ваше Имя"
git config --global user.email "you@example.com"

# Инициализация репозитория
git init

# Добавление .gitignore, README и начального кода
git add .gitignore README.md CHANGELOG.md src/
git commit -m "v0.0 - initial project structure and files"

# Создание ветки для разработки функционала
git checkout -b feature/models
# (внесены изменения: добавлены модели)
git add src/model
git commit -m "add model classes: Product, Category, Customer"

# Создание ветки для UI/логики
git checkout -b feature/main
# (внесены изменения: Main.java)
git add src/Main.java
git commit -m "add Main with search and filter demo"

# Слияние в основную ветку
git checkout main
git merge --no-ff feature/models -m "merge models"
git merge --no-ff feature/main -m "merge main logic"

# Тегирование версии
git tag v0.1

# Создание удалённого репозитория (на GitHub) и отправка
git remote add origin git@github.com:USERNAME/OnlineStore.git
git push -u origin main --tags

# Симуляция конфликта:
# На main изменим строку в Main.java и закоммитим
git checkout -b hotfix/main-edit
# (изменить строку и закоммитить)
git add src/Main.java
git commit -m "hotfix: edit output text on main"

git checkout main
# Изменить ту же самую строку по-другому и закоммитить
git add src/Main.java
git commit -m "update: modify same line to cause conflict"

# Попытка слияния вызовет конфликт
git merge hotfix/main-edit
# Разрешаем конфликт вручную в файле, затем:
git add src/Main.java
git commit -m "resolve merge conflict in Main.java"

# Примеры отката:
# Отмена локального незакоммиченного изменения
git checkout -- src/Main.java

# Отмена последнего коммита (сохранение изменений в рабочей копии)
git reset --soft HEAD~1

# Полный откат последнего коммита (удаление)
git reset --hard HEAD~1

# Создание обратного коммита (revert)
git revert <commit-hash>
```

> **Примечание:** замените `USERNAME` и `git@github.com:...` на собственные данные.

## 5. Скриншоты (что нужно приложить)
В отчёт рекомендуется добавить скриншоты:
1. Конфигурация `git config --global user.name` и `user.email`.
2. Первый коммит (`git log --oneline`).
3. Создание ветки (`git branch` / `git checkout -b`).
4. Merge с конфликтом (в IDE видно маркеры конфликта).
5. Работа с тегами (`git tag`).
6. Push в удалённый репозиторий (страница на GitHub).

В этой поставке файлы подготовлены; для получения скриншотов запустите команды и сделайте снимки экрана в вашей среде (IntelliJ/Git Bash).

## 6. Примеры выводов программы
Запустите `Main` — вы увидите список товаров в выбранной категории и покупателей с суммой покупок выше порога.

## 7. Ссылка на удалённый репозиторий
Добавьте сюда ссылку после того, как создадите репозиторий на GitHub и запушите проект.

---
Подпись: Выполнил(а) студент — ______________

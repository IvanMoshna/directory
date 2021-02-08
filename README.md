Spring boot

БД: MySQL (параметры подключения в application.properties)

dump БД: directory_db.sql (в корневом каталоге проекта)

Сборщик: Maven

Запуск сервиса:
Вариант 1: mvn spring-boot:run

Вариант 2: mvn clean package, в IDE - запуск Application

URL: http://localhost:8092/home

Добавлено 2 пользователя:
1. У админа есть права на обновление и удаления данных сотрудника. 
Username:admin
Password:admin
2. У юзера есть право добавлять нового сотрудника.
Username:user
Password:user
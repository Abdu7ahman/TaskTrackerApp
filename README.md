# 🗓️ TaskScheduler — микросервисный планировщик задач

TaskScheduler — это распределённая система для управления задачами с поддержкой email-уведомлений и отложенного выполнения.

---

## 🧩 Сервисы

| Сервис                | Описание                                                              |
|------------------------|-----------------------------------------------------------------------|
| [TaskScheduler](./TaskScheduler/README.md)      | Основной бэкенд-сервис. Управляет задачами, пользователями, ролями, комментариями. |
| [EmailSender](./EmailSender/README.md)          | Отвечает за отправку email-уведомлений о событиях внутри системы.                 |
| [SchedulerService](./SchedulerService/README.md)| Обрабатывает отложенные задачи и планирует события через брокер сообщений.         |

---

## 📦 Стек технологий

- Java 17 + Spring Boot
- PostgreSQL
- RabbitMQ
- Docker
- Maven

---

## 🚀 Быстрый старт

1. Соберите `.jar` для всех сервисов:

```bash
cd TaskScheduler && mvn clean package -DskipTests
cd ../EmailSender && mvn clean package -DskipTests
cd ../SchedulerService && mvn clean package -DskipTests

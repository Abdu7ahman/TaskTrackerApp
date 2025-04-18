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

2. Запуск проекта:
  docker-compose up --build

3. Сервисы будут досупны на:
- http://localhost:8080 — TaskScheduler
- http://localhost:8081 — SchedulerService
- http://localhost:8082 — EmailSender
- RabbitMQ: http://localhost:15672 (guest/guest)

# ⚡ Архитектура
- TaskScheduler формирует задачи.
- SchedulerService планирует отложенные события.
- EmailSender уведомляет пользователей о задачах.
- Связь между сервисами через RabbitMQ.





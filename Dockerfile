#FROM openjdk:19
#WORKDIR /app
#COPY target/*.jar /app/SecurityApp-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["java", "-jar", "SecurityApp-0.0.1-SNAPSHOT.jar"]


FROM postgres:16
# Устанавливаем переменные окружения для PostgreSQL
ENV POSTGRES_DB=jwtproj
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=postgres

# Etapa 1: construir la aplicación
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY SWParkingZone/ .
RUN mvn clean package -DskipTests

# Etapa 2: imagen final
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/SWParkingZone-0.0.1-SNAPSHOT.jar SWParkingZone.jar

# Exponer el puerto que usará la app (Render usa el puerto definido por $PORT)
EXPOSE 8087

# Comando para ejecutar la app
CMD ["java", "-jar", "SWParkingZone.jar"]

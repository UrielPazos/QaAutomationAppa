FROM openjdk:19-jdk-slim as build
WORKDIR /workspace/app
COPY build.gradle gradlew settings.gradle gradle/ ./
COPY src ./src
RUN ./gradlew build -x test
FROM openjdk:19-jdk-slim
WORKDIR /workspace/app
COPY --from=build /workspace/app/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]


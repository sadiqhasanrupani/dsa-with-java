FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY . /app

RUN javac ./Main.java -d ./classes

WORKDIR /app/classes

CMD ["java", "Main", "Main.class"]

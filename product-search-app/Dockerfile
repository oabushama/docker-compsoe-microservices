FROM maven:3.8.5-openjdk-17
RUN mkdir /app
COPY . /app
WORKDIR /app
RUN ["mvn", "package"]
EXPOSE 5000
CMD ["java", "-jar", "target/product-search-service-0.1.0.jar"]

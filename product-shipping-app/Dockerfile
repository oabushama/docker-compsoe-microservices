FROM maven:3.8.6-openjdk-18
RUN mkdir /app
COPY target/product-shipping-service-0.1.0.jar /app
WORKDIR /app
RUN ["mvn", "package"]
EXPOSE 5000
CMD ["java", "-jar", "target/product-search-service-0.1.0.jar"]

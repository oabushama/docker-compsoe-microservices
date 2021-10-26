FROM openjdk:13-alpine
RUN mkdir /app
COPY target/product-shipping-service-0.1.0.jar /app
WORKDIR /app
EXPOSE 5000
CMD ["java", "-jar", "product-shipping-service-0.1.0.jar"]

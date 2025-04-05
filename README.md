# Bank Account Microservices Demo

This project provides a practical demonstration of a microservices architecture applied to a banking scenario. It showcases best practices for structuring, managing, and deploying independent services that collaboratively fulfill banking-related operations.

## 📌 Services Overview

The application is divided into the following key components:

- **Config Service (**``**)**: Manages and centralizes application configurations.
- **Service Discovery (**``**)**: Enables dynamic registration and discovery of microservices.
- **API Gateway (**``**)**: Serves as the unified entry point for routing requests to backend services.
- **Customer Service (**``**)**: Handles customer data management.
- **Account Service (**``**)**: Manages bank accounts and transaction operations.

## 🚀 Architecture

- **Clients** interact exclusively through the **API Gateway**, which forwards requests to the appropriate service.
- Each microservice fetches configurations dynamically from the **Config Service** at startup.
- The **Service Discovery** registers each microservice, facilitating dynamic discovery and communication.
- Inter-service communication is implemented using **Feign Clients** with integrated **Circuit Breaker** patterns (using Spring Cloud Circuit Breaker/Resilience4j) to ensure resilience and fault tolerance.

## ⚙️ Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- Spring Boot

### Running Locally

1. **Start Config Service**:

   ```bash
   cd config-service
   mvn spring-boot:run
   ```

2. **Start Service Discovery**:

   ```bash
   cd discovery-service
   mvn spring-boot:run
   ```

3. **Launch API Gateway**:

   ```bash
   cd gateway-service
   mvn spring-boot:run
   ```

4. **Launch Microservices**:

   ```bash
   cd customers-service
   mvn spring-boot:run

   cd ../account-service
   mvn spring-boot:run
   ```

## 🔗 Useful Information

- Communication between microservices is handled using **Feign Clients** with **Circuit Breaker** implementation (Spring Cloud Circuit Breaker/Resilience4j) to enhance fault tolerance and resilience.
- Ensure the `config-repo` is properly configured and accessible.
- The recommended startup sequence is critical for proper service initialization.
- Consult individual service directories for detailed API endpoints and configurations.

---

Feel free to explore, modify, and extend this demo to suit your specific microservices use cases!


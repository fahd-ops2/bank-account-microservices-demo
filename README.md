# Bank Account Microservices Demo

This project provides a practical demonstration of a microservices architecture applied to a banking scenario. It showcases best practices for structuring, managing, and deploying independent services that collaboratively fulfill banking-related operations.

## 📌 Services Overview

The application is divided into the following key components:

- **Config Service (`config-service`)**: Manages and centralizes application configurations.
- **Service Discovery (`discovery-service`)**: Enables dynamic registration and discovery of microservices.
- **API Gateway (`gateway-service`)**: Serves as the unified entry point for routing requests to backend services.
- **Customer Service (`customers-service`)**: Handles customer data management.
- **Account Service (`account-service`)**: Manages bank accounts and transaction operations.

## 🚀 Architecture

- **Clients** interact exclusively through the **API Gateway**, which forwards requests to the appropriate service.
- Each microservice fetches configurations dynamically from the **Config Service** at startup.
- The **Service Discovery** registers each microservice, facilitating dynamic discovery and communication.

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

- Ensure the `config-repo` is properly configured and accessible.
- The recommended startup sequence is critical for proper service initialization.
- Consult individual service directories for detailed API endpoints and configurations.

---

Feel free to explore, modify, and extend this demo to suit your specific microservices use cases!


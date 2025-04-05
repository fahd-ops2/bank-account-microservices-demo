The `bank-account-microservices-demo` project demonstrates a microservices architecture for a banking system. It comprises several services, each responsible for specific functionalities, and utilizes key architectural components such as API Gateway, Service Discovery, and Configuration Management.

## Architecture Overview

The system is composed of the following services:

1. **Config Service (`config-service`)**: Manages the externalized configuration for all microservices. It retrieves configuration properties from a central repository (`config-repo`).

2. **Service Discovery (`discovery-service`)**: Handles the registration and discovery of microservices, enabling them to locate each other dynamically.

3. **API Gateway (`gateway-service`)**: Acts as a single entry point for clients, routing requests to the appropriate microservices and providing cross-cutting concerns like authentication and rate limiting.

4. **Customer Service (`customers-service`)**: Manages customer-related operations, including creating and retrieving customer information.

5. **Account Service (`account-service`)**: Handles account-related functionalities, such as creating accounts and processing transactions.

## Service Interactions

Clients interact with the system through the API Gateway, which forwards requests to the appropriate microservices. Each microservice retrieves its configuration from the Config Service and registers itself with the Service Discovery upon startup. This setup ensures that services can dynamically discover and communicate with each other.

## Running the Application

To run the application locally:

1. **Start the Config Service**: Ensure that the `config-repo` contains the necessary configuration files. Then, run the `config-service`.

2. **Start the Service Discovery**: Launch the `discovery-service` to enable service registration and discovery.

3. **Start the API Gateway**: Run the `gateway-service` to handle incoming client requests.

4. **Start the Microservices**: Launch the `customers-service` and `account-service`.

Each service will register itself with the Service Discovery and retrieve its configuration from the Config Service upon startup.

## Prerequisites

- Java 17 or higher
- Maven
- Spring Boot

## Notes

- Ensure that the `config-repo` is accessible and contains the necessary configuration files for each service.
- The order of starting the services is crucial: start with the Config Service, followed by the Service Discovery, then the API Gateway, and finally the microservices.
- For detailed configurations and endpoints, refer to the respective service directories in the repository.

This setup provides a foundational structure for building and deploying microservices in a banking system context.
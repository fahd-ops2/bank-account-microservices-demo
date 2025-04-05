package io.fahd.accountservice.clients;


import io.fahd.accountservice.model.Customer;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerRestClient {

    @GetMapping("/api/v1/customers/{id}")
    @CircuitBreaker(name = "customer-service", fallbackMethod = "getDefaultCustomer")
    Customer findCustomerById(@PathVariable Long id);

    default Customer getDefaultCustomer(Long id, Exception exception){
        return Customer.builder()
                .id(id)
                .firstName("not available")
                .lastName("not available")
                .email("not available")
                .build();
    }
}

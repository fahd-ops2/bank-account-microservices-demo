package io.fahd.accountservice.clients;


import io.fahd.accountservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerRestClient {

    @GetMapping("/api/v1/customers/{id}")
    Customer findCustomerById(@PathVariable Long id);
}

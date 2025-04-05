package io.fahd.customerservice.web;

import io.fahd.customerservice.entities.Customer;
import io.fahd.customerservice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
@RequiredArgsConstructor
public class CustomerRestController {

    private final CustomerService customerService;

    @GetMapping
    public List<Customer> customerList(){
        return customerService.customerList();
    }

    @GetMapping("/{id}")
    public Customer customerById(@PathVariable Long id){
        return customerService.customerById(id);
    }
}

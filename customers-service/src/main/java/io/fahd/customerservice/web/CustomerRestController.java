package io.fahd.customerservice.web;

import io.fahd.customerservice.entities.Customer;
import io.fahd.customerservice.repositories.CustomerJpaRepository;
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

    private final CustomerJpaRepository customerJpaRepository;

    @GetMapping
    public List<Customer> customerList(){
        return customerJpaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Customer customerById(@PathVariable Long id){
        return customerJpaRepository.findById(id).get();
    }
}

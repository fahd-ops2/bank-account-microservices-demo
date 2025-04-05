package io.fahd.customerservice.service;

import io.fahd.customerservice.entities.Customer;
import io.fahd.customerservice.repositories.CustomerJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{

    private final CustomerJpaRepository customerJpaRepository;

    @Override
    public List<Customer> customerList() {
        return customerJpaRepository.findAll();
    }

    @Override
    public Customer customerById(Long id) {
        return customerJpaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("no customer founded"));
    }
}

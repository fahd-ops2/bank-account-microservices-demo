package io.fahd.customerservice.service;

import io.fahd.customerservice.entities.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> customerList();
    Customer customerById(Long id);
}

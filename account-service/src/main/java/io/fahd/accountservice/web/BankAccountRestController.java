package io.fahd.accountservice.web;

import io.fahd.accountservice.clients.CustomerRestClient;
import io.fahd.accountservice.entities.BankAccount;
import io.fahd.accountservice.model.Customer;
import io.fahd.accountservice.repositories.BankAccountJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/bank-accounts")
@RequiredArgsConstructor
public class BankAccountRestController {

    private final BankAccountJpaRepository bankAccountJpaRepository;
    private final CustomerRestClient customerRestClient;

    @GetMapping
    public List<BankAccount> bankAccountList(){
        return bankAccountJpaRepository.findAll();
    }

    @GetMapping("/{id}")
    public BankAccount bankAccountById(@PathVariable String id){
        BankAccount bankAccount = bankAccountJpaRepository.findById(id).get();
        Customer customer = customerRestClient.findCustomerById(bankAccount.getCustomerId());
        bankAccount.setCustomer(customer);
        return bankAccount;
    }

    @GetMapping("/customer/{id}")
    public List<BankAccount> bankAccountByCustomerId(@PathVariable  Long id){
        return bankAccountJpaRepository.findByCustomerId(id);
    }


}

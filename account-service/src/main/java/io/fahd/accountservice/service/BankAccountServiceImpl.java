package io.fahd.accountservice.service;

import io.fahd.accountservice.clients.CustomerRestClient;
import io.fahd.accountservice.entities.BankAccount;
import io.fahd.accountservice.model.Customer;
import io.fahd.accountservice.repositories.BankAccountJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BankAccountServiceImpl implements BankAccountService {

    private final BankAccountJpaRepository bankAccountJpaRepository;
    private final CustomerRestClient customerRestClient;


    @Override
    public List<BankAccount> bankAccountList() {
        return bankAccountJpaRepository.findAll();
    }

    @Override
    public BankAccount bankAccountById(String id) {
        BankAccount bankAccount = bankAccountJpaRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("no bank account founded"));
        Customer customer = customerRestClient.findCustomerById(bankAccount.getCustomerId());
        bankAccount.setCustomer(customer);
        return bankAccount;
    }

    @Override
    public List<BankAccount> bankAccountByCustomerId(Long id) {
        return bankAccountJpaRepository.findByCustomerId(id);
    }
}

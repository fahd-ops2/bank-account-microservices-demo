package io.fahd.accountservice.service;

import io.fahd.accountservice.entities.BankAccount;

import java.util.List;

public interface BankAccountService {

    List<BankAccount> bankAccountList();
    BankAccount bankAccountById(String id);
    List<BankAccount> bankAccountByCustomerId(Long id);
}

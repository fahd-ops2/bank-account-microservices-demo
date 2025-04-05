package io.fahd.accountservice.web;

import io.fahd.accountservice.clients.CustomerRestClient;
import io.fahd.accountservice.entities.BankAccount;
import io.fahd.accountservice.model.Customer;
import io.fahd.accountservice.repositories.BankAccountJpaRepository;
import io.fahd.accountservice.service.BankAccountService;
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

    private final BankAccountService bankAccountService;


    @GetMapping
    public List<BankAccount> bankAccountList(){
        return bankAccountService.bankAccountList();
    }

    @GetMapping("/{id}")
    public BankAccount bankAccountById(@PathVariable String id){
        return bankAccountService.bankAccountById(id);
    }

    @GetMapping("/customer/{id}")
    public List<BankAccount> bankAccountByCustomerId(@PathVariable  Long id){
        return bankAccountService.bankAccountByCustomerId(id);
    }


}

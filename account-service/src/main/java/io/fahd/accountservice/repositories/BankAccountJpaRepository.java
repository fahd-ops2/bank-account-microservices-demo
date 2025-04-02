package io.fahd.accountservice.repositories;

import io.fahd.accountservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankAccountJpaRepository extends JpaRepository<BankAccount, String> {

    List<BankAccount> findByCustomerId(Long id);
}

package io.fahd.accountservice.entities;

import io.fahd.accountservice.model.Customer;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
public class BankAccount {

    @Id
    private String id;
    private double balance;
    private LocalDate createdAt;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @Transient
    private Customer customer;
    private Long customerId;

}

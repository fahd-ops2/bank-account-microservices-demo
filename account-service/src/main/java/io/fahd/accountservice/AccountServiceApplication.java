package io.fahd.accountservice;

import io.fahd.accountservice.entities.AccountType;
import io.fahd.accountservice.entities.BankAccount;
import io.fahd.accountservice.repositories.BankAccountJpaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
@EnableFeignClients
public class AccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(BankAccountJpaRepository bankAccountJpaRepository){
        return args -> {
			List<BankAccount> bankAccounts = List.of(
					BankAccount.builder()
							.id(UUID.randomUUID().toString())
							.balance(90000.0)
							.currency("MAD")
							.createdAt(LocalDate.now())
							.type(AccountType.CURRENT_ACCOUNT)
							.customerId(1L)
							.build(),
					BankAccount.builder()
							.id(UUID.randomUUID().toString())
							.balance(110000.0)
							.currency("MAD")
							.createdAt(LocalDate.now())
							.type(AccountType.CURRENT_ACCOUNT)
							.customerId(2L)
							.build()
			);

			bankAccountJpaRepository.saveAll(bankAccounts);
		};
    }
}

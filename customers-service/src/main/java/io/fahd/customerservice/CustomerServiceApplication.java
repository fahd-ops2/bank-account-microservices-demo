package io.fahd.customerservice;

import io.fahd.customerservice.entities.Customer;
import io.fahd.customerservice.repositories.CustomerJpaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerJpaRepository customerJpaRepository){
		return args -> {

			List<Customer> customers = List.of(
					Customer.builder().firstName("joe").lastName("doe").email("joedoe@gmail.com").build(),
					Customer.builder().firstName("eric").lastName("gama").email("ericgama@gmail.com").build()
			);

			customerJpaRepository.saveAll(customers);
		};
	}
}

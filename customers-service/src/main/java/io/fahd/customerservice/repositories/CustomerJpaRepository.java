package io.fahd.customerservice.repositories;

import io.fahd.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface CustomerJpaRepository extends JpaRepository<Customer, Long> {
}

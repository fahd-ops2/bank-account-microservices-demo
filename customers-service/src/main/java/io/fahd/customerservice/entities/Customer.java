package io.fahd.customerservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

}

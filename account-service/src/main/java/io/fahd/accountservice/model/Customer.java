package io.fahd.accountservice.model;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
public class Customer {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

}

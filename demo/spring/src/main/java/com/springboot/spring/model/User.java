package com.springboot.spring.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@EntityScan
public class User {
    @Id
    private Long id;

    @Column
    private String firstName;

    private String lastName;

    private String username;

    private String password;
}

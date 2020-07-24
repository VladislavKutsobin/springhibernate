package com.softserve.edu.springhibernate.model;


import lombok.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode


public class User {

    private Long id;

    private String email;

    private String firstName;

    private String lastName;

    private String password;

    private String role;
}

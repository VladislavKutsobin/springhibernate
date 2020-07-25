package com.softserve.edu.springhibernate.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    @NotBlank
    @Size(min = 6, max = 255)
    @Email(message = "Invalid email address")
    private String email;

    @Column(name = "first_name")
    @NotBlank
    @Size(max = 255)
    private String firstName;

    @Column(name = "last_name")
    @NotBlank
    @Size(max = 20)
    private String lastName;

    @Column(name = "password")
    @NotBlank
    @Size(max = 255)
    private String password;

    @Column(name = "role")
    @NotBlank
    @Size(max = 255)
    private String role;

    @ManyToMany
    @JoinTable(name = "marathon_user",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "marathon_id"))
    private Set<Marathon> marathons;

    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "user")
    private Progress progress;
}

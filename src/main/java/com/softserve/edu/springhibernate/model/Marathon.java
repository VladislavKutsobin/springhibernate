package com.softserve.edu.springhibernate.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "marathon")
public class Marathon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    @NotBlank
    @Size(max = 255)
    private String title;


    @ManyToMany()
    @JoinTable(name = "marathon_user",
        joinColumns = @JoinColumn(name = "marathon_id"),
        inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> users;

    @OneToMany(mappedBy = "marathon", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Sprint> sprints;
}

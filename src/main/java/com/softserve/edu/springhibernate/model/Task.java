package com.softserve.edu.springhibernate.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class Task {

    private Long id;

    private Date created;

    private String title;

    private Date updated;
}

package com.softserve.edu.springhibernate.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class Sprint {

    private Long id;

    private Date finish;

    private Date startDate;

    private String title;
}

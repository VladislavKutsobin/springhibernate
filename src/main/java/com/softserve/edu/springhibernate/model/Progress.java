package com.softserve.edu.springhibernate.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Progress {

    private Long id;

    private Date started;

    private String status;

    private Date updated;


}

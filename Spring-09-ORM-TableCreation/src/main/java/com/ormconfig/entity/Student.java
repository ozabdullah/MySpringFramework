package com.ormconfig.entity;

import com.ormconfig.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @Column(name="studentFirstName")
    private String firstName;

    @Column(name="studentLastName")
    private String lastName;

    @Column(name="studentEmailName")
    private String email;



    @Transient // dont create column for this; not persisted in the database
    private String city;


    //before java8
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Temporal(TemporalType.TIME)
    private Date birthTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDateTime;


    //after java8
    @Column(columnDefinition = "DATE")
    private LocalDate localDate;
    @Column(columnDefinition = "TIME")
    private LocalTime localTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime localDateTime;

    @Enumerated(EnumType.STRING)
   private Gender gender;


}

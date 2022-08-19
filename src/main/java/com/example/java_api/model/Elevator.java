package com.example.java_api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "elevators")
public class Elevator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer Serial_Number;
    private String Model;
    private String Type;
    private String Status;
    private String Certificate_Of_Inspection;
    private String Information;
    private String Notes;
    private LocalDate Date_Of_Commissioning;
    private LocalDate Date_Of_Last_Inspection;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    @Column(name="column_id")
    private Integer columnId;


}

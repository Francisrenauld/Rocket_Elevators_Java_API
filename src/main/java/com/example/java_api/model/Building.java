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
@Table(name = "buildings")
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Full_Name_Of_The_Building_Administrator;
    private String Email_Of_The_Administrator_Of_The_Building;
    private String Phone_Number_Of_The_Building_Administrator;
    private String Full_Name_Of_The_Technical_Contact_For_The_Building;
    private String Technical_Contact_Email_For_The_Building;
    private String Technical_Contact_Phone_For_The_Building;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private Integer customer_id;
    private Integer address_id;
}
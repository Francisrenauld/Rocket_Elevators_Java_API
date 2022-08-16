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
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Company_Name;
    private String Company_Headquarters_Adress;
    private String Full_Name_Of_The_Company_Contact;
    private String Company_Contact_Phone;
    private String Company_Description;
    private String Full_Name_Of_Service_Technical_Authority;
    private String Technical_Authority_Phone_For_Service;
    private String Technical_Manager_Email_For_Service;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private Integer user_id;
    private Integer address_id;
}


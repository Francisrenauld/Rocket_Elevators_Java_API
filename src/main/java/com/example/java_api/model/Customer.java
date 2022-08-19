package com.example.java_api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import javax.persistence.Column;
import java.time.LocalDateTime;
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "customers")
public class Customer {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String company_Name;
    private String email_Of_The_Company_Contact;
    private String company_Headquarters_Adress;
    private String full_Name_Of_The_Company_Contact;
    private String company_Contact_Phone;
    private String company_Description;
    private String full_Name_Of_Service_Technical_Authority;
    private String technical_Authority_Phone_For_Service;
    private String technical_Manager_Email_For_Service;
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime created_at;
    @CreationTimestamp
    @Column(name = "updated_at", updatable = false)
    private LocalDateTime updated_at;
    //private Integer user_id;
    private Integer address_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;

}


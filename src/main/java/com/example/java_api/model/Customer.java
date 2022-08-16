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

    public void setCompany_Name(String company_Name) {
        Company_Name = company_Name;
    }

    public void setCompany_Headquarters_Adress(String company_Headquarters_Adress) {
        Company_Headquarters_Adress = company_Headquarters_Adress;
    }

    public void setFull_Name_Of_The_Company_Contact(String full_Name_Of_The_Company_Contact) {
        Full_Name_Of_The_Company_Contact = full_Name_Of_The_Company_Contact;
    }

    public void setCompany_Contact_Phone(String company_Contact_Phone) {
        Company_Contact_Phone = company_Contact_Phone;
    }

    public void setCompany_Description(String company_Description) {
        Company_Description = company_Description;
    }

    public void setFull_Name_Of_Service_Technical_Authority(String full_Name_Of_Service_Technical_Authority) {
        Full_Name_Of_Service_Technical_Authority = full_Name_Of_Service_Technical_Authority;
    }

    public void setTechnical_Authority_Phone_For_Service(String technical_Authority_Phone_For_Service) {
        Technical_Authority_Phone_For_Service = technical_Authority_Phone_For_Service;
    }

    public void setTechnical_Manager_Email_For_Service(String technical_Manager_Email_For_Service) {
        Technical_Manager_Email_For_Service = technical_Manager_Email_For_Service;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }

    public String getCompany_Name() {
        return Company_Name;
    }

    public String getCompany_Headquarters_Adress() {
        return Company_Headquarters_Adress;
    }

    public String getFull_Name_Of_The_Company_Contact() {
        return Full_Name_Of_The_Company_Contact;
    }

    public String getCompany_Contact_Phone() {
        return Company_Contact_Phone;
    }

    public String getCompany_Description() {
        return Company_Description;
    }

    public String getFull_Name_Of_Service_Technical_Authority() {
        return Full_Name_Of_Service_Technical_Authority;
    }

    public String getTechnical_Authority_Phone_For_Service() {
        return Technical_Authority_Phone_For_Service;
    }

    public String getTechnical_Manager_Email_For_Service() {
        return Technical_Manager_Email_For_Service;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public Integer getAddress_id() {
        return address_id;
    }
}

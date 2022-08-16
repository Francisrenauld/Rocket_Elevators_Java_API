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
@Table(name = "batteries")
public class Battery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Type;
    private String Status;
    private String Information;
    private String Notes;
    private String Certificate_Of_Operations;
    private LocalDate Date_Of_Commissioning;
    private LocalDate Date_Of_Last_Inspection;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private Integer building_id;
    private Integer employee_id;

    public void setType(String type) {
        Type = type;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void setInformation(String information) {
        Information = information;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    public void setCertificate_Of_Operations(String certificate_Of_Operations) {
        Certificate_Of_Operations = certificate_Of_Operations;
    }

    public void setDate_Of_Commissioning(LocalDate date_Of_Commissioning) {
        Date_Of_Commissioning = date_Of_Commissioning;
    }

    public void setDate_Of_Last_Inspection(LocalDate date_Of_Last_Inspection) {
        Date_Of_Last_Inspection = date_Of_Last_Inspection;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public void setBuilding_id(Integer building_id) {
        this.building_id = building_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getType() {
        return Type;
    }

    public String getStatus() {
        return Status;
    }

    public String getInformation() {
        return Information;
    }

    public String getNotes() {
        return Notes;
    }

    public String getCertificate_Of_Operations() {
        return Certificate_Of_Operations;
    }

    public LocalDate getDate_Of_Commissioning() {
        return Date_Of_Commissioning;
    }

    public LocalDate getDate_Of_Last_Inspection() {
        return Date_Of_Last_Inspection;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public Integer getBuilding_id() {
        return building_id;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }
}
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
    private Integer column_id;

    public void setSerial_Number(Integer serial_Number) {
        Serial_Number = serial_Number;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void setCertificate_Of_Inspection(String certificate_Of_Inspection) {
        Certificate_Of_Inspection = certificate_Of_Inspection;
    }

    public void setInformation(String information) {
        Information = information;
    }

    public void setNotes(String notes) {
        Notes = notes;
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

    public void setColumn_id(Integer column_id) {
        this.column_id = column_id;
    }

    public Integer getSerial_Number() {
        return Serial_Number;
    }

    public String getModel() {
        return Model;
    }

    public String getType() {
        return Type;
    }

    public String getStatus() {
        return Status;
    }

    public String getCertificate_Of_Inspection() {
        return Certificate_Of_Inspection;
    }

    public String getInformation() {
        return Information;
    }

    public String getNotes() {
        return Notes;
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

    public Integer getColumn_id() {
        return column_id;
    }
}

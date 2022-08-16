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
@Table(name = "columns")
public class Column {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer Number_Of_Floors_Served;
    private String Type;
    private String Status;
    private String Information;
    private String Notes;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private Integer battery_id;

    public void setNumber_Of_Floors_Served(Integer number_Of_Floors_Served) {
        Number_Of_Floors_Served = number_Of_Floors_Served;
    }

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

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public void setBattery_id(Integer battery_id) {
        this.battery_id = battery_id;
    }

    public Integer getNumber_Of_Floors_Served() {
        return Number_Of_Floors_Served;
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

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public Integer getBattery_id() {
        return battery_id;
    }
}

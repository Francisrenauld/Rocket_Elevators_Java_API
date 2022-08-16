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
@Table(name = "interventions")
public class Intervention {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer author;
    private Integer customer_id;
    private Integer building_id;
    private Integer battery_id;
    private Integer column_id;
    private Integer elevator_id;
    private Integer employee_id;
    private LocalDateTime start_date_and_time_of_the_intervention;
    private LocalDateTime end_date_and_time_of_the_intervention;
    private String result;
    private String report;
    private String status;
    private LocalDateTime updated_at;
    private LocalDateTime created_at;

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public void setBuilding_id(Integer building_id) {
        this.building_id = building_id;
    }

    public void setBattery_id(Integer battery_id) {
        this.battery_id = battery_id;
    }

    public void setColumn_id(Integer column_id) {
        this.column_id = column_id;
    }

    public void setElevator_id(Integer elevator_id) {
        this.elevator_id = elevator_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public void setStart_date_and_time_of_the_intervention(LocalDateTime start_date_and_time_of_the_intervention) {
        this.start_date_and_time_of_the_intervention = start_date_and_time_of_the_intervention;
    }

    public void setEnd_date_and_time_of_the_intervention(LocalDateTime end_date_and_time_of_the_intervention) {
        this.end_date_and_time_of_the_intervention = end_date_and_time_of_the_intervention;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public Integer getAuthor() {
        return author;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public Integer getBuilding_id() {
        return building_id;
    }

    public Integer getBattery_id() {
        return battery_id;
    }

    public Integer getColumn_id() {
        return column_id;
    }

    public Integer getElevator_id() {
        return elevator_id;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public LocalDateTime getStart_date_and_time_of_the_intervention() {
        return start_date_and_time_of_the_intervention;
    }

    public LocalDateTime getEnd_date_and_time_of_the_intervention() {
        return end_date_and_time_of_the_intervention;
    }

    public String getResult() {
        return result;
    }

    public String getReport() {
        return report;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }
}

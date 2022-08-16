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
}

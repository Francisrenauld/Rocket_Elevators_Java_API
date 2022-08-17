package com.example.java_api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.persistence.Column;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "interventions")
public class Intervention {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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
    @CreationTimestamp
    @Column(name = "updated_at", updatable = false)
    private LocalDateTime updated_at;
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime created_at;
}

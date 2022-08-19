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
@Table(name = "interventions")
public class InterventionPost {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private Integer author;
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

    @ManyToOne(optional = false)
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @ManyToOne(optional = false)
    @JoinColumn(name = "building_id")
    private Building building;
    @ManyToOne(optional = false)
    @JoinColumn(name = "battery_id")
    private Battery battery;
    @ManyToOne(optional = false)
    @JoinColumn(name = "column_id")
    private Columns column;
    @ManyToOne(optional = false)
    @JoinColumn(name = "elevator_id")
    private Elevator elevator;
    @ManyToOne(optional = false)
    @JoinColumn(name = "employee_id")
    private Employee employee;
}

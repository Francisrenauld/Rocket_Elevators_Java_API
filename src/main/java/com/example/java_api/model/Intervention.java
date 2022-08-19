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
public class Intervention {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column( insertable =false, updatable=false)
    private Integer author;
    @Column( insertable=false, updatable=false)
    private Integer customer_id;
    @Column( insertable=false, updatable=false)
    private Integer building_id;
    @Column( insertable=false, updatable=false)
    private Integer battery_id;
    @Column( insertable=false, updatable=false)
    private Integer column_id;
    @Column( insertable=false, updatable=false)
    private Integer elevator_id;
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

    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Building building;
    @ManyToOne
    private Battery battery;
    @ManyToOne
    private Columns column;
    @ManyToOne
    private Elevator elevator;
    @ManyToOne(optional = false)
    @JoinColumn(name = "employee_id")
    private Employee employee;
}

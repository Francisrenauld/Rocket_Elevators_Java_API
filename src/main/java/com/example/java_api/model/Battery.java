package com.example.java_api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.persistence.Column;
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
    @Column(name="building_id")
    private Integer buildingId;
    private Integer employee_id;
}
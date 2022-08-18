package com.example.java_api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
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
    @javax.persistence.Column(name="battery_id")
    private Integer batteryId;
}

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
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer admin;
    private String email;
    private String encrypted_password;
    private String reset_password_token;
    private LocalDateTime remember_created_at;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}

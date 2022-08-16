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

    public void setAdmin(Integer admin) {
        this.admin = admin;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEncrypted_password(String encrypted_password) {
        this.encrypted_password = encrypted_password;
    }

    public void setReset_password_token(String reset_password_token) {
        this.reset_password_token = reset_password_token;
    }

    public void setRemember_created_at(LocalDateTime remember_created_at) {
        this.remember_created_at = remember_created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public Integer getAdmin() {
        return admin;
    }

    public String getEmail() {
        return email;
    }

    public String getEncrypted_password() {
        return encrypted_password;
    }

    public String getReset_password_token() {
        return reset_password_token;
    }

    public LocalDateTime getRemember_created_at() {
        return remember_created_at;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }
}

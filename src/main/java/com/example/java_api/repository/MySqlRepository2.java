package com.example.java_api.repository;

import com.example.java_api.model.Elevator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MySqlRepository2 extends JpaRepository<Elevator,Integer> {
}
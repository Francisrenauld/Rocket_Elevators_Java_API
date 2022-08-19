package com.example.java_api.repository;

import com.example.java_api.model.Elevator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ElevatorRepo extends JpaRepository<Elevator,Integer> {
    List<Elevator> findByColumnId(Integer columnId);
}
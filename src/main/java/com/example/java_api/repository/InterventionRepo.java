package com.example.java_api.repository;

import com.example.java_api.model.Intervention;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterventionRepo extends JpaRepository<Intervention,Integer>{
}

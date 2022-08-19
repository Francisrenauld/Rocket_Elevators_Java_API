package com.example.java_api.repository;

import com.example.java_api.model.Building;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingRepo extends JpaRepository<Building,Integer>{
    Building findByCustomerId(Integer customer_id);

}

package com.example.java_api.repository;

import com.example.java_api.model.Building;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingRepo extends JpaRepository<Building,Integer>{

    Object findByCustomer_id(Integer customer_id);
}

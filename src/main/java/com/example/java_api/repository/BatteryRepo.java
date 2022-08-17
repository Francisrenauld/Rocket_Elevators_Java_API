package com.example.java_api.repository;

import com.example.java_api.model.Battery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BatteryRepo extends JpaRepository<Battery,Integer>{
    List<Battery> findByBuildingId(Integer buildingId);
}

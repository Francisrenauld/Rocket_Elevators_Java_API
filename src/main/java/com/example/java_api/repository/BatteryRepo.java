package com.example.java_api.repository;

import com.example.java_api.model.Battery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatteryRepo extends JpaRepository<Battery,Integer>{
}

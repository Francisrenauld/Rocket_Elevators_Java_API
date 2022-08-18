package com.example.java_api.repository;

import com.example.java_api.model.Column;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ColumnRepo extends JpaRepository<Column,Integer>{
    List<Column> findByBatteryId(Integer batteryId);
}

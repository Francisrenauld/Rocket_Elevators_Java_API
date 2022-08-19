package com.example.java_api.repository;

import com.example.java_api.model.Columns;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ColumnRepo extends JpaRepository<Columns,Integer>{
    List<Columns> findByBatteryId(Integer batteryId);
}

package com.example.datavisualization.repository;

import com.example.datavisualization.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Long> {
}

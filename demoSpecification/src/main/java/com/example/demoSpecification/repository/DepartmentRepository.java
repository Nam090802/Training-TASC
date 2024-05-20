package com.example.demoSpecification.repository;

import com.example.demoSpecification.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}

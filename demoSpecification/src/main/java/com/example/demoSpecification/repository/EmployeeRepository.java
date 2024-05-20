package com.example.demoSpecification.repository;

import com.example.demoSpecification.entity.Employee;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Employee> findAll(Specification<Employee> spec);
}

package com.example.demoSpecification.service;

import com.example.demoSpecification.entity.Employee;
import com.example.demoSpecification.repository.EmployeeRepository;
import com.example.demoSpecification.specification.EmployeeSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> searchEmployees(String firstNameStartsWith, Integer startAge, Integer endAge) {
        Specification<Employee> spec = Specification.where(EmployeeSpecification.ageBetween(startAge, endAge))
                .and(EmployeeSpecification.firstNameStartsWith(firstNameStartsWith));
        return employeeRepository.findAll(spec);
    }
}


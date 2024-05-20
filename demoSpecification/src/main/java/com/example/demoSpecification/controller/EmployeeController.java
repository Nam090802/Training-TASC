package com.example.demoSpecification.controller;

import com.example.demoSpecification.entity.Employee;
import com.example.demoSpecification.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/search")
    public List<Employee> searchEmployees (
            @RequestParam(required = false) String firstNameStartsWith,
            @RequestParam(required = false) Integer startAge,
            @RequestParam(required = false) Integer endAge) {
        return employeeService.searchEmployees(firstNameStartsWith, startAge, endAge);
    }
}

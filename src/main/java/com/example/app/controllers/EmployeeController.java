package com.example.app.controllers;

import com.example.app.models.Employee;
import com.example.app.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/")
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @PostMapping("/add")
    public Long addEmployees(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return employee.getId();
    }

    @PutMapping("/update")
    public boolean updateEmployees(@RequestBody Employee employee) {
        Optional<Employee> emp = employeeRepository.findById(employee.getId());
        employeeRepository.save(emp.get());
        return true;
    }
}

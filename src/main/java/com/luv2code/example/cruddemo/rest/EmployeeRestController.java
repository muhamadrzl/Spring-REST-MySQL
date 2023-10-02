package com.luv2code.example.cruddemo.rest;

import com.luv2code.example.cruddemo.dao.EmployeeDAO;
import com.luv2code.example.cruddemo.entity.Employee;
import com.luv2code.example.cruddemo.service.EmployeeService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeId(@PathVariable Integer employeeId){
        return employeeService.findById(employeeId);
    }
}


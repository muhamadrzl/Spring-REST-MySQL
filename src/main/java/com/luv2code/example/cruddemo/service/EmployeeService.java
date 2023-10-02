package com.luv2code.example.cruddemo.service;

import com.luv2code.example.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(Integer id);

    Employee save (Employee employee);

    void deleteById(Integer id);

    int deleteAll();
}

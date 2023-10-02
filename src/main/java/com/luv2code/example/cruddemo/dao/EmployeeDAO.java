package com.luv2code.example.cruddemo.dao;

import com.luv2code.example.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findById(Integer id);

    Employee save (Employee employee);

    void deleteById(Integer id);

    int deleteAll();
}

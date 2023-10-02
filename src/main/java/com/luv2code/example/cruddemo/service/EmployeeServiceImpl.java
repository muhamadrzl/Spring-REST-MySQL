package com.luv2code.example.cruddemo.service;

import com.luv2code.example.cruddemo.dao.EmployeeRepository;
import com.luv2code.example.cruddemo.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Integer id) {
        Optional<Employee> result= employeeRepository.findById(id);
        return result.get();
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteById(Integer id) {
       employeeRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        employeeRepository.deleteAll();
    }


}

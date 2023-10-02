package com.luv2code.example.cruddemo.service;

import com.luv2code.example.cruddemo.dao.EmployeeDAO;
import com.luv2code.example.cruddemo.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(Integer id) {
        return employeeDAO.findById(id);
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
       employeeDAO.deleteById(id);
    }

    @Override
    @Transactional
    public int deleteAll() {
        return employeeDAO.deleteAll();
    }


}

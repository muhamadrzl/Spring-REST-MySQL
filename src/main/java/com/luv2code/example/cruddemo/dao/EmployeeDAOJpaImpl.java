package com.luv2code.example.cruddemo.dao;

import com.luv2code.example.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;

import java.util.List;

public class EmployeeDAOJpaImpl implements EmployeeDAO{
    private EntityManager entityManager;

    public EmployeeDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        return null;
    }
}

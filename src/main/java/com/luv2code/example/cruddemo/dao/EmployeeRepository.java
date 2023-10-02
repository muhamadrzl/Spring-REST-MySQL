package com.luv2code.example.cruddemo.dao;

import com.luv2code.example.cruddemo.entity.Employee;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

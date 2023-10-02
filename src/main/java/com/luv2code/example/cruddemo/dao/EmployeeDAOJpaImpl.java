package com.luv2code.example.cruddemo.dao;

import com.luv2code.example.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{
    private EntityManager entityManager;
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> theQuery =entityManager.createQuery("from Employee", Employee.class);
        return theQuery.getResultList();
    }

   @Override
    public Employee findById(Integer id){
        return entityManager.find(Employee.class, id);
    }

    @Override
    public Employee save(Employee theEmployee){
       return entityManager.merge(theEmployee);
    }

    @Override
    public void deleteById(Integer id){
        Employee theEmployee = entityManager.find(Employee.class, id);
        entityManager.remove(theEmployee);
    }

    @Override
    public int deleteAll(){
        int numRowsDeleted= entityManager.createQuery("DELETE FROM employee").executeUpdate();
        return numRowsDeleted;
    }
}


package com.luv2code.example.cruddemo.rest;

import com.luv2code.example.cruddemo.entity.Employee;
import com.luv2code.example.cruddemo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        employeeService.deleteById(employeeId);
        return "Deleted ID no." + employeeId;
    }
}


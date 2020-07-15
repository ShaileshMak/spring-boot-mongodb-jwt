package com.shailesh.mak.springmongodbjwt.controllers;

import com.shailesh.mak.springmongodbjwt.models.Employee;
import com.shailesh.mak.springmongodbjwt.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity<Employee> addEmployee(@RequestBody final Employee employee) {
        Employee _employee = employeeService.addEmployee(employee);
        return new ResponseEntity<Employee>(_employee,HttpStatus.OK);
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getEmployees() {
        Optional<List<Employee>> _employees = Optional.ofNullable(employeeService.getEmployees());
        return new ResponseEntity<List<Employee>>(_employees.get(), HttpStatus.OK);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeesById(@PathVariable final String id) {
        Optional<Employee> _employee = employeeService.getEmployeesById(id);
        return new ResponseEntity<Employee>(_employee.get(), HttpStatus.OK);
    }
}

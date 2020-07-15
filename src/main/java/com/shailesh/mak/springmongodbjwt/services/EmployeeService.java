package com.shailesh.mak.springmongodbjwt.services;

import com.shailesh.mak.springmongodbjwt.models.Employee;
import com.shailesh.mak.springmongodbjwt.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeesById(String id) { return employeeRepository.findById(id); }
}

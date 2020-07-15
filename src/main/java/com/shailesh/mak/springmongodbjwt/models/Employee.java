package com.shailesh.mak.springmongodbjwt.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "spr_employee")
public class Employee {
    @Id
    private String employeeId;
    private String firstName;
    private String lastName;
    private String country;
    private String department;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String country, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

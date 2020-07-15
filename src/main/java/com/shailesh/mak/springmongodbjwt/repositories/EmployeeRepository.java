package com.shailesh.mak.springmongodbjwt.repositories;

import com.shailesh.mak.springmongodbjwt.models.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}

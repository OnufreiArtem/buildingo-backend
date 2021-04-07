package com.onufrei.buildingo.repos;

import com.onufrei.buildingo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
}

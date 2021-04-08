package com.onufrei.buildingo.repos;

import com.onufrei.buildingo.model.EmployeeSpecification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeSpecificationRepository extends MongoRepository<EmployeeSpecification, String> {
}

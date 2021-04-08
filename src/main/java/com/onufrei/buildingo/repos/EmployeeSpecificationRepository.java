package com.onufrei.buildingo.repos;

import com.onufrei.buildingo.model.EmployeeSpecification;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeSpecificationRepository extends MongoRepository<EmployeeSpecification, String> {
}

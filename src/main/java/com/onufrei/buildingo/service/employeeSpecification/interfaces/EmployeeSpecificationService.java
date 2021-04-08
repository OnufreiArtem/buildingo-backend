package com.onufrei.buildingo.service.employeeSpecification.interfaces;

import com.onufrei.buildingo.model.EmployeeSpecification;

import java.util.List;

public interface EmployeeSpecificationService {
    EmployeeSpecification findById(String id);
    EmployeeSpecification delete(String id);
    EmployeeSpecification update(String id, EmployeeSpecification nEmployeeSpecification);
    EmployeeSpecification add(EmployeeSpecification employeeSpecification);
    List<EmployeeSpecification> findAll();
}

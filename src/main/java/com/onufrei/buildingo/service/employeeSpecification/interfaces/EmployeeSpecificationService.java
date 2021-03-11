package com.onufrei.buildingo.service.employeeSpecification.interfaces;

import com.onufrei.buildingo.model.EmployeeSpecification;

import java.util.List;

public interface EmployeeSpecificationService {
    List<EmployeeSpecification> findAll();
    EmployeeSpecification findById(String id);
}

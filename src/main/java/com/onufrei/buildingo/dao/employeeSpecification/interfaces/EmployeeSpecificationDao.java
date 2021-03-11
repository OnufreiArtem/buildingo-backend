package com.onufrei.buildingo.dao.employeeSpecification.interfaces;

import com.onufrei.buildingo.model.Employee;
import com.onufrei.buildingo.model.EmployeeSpecification;

import java.util.List;

/**
 * The representation of the object of EmployeeSpecificationDao
 *
 * @author Artem Onufrei
 * @version 1
 * @since 11.03.2021
 */

public interface EmployeeSpecificationDao {
    EmployeeSpecification findById(String id);
    EmployeeSpecification delete(String id);
    EmployeeSpecification update(String id, EmployeeSpecification nEmployeeSpecification);
    EmployeeSpecification add(EmployeeSpecification employeeSpecification);
    List<EmployeeSpecification> findAll();
}

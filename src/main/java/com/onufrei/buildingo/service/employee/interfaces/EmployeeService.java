package com.onufrei.buildingo.service.employee.interfaces;

import com.onufrei.buildingo.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee findById(String id);
    Employee delete(String id);
    Employee update(String id, Employee nEmployee);
    Employee add(Employee employee);
    List<Employee> findAll();
}

package com.onufrei.buildingo.service.employee.interfaces;

import com.onufrei.buildingo.form.EmployeeForm;
import com.onufrei.buildingo.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee findById(String id);
    Employee delete(String id);
    Employee update(String id, Employee nEmployee);
    Employee add(Employee employee);
    Employee getEmployeeFromForm(String id, EmployeeForm form);
    List<Employee> findAll();
}

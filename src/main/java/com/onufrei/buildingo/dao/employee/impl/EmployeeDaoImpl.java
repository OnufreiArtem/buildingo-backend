package com.onufrei.buildingo.dao.employee.impl;

import com.onufrei.buildingo.dao.employee.interfaces.EmployeeDao;
import com.onufrei.buildingo.data.FakeDB;
import com.onufrei.buildingo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The representation of the object of EmployeeDaoImpl
 *
 * @author Artem Onufrei
 * @version 1
 * @since 03.03.2021
 */

@Component
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    FakeDB db;

    @Override
    public Employee findById(String id) {
        return db.employees.stream()
                .filter(emp -> emp.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Employee delete(String id) {
        Employee employeeToDelete = this.findById(id);
        db.employees.remove(employeeToDelete);
        return employeeToDelete;
    }

    @Override
    public Employee update(String id, Employee nEmployee) {
        Employee employeeToUpdate = null;
        if(this.delete(id) != null) {
            db.employees.add(nEmployee);
            employeeToUpdate = nEmployee;
        }

        return employeeToUpdate;
    }

    @Override
    public Employee add(Employee employee) {
        Employee employeeToAdd = null;
        if(this.findById(employee.getId()) == null) {
            db.employees.add(employee);
            employeeToAdd = employee;
        }

        return employeeToAdd;
    }

    @Override
    public List<Employee> findAll() {
        return db.employees;
    }
}

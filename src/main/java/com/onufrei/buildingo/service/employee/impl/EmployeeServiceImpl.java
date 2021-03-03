package com.onufrei.buildingo.service.employee.impl;

import com.onufrei.buildingo.dao.employee.interfaces.EmployeeDao;
import com.onufrei.buildingo.model.Employee;
import com.onufrei.buildingo.service.employee.interfaces.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The representation of the object of EmployeeServiceImpl
 *
 * @author Artem Onufrei
 * @version 1
 * @since 03.03.2021
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao dao;

    @Override
    public Employee findById(String id) {
        return dao.findById(id);
    }

    @Override
    public Employee delete(String id) {
        return dao.delete(id);
    }

    @Override
    public Employee update(String id, Employee nEmployee) {
        return dao.update(id, nEmployee);
    }

    @Override
    public Employee add(Employee employee) {
        return dao.add(employee);
    }

    @Override
    public List<Employee> findAll() {
        return dao.findAll();
    }
}

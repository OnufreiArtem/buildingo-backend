package com.onufrei.buildingo.service.employee.impl;

import com.onufrei.buildingo.form.EmployeeForm;
import com.onufrei.buildingo.model.Employee;
import com.onufrei.buildingo.repos.EmployeeRepository;
import com.onufrei.buildingo.service.employee.interfaces.EmployeeService;
import com.onufrei.buildingo.service.employeeSpecification.interfaces.EmployeeSpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

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
    EmployeeRepository repo;

    @Autowired
    EmployeeSpecificationService specService;

    @Override
    public Employee findById(String id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Employee delete(String id) {
        Employee employeeToDelete = repo.findById(id).orElse(null);
        if(employeeToDelete != null) {
            repo.delete(employeeToDelete);
        }
        return employeeToDelete;
    }

    @Override
    public Employee update(String id, Employee nEmployee) {
        if(repo.findById(id).orElse(null) == null) return null;
        nEmployee.setId(id);
        nEmployee.setModified_at(LocalDateTime.now());
        return repo.save(nEmployee);
    }

    @Override
    public Employee add(Employee employee) {
        employee.setCreated_at(LocalDateTime.now());
        employee.setModified_at(LocalDateTime.now());
        return repo.save(employee);
    }

    @Override
    public List<Employee> findAll() {
        return repo.findAll();
    }

    @Override
    public Employee getEmployeeFromForm(String id, EmployeeForm form) {
        var specification = !form.getSpecification().equals("Nan")
                ? specService.findById(form.getSpecification()) : null;

        String nId = (id == null || id.equals("")) ? UUID.randomUUID().toString() : id;

        return Employee
                .builder()
                .id(nId)
                .name(form.getName())
                .surname(form.getSurname())
                .phoneNumber(form.getPhoneNumber())
                .email(form.getEmail())
                .resumeUrl(form.getResumeUrl())
                .homeAddress(form.getHomeAddress())
                .dateOfBirth(form.getDateOfBirth())
                .hireDate(form.getHireDate())
                .firedDate(form.getFiredDate())
                .created_at(form.getCreated_at())
                .modified_at(form.getModified_at())
                .specification(specification)
                .build();
    }
}

package com.onufrei.buildingo.controller.rest;

import com.onufrei.buildingo.model.Employee;
import com.onufrei.buildingo.service.employee.interfaces.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Artem Onufrei
 * @version 1
 * @since 03.03.2021
 */

@RequestMapping("/api/v1")
@RestController
public class EmployeeRestController {

    @Autowired
    EmployeeService service;

    @GetMapping("/employees")
    List<Employee> getAllEmployees() {
        return service.findAll();
    }

    @PostMapping("/employees")
    Employee addEmployee(@RequestBody Employee newEmployee) {
        return service.add(newEmployee);
    }

    @GetMapping("/employees/{id}")
    Employee getEmployee(@PathVariable String id) {
        return service.findById(id);
    }

    @DeleteMapping("/employees/{id}")
    Employee deleteEmployee(@PathVariable String id) {
        return service.delete(id);
    }

    @PutMapping("/employees/{id}")
    Employee updateEmployee(@RequestBody Employee updatedEmployee, @PathVariable String id) {
        return service.update(id, updatedEmployee);
    }


















}

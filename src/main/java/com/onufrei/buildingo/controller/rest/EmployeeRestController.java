package com.onufrei.buildingo.controller.rest;

import com.onufrei.buildingo.model.Employee;
import com.onufrei.buildingo.service.employee.interfaces.EmployeeService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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

    @ApiOperation(value = "Returns list of employees")
    @GetMapping("/employees")
    List<Employee> getAllEmployees() {
        return service.findAll();
    }

    @ApiOperation(value = "Adds new employee")
    @PostMapping("/employees")
    Employee addEmployee(@ApiParam(
                            name = "Employee",
                            value = "The json of Employee. Id can be null. System will assign it automatically")
                         @RequestBody Employee newEmployee) {
        return service.add(newEmployee);
    }

    @ApiOperation("Gets employee with specified id")
    @GetMapping("/employees/{id}")
    Employee getEmployee(@ApiParam(name = "Id", value = "The employee id in UUID format") @PathVariable String id) {
        return service.findById(id);
    }

    @ApiOperation("Deletes employee with specified id")
    @DeleteMapping("/employees/{id}")
    Employee deleteEmployee(@ApiParam(name = "Id", value = "The employee id in UUID format") @PathVariable String id) {
        return service.delete(id);
    }

    @ApiOperation("Updates employee with specified id")
    @PutMapping("/employees/{id}")
    Employee updateEmployee(@ApiParam(name = "Id", value = "The employee id in UUID format")
                            @RequestBody Employee updatedEmployee, @PathVariable String id) {
        return service.update(id, updatedEmployee);
    }


















}

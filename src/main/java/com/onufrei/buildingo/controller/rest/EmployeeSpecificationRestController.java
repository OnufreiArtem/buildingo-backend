package com.onufrei.buildingo.controller.rest;

import com.onufrei.buildingo.model.EmployeeSpecification;
import com.onufrei.buildingo.service.employeeSpecification.interfaces.EmployeeSpecificationService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The representation of the object of EmployeeSpecificationRestController
 *
 * @author Artem Onufrei
 * @version 1
 * @since 08.04.2021
 */
@RequestMapping("/api/v1/employee-specifications")
@RestController
public class EmployeeSpecificationRestController {

    @Autowired
    EmployeeSpecificationService service;

    @ApiOperation(value = "Returns list of all possible specifications for the employee")
    @GetMapping("/")
    public List<EmployeeSpecification> getAllEmployeeSpecifications() {
        return service.findAll();
    }

    @ApiOperation(value = "Returns Employee specification by id")
    @GetMapping("/{id}")
    public EmployeeSpecification getEmployeeSpecificationById(
            @ApiParam(name = "Id", value = "Employee specification Id") @PathVariable String id) {
        return service.findById(id);
    }

    @ApiOperation(value = "Adds new employee specification")
    @PostMapping("/")
    public EmployeeSpecification addEmployeeSpecification(
            @ApiParam(name = "Employee Specification",
                    value = "Employee specification in Json format. Id cannot be specified. It will be set automatically")
            @RequestBody EmployeeSpecification employeeSpecification
    ) {
        return service.add(employeeSpecification);
    }

    @ApiOperation(value = "Updates existing employee specification with specified id")
    @PutMapping("/{id}")
    public EmployeeSpecification updateEmployeeSpecification(
            @ApiParam(name = "Employee Specification", value = "Employee specification in Json format.")
            @RequestBody EmployeeSpecification employeeSpecification,
            @ApiParam(name = "Id", value = "Employee specification Id you want to update") @PathVariable String id
    ) {
        return service.update(id, employeeSpecification);
    }

    @ApiOperation(value = "Removes existing employee specification with specified id")
    @DeleteMapping("/{id}")
    public EmployeeSpecification deleteEmployeeSpecification(
            @ApiParam(name = "Id", value = "Employee specification Id you want to delete") @PathVariable String id) {
        return service.delete(id);
    }

}

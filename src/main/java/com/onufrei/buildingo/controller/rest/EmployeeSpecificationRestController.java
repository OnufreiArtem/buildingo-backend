package com.onufrei.buildingo.controller.rest;

import com.onufrei.buildingo.model.EmployeeSpecification;
import com.onufrei.buildingo.service.employeeSpecification.interfaces.EmployeeSpecificationService;
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
@RequestMapping("/api/v1/employee")
@RestController
public class EmployeeSpecificationRestController {

    @Autowired
    EmployeeSpecificationService service;

    @GetMapping("/specifications/")
    public List<EmployeeSpecification> getAllEmployeeSpecifications() {
        return service.findAll();
    }

    @GetMapping("/specifications/{id}")
    public EmployeeSpecification getEmployeeSpecificationById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping("/specifications/")
    public EmployeeSpecification addEmployeeSpecification(@RequestBody EmployeeSpecification employeeSpecification) {
        return service.add(employeeSpecification);
    }

    @PutMapping("/specifications/{id}")
    public EmployeeSpecification updateEmployeeSpecification(@RequestBody EmployeeSpecification employeeSpecification,
                                                          @PathVariable String id) {
        return service.update(id, employeeSpecification);
    }

    @DeleteMapping("/specifications/{id}")
    public EmployeeSpecification deleteEmployeeSpecification(@PathVariable String id) {
        return service.delete(id);
    }

}

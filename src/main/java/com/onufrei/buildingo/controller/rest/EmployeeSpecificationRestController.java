package com.onufrei.buildingo.controller.rest;

import com.onufrei.buildingo.repos.EmployeeSpecificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * The representation of the object of EmployeeSpecificationRestController
 *
 * @author Artem Onufrei
 * @version 1
 * @since 08.04.2021
 */

@RestController
public class EmployeeSpecificationRestController {

    @Autowired
    EmployeeSpecificationRepository repo;




}

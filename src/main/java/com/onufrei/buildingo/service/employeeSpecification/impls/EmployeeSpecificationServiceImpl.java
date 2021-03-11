package com.onufrei.buildingo.service.employeeSpecification.impls;

import com.onufrei.buildingo.dao.employeeSpecification.interfaces.EmployeeSpecificationDao;
import com.onufrei.buildingo.model.EmployeeSpecification;
import com.onufrei.buildingo.service.employeeSpecification.interfaces.EmployeeSpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The representation of the object of EmployeeSpecificationServiceImpl
 *
 * @author Artem Onufrei
 * @version 1
 * @since 11.03.2021
 */

@Service
public class EmployeeSpecificationServiceImpl implements EmployeeSpecificationService {
    @Autowired
    EmployeeSpecificationDao dao;

    @Override
    public List<EmployeeSpecification> findAll() {
        return dao.findAll();
    }

    @Override
    public EmployeeSpecification findById(String id) {
        return dao.findById(id);
    }
}

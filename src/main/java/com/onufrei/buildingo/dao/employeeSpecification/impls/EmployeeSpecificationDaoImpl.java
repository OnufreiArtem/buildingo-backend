package com.onufrei.buildingo.dao.employeeSpecification.impls;

import com.onufrei.buildingo.dao.employeeSpecification.interfaces.EmployeeSpecificationDao;
import com.onufrei.buildingo.data.FakeDB;
import com.onufrei.buildingo.model.EmployeeSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The representation of the object of EmployeeSpecificationDaoImpl
 *
 * @author Artem Onufrei
 * @version 1
 * @since 11.03.2021
 */

@Component
public class EmployeeSpecificationDaoImpl implements EmployeeSpecificationDao {

    @Autowired
    FakeDB db;

    @Override
    public EmployeeSpecification findById(String id) {
        return db.specifications.stream()
                .filter(spec -> spec.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public EmployeeSpecification delete(String id) {
        return null;
    }

    @Override
    public EmployeeSpecification update(String id, EmployeeSpecification nEmployeeSpecification) {
        return null;
    }

    @Override
    public EmployeeSpecification add(EmployeeSpecification employeeSpecification) {
        return null;
    }

    @Override
    public List<EmployeeSpecification> findAll() {
        return db.specifications;
    }
}

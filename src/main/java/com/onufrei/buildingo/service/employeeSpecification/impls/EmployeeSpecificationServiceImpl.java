package com.onufrei.buildingo.service.employeeSpecification.impls;

import com.onufrei.buildingo.model.Employee;
import com.onufrei.buildingo.model.EmployeeSpecification;
import com.onufrei.buildingo.repos.EmployeeRepository;
import com.onufrei.buildingo.repos.EmployeeSpecificationRepository;
import com.onufrei.buildingo.service.employeeSpecification.interfaces.EmployeeSpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

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
    EmployeeSpecificationRepository repo;

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<EmployeeSpecification> findAll() {
        return repo.findAll();
    }

    @Override
    public EmployeeSpecification findById(String id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public EmployeeSpecification delete(String id) {
        EmployeeSpecification specification = findById(id);
        if(specification != null) repo.delete(specification);
        return specification;
    }

    @Override
    public EmployeeSpecification update(String id, EmployeeSpecification nEmployeeSpecification) {
        EmployeeSpecification oEmployeeSpecification = findById(id);
        nEmployeeSpecification.setId(id);
        nEmployeeSpecification.setCreated_at(oEmployeeSpecification.getCreated_at());
        if(findById(id) != null) {
            nEmployeeSpecification.setModified_at(LocalDateTime.now());
            repo.save(nEmployeeSpecification);
            return nEmployeeSpecification;
        }
        return null;
    }

    @Override
    public EmployeeSpecification add(EmployeeSpecification employeeSpecification) {
        employeeSpecification.setCreated_at(LocalDateTime.now());
        employeeSpecification.setModified_at(LocalDateTime.now());
        return repo.save(employeeSpecification);
    }

    @Override
    public EmployeeSpecification getTheRichestSpecification() {
        Map.Entry<EmployeeSpecification, Long> theRichestSpecification = employeeRepository
                .findAll()
                .stream()
                .map(Employee::getSpecification)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max((o1, o2) -> (int) (o1.getValue() * o1.getKey().getSalary() - o2.getValue() * o2.getKey().getSalary()))
                .orElse(null);

        return theRichestSpecification != null ? theRichestSpecification.getKey() : null;
    }

}

package com.onufrei.buildingo.controller.ui;

import com.onufrei.buildingo.data.FakeDB;
import com.onufrei.buildingo.model.Employee;
import com.onufrei.buildingo.service.employee.interfaces.EmployeeService;
import com.onufrei.buildingo.service.employeeSpecification.interfaces.EmployeeSpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

/**
 * The representation of the object of EmployeeUIController
 *
 * @author Artem Onufrei
 * @version 1
 * @since 09.03.2021
 */
@RequestMapping("/employee")
@Controller
public class EmployeeUIController {

    @Autowired
    EmployeeService service;

    @Autowired
    EmployeeSpecificationService specService;

    @GetMapping
    public String showEmployees(Model model) {
        model.addAttribute("empls", service.findAll());
        return "layout";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable String id, Model model) {
        model.addAttribute("empl", service.findById(id));
        return "edit";
    }

    @GetMapping("/add")
    public String showAdd(Model model) {
        model.addAttribute("empl", new Employee());
        model.addAttribute("specs", specService.findAll());
        return "add";
    }


    @GetMapping("/delete/{id}")
    public String deleteEmployees(@PathVariable String id, Model model) {
        service.delete(id);
        return "redirect:/employee";
    }

    @PostMapping("/update/{id}")
    public String updateEmployee(@PathVariable String id, @ModelAttribute Employee employee, Model model) {
        Employee old = service.findById(id);
        if(old != null) {
            employee.setId(old.getId());
            employee.setCreated_at(old.getCreated_at());
            service.update(id, employee);
        }

        return "redirect:/employee";
    }

    @PostMapping("/add")
    public String addEmployee(@ModelAttribute Employee employee, @RequestParam("specification") String specId, Model model) {
        if(!specId.equals("Nan")) {
          employee.setSpecification(specService.findById(specId));
        }
        service.add(employee);
        return "redirect:/employee";
    }





}

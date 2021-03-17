package com.onufrei.buildingo.controller.ui;

import com.onufrei.buildingo.form.EmployeeForm;
import com.onufrei.buildingo.service.employee.interfaces.EmployeeService;
import com.onufrei.buildingo.service.employeeSpecification.interfaces.EmployeeSpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        return "employee-list";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable String id, Model model) {
        model.addAttribute("empl", service.findById(id));
        model.addAttribute("specs", specService.findAll());
        return "edit";
    }

    @GetMapping("/{id}")
    public String showEmployee(@PathVariable String id, Model model) {
        model.addAttribute("empl", service.findById(id));
        return "view";
    }

    @GetMapping("/add")
    public String showAdd(Model model) {
        model.addAttribute("empl", new EmployeeForm());
        model.addAttribute("specs", specService.findAll());
        return "add";
    }


    @GetMapping("/delete/{id}")
    public String deleteEmployees(@PathVariable String id, Model model) {
        service.delete(id);
        return "redirect:/employee";
    }

    @PostMapping("/edit/{id}")
    public String updateEmployee(@PathVariable String id, @ModelAttribute EmployeeForm employeeForm, Model model) {

        var employeeToUpdate = service.getEmployeeFromForm(id, employeeForm);
        service.update(id, employeeToUpdate);

        return "redirect:/employee";
    }

    @PostMapping("/add")
    public String addEmployee(@ModelAttribute EmployeeForm employeeForm, Model model) {
        var employeeToUpdate = service.getEmployeeFromForm(null, employeeForm);
        service.add(employeeToUpdate);
        return "redirect:/employee";
    }





}

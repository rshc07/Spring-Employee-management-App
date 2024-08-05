package com.guvi.employeemanagement.controller;
import com.guvi.employeemanagement.model.Employee;
import com.guvi.employeemanagement.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@Tag(name = "Employee Management System", description = "Operations pertaining to employees in Employee Management System")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Operation(summary = "View the home page", description = "Displays the home page with a list of all employees")
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listEmployees", employeeService.getAllEmployees());
        return "index";
    }
    @Operation(summary = "Show new employee form", description = "Displays a form to create a new employee")
    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "new_employee";
    }
    @Operation(summary = "Save an employee", description = "Saves a new or updated employee")
    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }
    @Operation(summary = "Show form for updating an employee", description = "Displays a form to update an existing employee")
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "update_employee";
    }
    @Operation(summary = "Delete an employee", description = "Deletes an employee by ID")
    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value = "id") long id) {
        this.employeeService.deleteEmployeeById(id);
        return "redirect:/";
    }
    @Operation(summary = "View an employee", description = "Displays details of a specific employee")
    @GetMapping("/viewEmployee/{id}")
    public String viewEmployee(@PathVariable(value = "id") long id, Model model) {
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "view_employee";
    }
}
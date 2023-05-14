package com.wilfred.employeeservice.controller;

import com.wilfred.employeeservice.model.Employee;
import com.wilfred.employeeservice.repository.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.add(employee);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Employee> getList() {
        return employeeService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Employee findById(@PathVariable Long id) {
        return employeeService.findById(id);

    }

    @GetMapping("/department/{departmentId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Employee findByDepartmentId(@PathVariable Long departmentId) {
        return employeeService.findByDepartmentId(departmentId);
    }

    @GetMapping("/departments/{departmentId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Employee> findEmployeesByDepartmentId(@PathVariable Long departmentId) {
        return employeeService.findEmployeesByDepartmentId(departmentId);

    }
}

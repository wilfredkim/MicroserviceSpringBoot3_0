package com.wilfred.department.departmentservice.controller;

import com.wilfred.department.departmentservice.client.EmployeeClient;
import com.wilfred.department.departmentservice.model.Department;
import com.wilfred.department.departmentservice.model.Employee;
import com.wilfred.department.departmentservice.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/department")
public class DepartmentController {
    @Autowired
    public DepartmentRepository departmentRepository;
    @Autowired
    private EmployeeClient employeeClient;

    @PostMapping
    public Department addDepartment(@RequestBody Department department) {
        return departmentRepository.add(department);

    }

    @GetMapping
    public List<Department> getList() {
        return departmentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable Long id) {
        return departmentRepository.findById(id);
    }

    @GetMapping("findEmployeesInDepartment")
    public List<Department> findEmployeesInDepartment() {
        List<Department> departmentList = departmentRepository.findAll();
        departmentList.forEach(department -> department.setEmployees(employeeClient.findEmployeesByDepartmentId(department.getId())));
        return departmentList;
    }
}

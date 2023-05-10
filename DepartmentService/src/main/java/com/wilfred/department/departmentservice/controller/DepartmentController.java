package com.wilfred.department.departmentservice.controller;

import com.wilfred.department.departmentservice.model.Department;
import com.wilfred.department.departmentservice.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/department")
@RequiredArgsConstructor
public class DepartmentController {

    public DepartmentRepository departmentRepository;

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
}

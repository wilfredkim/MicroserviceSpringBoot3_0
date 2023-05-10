package com.wilfred.department.departmentservice.repository;

import com.wilfred.department.departmentservice.model.Department;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface DepartmentRepository {

    Department add(Department department);

    List<Department> findAll();

    Department findById(Long id);
}

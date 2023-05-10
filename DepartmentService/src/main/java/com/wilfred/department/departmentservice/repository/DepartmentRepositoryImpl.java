package com.wilfred.department.departmentservice.repository;

import com.wilfred.department.departmentservice.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class DepartmentRepositoryImpl implements DepartmentRepository {
    List<Department> departmentList = new ArrayList<>();

    @Override
    public Department add(Department department) {
        departmentList.add(department);
        return department;
    }

    @Override
    public List<Department> findAll() {
        return departmentList;
    }

    @Override
    public Department findById(Long id) {
        return departmentList.stream().filter(department -> department.getId().equals(id)).findFirst().orElseThrow();
    }
}

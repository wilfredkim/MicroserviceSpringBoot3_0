package com.wilfred.employeeservice.repository;

import com.wilfred.employeeservice.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee add(Employee employee);

    List<Employee> findAll();

    Employee findById(Long id);

    Employee findByDepartmentId(Long departmentId);

    List<Employee> findEmployeesByDepartmentId(Long departmentId);
}

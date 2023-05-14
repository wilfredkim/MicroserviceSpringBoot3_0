package com.wilfred.employeeservice.repository;

import com.wilfred.employeeservice.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> employeeList = new ArrayList<>();

    @Override
    public Employee add(Employee employee) {
        employeeList.add(employee);
        return employee;
    }

    @Override
    public List<Employee> findAll() {
        return employeeList;
    }

    @Override
    public Employee findById(Long id) {

        return employeeList.stream().filter(employee -> employee.id().equals(id)).findFirst().orElseThrow();
    }

    @Override
    public Employee findByDepartmentId(Long departmentId) {
        return employeeList.stream().filter(employee -> employee.departmentId().equals(departmentId)).findFirst().orElseThrow();
    }

    @Override
    public List<Employee> findEmployeesByDepartmentId(Long departmentId) {
        return employeeList.stream().filter(employee -> employee.departmentId().equals(departmentId)).toList();

    }
}

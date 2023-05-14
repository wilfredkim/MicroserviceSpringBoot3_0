package com.wilfred.department.departmentservice.client;

import com.wilfred.department.departmentservice.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface EmployeeClient {
    @GetExchange("/api/v1/employee/departments/{departmentId}")
    List<Employee> findEmployeesByDepartmentId(@PathVariable Long departmentId);

}

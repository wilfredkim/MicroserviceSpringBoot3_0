package com.wilfred.employeeservice.model;

public record Employee(Long id, Long departmentId, String position, String name, int age) {
}

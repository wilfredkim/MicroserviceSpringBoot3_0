package com.wilfred.department.departmentservice.model;

public record Employee(Long id, Long departmentId,String position, String name, int age) {
}

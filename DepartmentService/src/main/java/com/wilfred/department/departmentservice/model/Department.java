package com.wilfred.department.departmentservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private Long id;

    private String name;
    private String description;

    List<Employee> employees = new ArrayList<>();
}

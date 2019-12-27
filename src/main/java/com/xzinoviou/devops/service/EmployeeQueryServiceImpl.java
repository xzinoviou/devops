package com.xzinoviou.devops.service;

import com.xzinoviou.devops.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeQueryServiceImpl implements EmployeeQueryService {


    public EmployeeQueryServiceImpl() {
    }

    @Override
    public Employee getById(Long id) {
        return createEmployees().stream()
                .filter(x -> x.getId().equals(id)).findFirst().orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    @Override
    public List<Employee> getAll() {
        return createEmployees();
    }

    private List<Employee> createEmployees() {
        return Arrays.asList(
                new Employee(1L, "Ash", "Hollywood"),
                new Employee(2L, "Jill", "Kelly"),
                new Employee(3L, "Kagney", "Linn Karter"),
                new Employee(4L, "Kaitlyn", "Ashley"),
                new Employee(5L, "Jeanna", "Fine")
        );
    }
}

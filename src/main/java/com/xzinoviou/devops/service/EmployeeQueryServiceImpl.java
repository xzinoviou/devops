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
                new Employee(1L, "Mike", "Conway"),
                new Employee(2L, "Jimmy", "Hoffa"),
                new Employee(3L, "Stewart", "Kewon"),
                new Employee(4L, "Helen", "Mobius"),
                new Employee(5L, "Fiona", "Helstrom")
        );
    }
}

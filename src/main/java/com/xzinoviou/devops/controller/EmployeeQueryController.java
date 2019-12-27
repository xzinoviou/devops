package com.xzinoviou.devops.controller;

import com.xzinoviou.devops.model.Employee;
import com.xzinoviou.devops.service.EmployeeQueryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/employee")
public class EmployeeQueryController {

    private final EmployeeQueryService employeeQueryService;

    public EmployeeQueryController(EmployeeQueryService employeeQueryService) {
        this.employeeQueryService = employeeQueryService;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Employee> getById(@PathVariable Long id) {
        return ResponseEntity.ok(employeeQueryService.getById(id));
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<Employee>> getAll() {
        return ResponseEntity.ok(employeeQueryService.getAll());
    }
}

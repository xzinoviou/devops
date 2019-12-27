package com.xzinoviou.devops.service;

import com.xzinoviou.devops.model.Employee;

import java.util.List;

public interface EmployeeQueryService {

    Employee getById(Long id);

    List<Employee> getAll();

}

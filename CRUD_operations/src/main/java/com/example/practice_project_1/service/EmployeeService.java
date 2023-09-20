package com.example.practice_project_1.service;

import com.example.practice_project_1.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployee(long id);
    Employee updateEmployee(Employee employee, long id);
    void deleteEmployee(long id);
}

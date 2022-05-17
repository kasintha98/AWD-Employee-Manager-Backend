package com.employee.manager.service;

import com.employee.manager.model.Employee;

import java.util.List;

public interface EmployeeService
{
    Employee addEmployee(Employee employee);
    List<Employee> getAllEmployees();
}

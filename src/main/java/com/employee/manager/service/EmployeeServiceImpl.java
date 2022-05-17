package com.employee.manager.service;

import com.employee.manager.model.Employee;

import java.util.List;

import com.employee.manager.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class EmployeeServiceImpl implements EmployeeService
{
    private final EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee( Employee employee )
    {
        log.info("Saving employee {} to the database", employee.getFirstName());
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees()
    {
        log.info("Getting all the employee from the database");
        return employeeRepository.findAll();
    }
}

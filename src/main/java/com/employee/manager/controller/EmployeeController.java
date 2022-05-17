package com.employee.manager.controller;

import com.employee.manager.model.Employee;
import com.employee.manager.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController
{
    private final EmployeeService employeeService;

    @GetMapping("/getAllEmployees")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return ResponseEntity.ok().body( employeeService.getAllEmployees() );
    }

    @PostMapping("/addEmployee")
    public ResponseEntity<Employee> addEmployee( @RequestBody Employee employee ){
        URI uri = URI.create( ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/employee/addEmployee").toUriString() );
        return ResponseEntity.created( uri ).body( employeeService.addEmployee( employee ) );
    }
}

package com.employee.manager.repository;
import com.employee.manager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
}

package com.guvi.employeemanagement.repository;

import com.guvi.employeemanagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
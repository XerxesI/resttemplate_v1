package com.progile.resttemplate.repository;

import com.progile.resttemplate.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

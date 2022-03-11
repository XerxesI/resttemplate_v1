package com.progile.resttemplate.controller;

import com.progile.resttemplate.dto.Employee;
import com.progile.resttemplate.dto.UserResponse;
import com.progile.resttemplate.repository.EmployeeRepository;
import com.progile.resttemplate.repository.UserResponseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final EmployeeRepository employeeRepository;
    private final UserResponseRepository userResponseRepository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/users")
    public List<UserResponse> getAllUsers() {
        return userResponseRepository.findAll();
    }
}

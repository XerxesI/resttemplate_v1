package com.progile.resttemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.progile.resttemplate.dto.Employee;
import com.progile.resttemplate.dto.UserResponse;
import com.progile.resttemplate.repository.EmployeeRepository;
import com.progile.resttemplate.repository.UserResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


@SpringBootApplication
public class ResttemplateApplication {

    @Autowired
    public UserResponseRepository userResponseRepository;

    @Autowired
    public EmployeeRepository employeeRepository;

    private static final String GET_ALL_USERS_API = "https://jsonplaceholder.typicode.com/users";
    private static final String GET_ALL_EMPLOYEES_API = "https://jsonplaceholder.typicode.com/todos";
    static RestTemplate restTemplate = new RestTemplate();

    public static void main(String[] args) {
        SpringApplication.run(ResttemplateApplication.class, args);
    }





}

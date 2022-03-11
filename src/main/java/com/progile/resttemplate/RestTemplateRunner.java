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
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class RestTemplateRunner implements CommandLineRunner {

    @Autowired
    public UserResponseRepository userResponseRepository;

    @Autowired
    public EmployeeRepository employeeRepository;

    private static final String GET_ALL_USERS_API = "https://jsonplaceholder.typicode.com/users";
    private static final String GET_ALL_EMPLOYEES_API = "https://jsonplaceholder.typicode.com/todos";
    static RestTemplate restTemplate = new RestTemplate();
    @Override
    public void run(String... args) throws Exception {
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.enable(SerializationFeature.INDENT_OUTPUT);
//        String json = mapper.writeValueAsString(callUserApi());
//        System.out.println(json);

        // employeeRepository.saveAll(Arrays.asList(callEmployeesAPI2()));
        employeeRepository.saveAll(callEmployeesAPI3());
        userResponseRepository.saveAll(callUserApi2());

    }


    private List<UserResponse> callUserApi() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        ResponseEntity<List> response =
                restTemplate.getForEntity(GET_ALL_USERS_API, List.class);
        List<UserResponse> userResponses = response.getBody();

//        System.out.println(employees);
//        String json = mapper.writeValueAsString(userResponses);
//        System.out.println(json);
        return userResponses;
    }

    private List<Employee> callEmployeesAPI() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        ResponseEntity<List> response =
                restTemplate.getForEntity(GET_ALL_EMPLOYEES_API, List.class);
        List<Employee> employees = response.getBody();

        System.out.println(employees);
//        String json = mapper.writeValueAsString(employees);
//        System.out.println(json);
        return employees;
    }
    private List<Employee> callEmployeesAPI2()  {
        ResponseEntity<List> response =
                restTemplate.getForEntity(GET_ALL_EMPLOYEES_API, List.class);
        List<Employee> employees = response.getBody();

        System.out.println(employees);

        return employees;
    }
    private List<Employee> callEmployeesAPI3()  {
        List<Employee> employees =
                Arrays.asList(restTemplate.getForObject(GET_ALL_EMPLOYEES_API, Employee[].class));

        System.out.println(employees);

        return employees;
    }

    private List<UserResponse> callUserApi2() {
        List<UserResponse> userResponses =
                Arrays.asList(restTemplate.getForObject(GET_ALL_USERS_API, UserResponse[].class));

//        System.out.println(employees);
//        String json = mapper.writeValueAsString(userResponses);
//        System.out.println(json);
        return userResponses;
    }

}

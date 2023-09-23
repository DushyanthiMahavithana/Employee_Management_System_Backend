package com.dushyanthi.employeesystem.controller;

import com.dushyanthi.employeesystem.model.Employee;
import com.dushyanthi.employeesystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/add")
    public String add(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return "ADDED NEW EMPLOYEE";
    }

    @GetMapping("/getAll")
    public List<Employee>getAllEmployees(){
        return employeeService.getAllEmployees();
    }

}

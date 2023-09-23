package com.dushyanthi.employeesystem.service;

import com.dushyanthi.employeesystem.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public List<Employee>getAllEmployees();

}

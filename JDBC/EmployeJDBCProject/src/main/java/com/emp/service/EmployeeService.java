package com.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.DAO.EmployeeDAO;
import com.emp.model.Employee;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    // Method to save employee
    public String saveEmployee(Employee employee) {
        int result = employeeDAO.saveEmployee(employee);
        return result == 1 ? "Employee inserted successfully!" : "Error inserting employee.";
    }
}


package com.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.emp.model.Employee;
import com.emp.service.EmployeeService;

@RestController
@RequestMapping("/employe")

public class EmployeeController {
	 @Autowired
	    private EmployeeService employeeService;

	    @PostMapping("/add")
	    public String addEmployee(@RequestBody Employee employe) {
	        return employeeService.saveEmployee(employe);
	    }

}

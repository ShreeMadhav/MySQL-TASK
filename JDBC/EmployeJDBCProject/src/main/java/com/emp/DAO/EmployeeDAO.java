package com.emp.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.emp.model.Employee;

@Repository

public class EmployeeDAO {
	 @Autowired
	    private JdbcTemplate jdbcTemplate;

	    // Method to insert employee data into the Employee table
	    public int saveEmployee(Employee employee) {
	        String sql = "INSERT INTO Employe (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";
	        return jdbcTemplate.update(sql, employee.getEmpcode(), employee.getEmpname(), employee.getEmpage(), employee.getEsalary());
	    }
	}
	

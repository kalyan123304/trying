package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Employee;

public interface Employeeservice {
	Employee saveEmployee(Employee saveEmployee);
	List<Employee>getAllEmployee();

}

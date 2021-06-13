package com.springboot.microservices.demo.service;

import java.util.List;

import com.springboot.microservices.demo.entities.Employee;

public interface IEmployeeService {
	public void saveEmployee(Employee employee);
	public void deleteEmployee(Long id);
	public List<Employee> getEmployeeByEmployeeDetails(String firstName,String lastName,String department);
	public List<Employee> getAllEmployees();
}

package com.springboot.microservices.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springboot.microservices.demo.entities.Employee;
import com.springboot.microservices.demo.repo.EmployeeRepository;
import com.springboot.microservices.demo.service.IEmployeeService;

@Service
@Qualifier("principal")
public class ServicioPrincipal implements IEmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);

	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);

	}

	@Override
	public List<Employee> getEmployeeByEmployeeDetails(String firstName, String lastName, String department) {
		List<Employee> employees= employeeRepository.findByFirstNameAndLastNameAndDepartment(firstName, lastName, department);
		return employees;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return new ArrayList<>();//employeeRepository.findAll();
	}

}

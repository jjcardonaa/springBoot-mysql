package com.springboot.microservices.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.microservices.demo.entities.Employee;
import com.springboot.microservices.demo.service.IEmployeeService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class EmployeeController {

	@Autowired
	@Qualifier("principal")
	IEmployeeService employeeService;
	
	
	@ApiOperation(value="My servicio to save employee")
	@ApiResponses({
		@ApiResponse(code=200, message="Successfully saved employee",response=EmployeeController.class),
		@ApiResponse(code=500, message="Internal server error",response=Exception.class),
		@ApiResponse(code=404, message="Unable to find contracts",response=Exception.class)
	})
	@PostMapping("/saveEmployee")
	public ResponseEntity<Object> saveAllEmployee(@RequestBody Employee employee){
		employeeService.saveEmployee(employee);
		return new ResponseEntity<Object>("Successfully Saved!",HttpStatus.OK);
	}
	
	@ApiOperation(value="Service to retrieve employees base on employee details")
	@ApiResponses({
		@ApiResponse(code=200,message="Fetched all employees",response=EmployeeController.class),
		@ApiResponse(code=500,message = "Internal server error", response=Exception.class),
		@ApiResponse(code=404, message="Unable to find contracts",response=Exception.class
		)
	})
	@GetMapping("/getEmployees/firstName{firstName}/lastName/{lastName}/department/{dept}")
	public ResponseEntity<Object> getEmployeeByEmployeeDetails(@RequestParam String firstName,
			@RequestParam String lastName, @RequestParam String dept){
		List<Employee> employees= employeeService.getEmployeeByEmployeeDetails(firstName, lastName, dept);
		return new ResponseEntity<Object>(employees,HttpStatus.OK);
	}

	@GetMapping("/getEmployees")
	public ResponseEntity<Object> getEmployeeAll(){
		List<Employee> employees= employeeService.getAllEmployees();
		return new ResponseEntity<Object>(employees,HttpStatus.OK);
	}
	
	
	@ApiOperation(value="Delete employee", notes="Delete operation  based on given  employee_id")
	@ApiResponses({
		@ApiResponse(code=200,message="Successfully Deleted  Employee",response=EmployeeController.class),
		@ApiResponse(code=500,message = "Internal server error", response=Exception.class),
		@ApiResponse(code=404, message="Unable to find contracts",response=Exception.class
		)
	})
	@DeleteMapping(value="/deleteEmployee/id/{id}")
	public ResponseEntity<Object> deleteAllEmployees(@PathVariable Long id){
		employeeService.deleteEmployee(id);
		return new ResponseEntity<Object>("Employee deleted succesfully",HttpStatus.OK);
	}
	

}

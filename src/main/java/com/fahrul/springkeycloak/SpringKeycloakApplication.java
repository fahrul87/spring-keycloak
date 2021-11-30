package com.fahrul.springkeycloak;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fahrul.springkeycloak.entity.Employee;
import com.fahrul.springkeycloak.service.EmployeeService;

@SpringBootApplication
@RestController
@RequestMapping("*/employees")
public class SpringKeycloakApplication {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/{employeeIs}")
	@RolesAllowed("user")
	public ResponseEntity<Employee> getEmployee(@PathVariable int employeeId) {
		return ResponseEntity.ok(employeeService.getEmployee(employeeId));
	}

	@GetMapping
	@RolesAllowed("admin")
	public ResponseEntity<List<Employee>> findAllEmployees() {
		return ResponseEntity.ok(employeeService.getAllEmployees());
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringKeycloakApplication.class, args);
	}

}

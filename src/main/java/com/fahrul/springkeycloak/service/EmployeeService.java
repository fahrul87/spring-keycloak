package com.fahrul.springkeycloak.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fahrul.springkeycloak.entity.Employee;
import com.fahrul.springkeycloak.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public void initializeEmployeeTable() {
		employeeRepository.saveAll(
				Stream.of(new Employee("Fahrul", 20000), new Employee("Arka", 55000), new Employee("Azriel", 120000))
						.collect(Collectors.toList()));
	}

	public Employee getEmployee(int employeeId) {
		return employeeRepository.findById(employeeId).orElse(null);
	}
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}

}

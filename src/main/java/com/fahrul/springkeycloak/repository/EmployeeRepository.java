package com.fahrul.springkeycloak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fahrul.springkeycloak.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

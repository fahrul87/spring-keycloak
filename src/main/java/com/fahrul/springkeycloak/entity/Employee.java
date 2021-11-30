package com.fahrul.springkeycloak.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Employee {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private double salary;

	public Employee(String name, double salary) {

		this.name = name;
		this.salary = salary;
	}

}

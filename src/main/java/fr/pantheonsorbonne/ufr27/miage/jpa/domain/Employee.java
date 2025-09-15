package fr.pantheonsorbonne.ufr27.miage.jpa.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private Long id;

	private String name;
	
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@ManyToOne
	private Department department;

	public Employee() {
	}

	public Employee(String name, Department department, double salary) {
		this.name = name;
		this.department = department;
		this.salary=salary;
	}

	public Employee(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}


}

package com.cg.eis.bean;

import com.cg.eis.exception.EmployeeException;



public class Employee {
	
	int Id;
	String name, Designation;
	double salary;
	char schema;
	public Employee(){}
	public Employee(int id, String name, String designation, double salary,
			char schema) {
		super();
		Id = id;
		this.name = name;
		Designation = designation;
		this.salary = salary;
		this.schema = schema;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public char getSchema() {
		return schema;
	}
	public void setSchema(char schema) {
		this.schema = schema;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", Designation="
				+ Designation + ", salary=" + salary + ", schema=" + schema
				+ "]";
	}
	public double SalValidate(double salary)throws EmployeeException
	{
		if(salary<3000)
		{
			 throw new EmployeeException("salary can not be less than 3000");
		}
		else
			return salary;
	}
	
	

}

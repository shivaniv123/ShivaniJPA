package com.cg.employee.dto;

import java.time.LocalDate;

public class Employee {
      private int empId;
      private String empName;
      private int empSal;
      private LocalDate bDate;
      public Employee()
      {}
	public Employee(int empId, String empName, int empSal, LocalDate bDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.bDate = bDate;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public LocalDate getbDate() {
		return bDate;
	}
	public void setbDate(LocalDate bDate) {
		this.bDate = bDate;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSal=" + empSal + ", bDate=" + bDate + "]";
	}
      
      
}

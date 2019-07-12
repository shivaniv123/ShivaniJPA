package com.cg.intro;

public class Employee implements IEmployee{
	int id;
    String name;
    double sal;
    boolean flag;
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public double getSal() {
		
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public double Salary(double deduct) {
		// TODO Auto-generated method stub
	System.out.println("salary"+getSal());
		return sal-deduct;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal
				+ ", flag=" + flag + "]";
	}
	
    

}

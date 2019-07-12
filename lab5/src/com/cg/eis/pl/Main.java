package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.Service;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	  Scanner sc=new Scanner(System.in);
      Employee obj=new Employee();
	  System.out.println("Enter your Id: ");
      int id=sc.nextInt();
      System.out.println("Enter your Name : ");
      String name= sc.next();
      System.out.println("Enter Salary : ");
      double sal=sc.nextDouble();
      Service ser=new Service();
      ser.Insurance(sal);
      
     
	
  
	  System.out.println("Employee Details ");
	  System.out.println("------------------");
	  System.out.println("Name  = "+name);
	  System.out.println("ID    = "+id);
	  System.out.println("Salary="+sal);
	  ser.Insurance(sal);
	  
	  try {
			double salar=obj.SalValidate(sal);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
  
}
}

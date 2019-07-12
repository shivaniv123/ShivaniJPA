package com.cg.employee.pl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import com.cg.employee.dto.Employee;
import com.cg.employee.exception.EmployeeException;
import com.cg.employee.service.EmployeeService;
import com.cg.employee.service.EmployeeServiceImpl;

public class MainClass {

	static EmployeeService service = 
			new EmployeeServiceImpl();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice = 0;
		try(Scanner sc = new Scanner(System.in))
		{
			do
			{
				System.out.println("1-Add Employee");
				System.out.println("2-Remove Employee");
				System.out.println("3-Search By Id");
				System.out.println("4-Search All");
				System.out.println("5- update Employee");
				System.out.println("Enter choice::");
				choice = sc.nextInt();
				switch(choice)
				{
					case 1 : 
						
						Employee emp = acceptEmployeeDetails(); 
					if(emp!=null){	
					try
					{
						int id = service.addEmployee(emp);
						System.out.println("inserted and id = "+id);
					}
					catch(EmployeeException e)
					{
						System.out.println(e.getMessage());
					}}
					break;
					case 2: System.out.println("Enter to id to remove::");
					int id = sc.nextInt();
					try
					{
						Employee emp1 = service.removeEmployee(id);
						System.out.println("removed Employee "+emp1);
					}
					catch(EmployeeException e)
					{
						System.out.println(e.getMessage());
					}
					break;
					
					case 3 : System.out.println("Enter id to search Employee::");
					int eid = sc.nextInt();
					try
					{
						Employee ref = service.getEmployeeById(eid);
						System.out.println("emp "+ref);
					}
					catch(EmployeeException e)
					{
						System.out.println(e.getMessage());
					}
					break;
					
					case 4 : 
						try{ArrayList<Employee>list = 
						service.getAllEmployee();
						for(Employee obj : list)
						{
							System.out.println(obj);
						}
						}
						catch(EmployeeException e)
						{
							System.out.println(e.getMessage());
						}
						break;
					case 5: System.out.println("Enter id::");
					int empId = sc.nextInt();
					System.out.println("Update Salary");
					int salary = sc.nextInt();
					try{
						Employee eObj = service.updateEmployee(empId, salary);
						System.out.println("updated = "+eObj);
					}
					catch(EmployeeException e)
					{
						System.out.println(e.getMessage());
					}
					break;
				}
				System.out.println("do you want to continue 1-yes 0-No");
				choice = sc.nextInt();
			}while(choice!=0);
		}

		
	}
	public static Employee acceptEmployeeDetails()
	{
		Employee emp = null;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter name::");
			String name = sc.next();
			if(!service.validateName(name))
			{
				continue;
			}
			else
			{
				while(true)
				{
					System.out.println("Enter salary::");
					int sal = sc.nextInt();
					if(!service.validateSalary(sal))
					{
						continue;
					}
					else
					{
						System.out.println("Enter date::");
						String date = sc.next();
						DateTimeFormatter format = 
								DateTimeFormatter.ofPattern("dd/MM/yyyy");
						LocalDate bdate = LocalDate.parse(date, format);
						if(bdate!=null)
						{
							emp = new Employee();
							emp.setEmpName(name);
							emp.setEmpSal(sal);
							emp.setbDate(bdate);
							break;
						}
					}
				}
			}
			return emp;
		}
		
	}	
}






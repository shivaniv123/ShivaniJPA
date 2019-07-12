package com.cg.eis.service;
 
	public class Service implements EmployeeService
	{
		@Override
		public void Insurance(double salary)
		{
			 if(salary<5000)
			{
				System.out.println("Designation = Clerk");
				System.out.println("Insurance Scheme = No Scheme ");
			}
			 else if (salary>=5000 && salary<20000)
			{
				System.out.println("Designation = System Association");
				System.out.println("Insurance Scheme = Scheme C");
			}
			else if(salary>=20000 && salary<40000)
			{
				System.out.println("Designation = Programmer");
				System.out.println("Insurance Scheme = Scheme B");
			}
			else if(salary>=40000)
			{
				System.out.println("Designation = Manager");
				System.out.println("Insurance Scheme = Scheme A");
			}
			
		}
	}


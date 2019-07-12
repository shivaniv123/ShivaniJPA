package com.cg.hospital.pl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import com.cg.hospital.dto.Hospital;
import com.cg.hospital.exception.HospitalException;
import com.cg.hospital.service.HospitalService;
import com.cg.hospital.service.HospitalServiceImpl;

public class MainClass {
	static HospitalService service = new HospitalServiceImpl();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice = 0;
		try(Scanner sc = new Scanner(System.in))
		{
			do
			{
				System.out.println("1-Add patient in ward");
				System.out.println("2-Remove patient from ward");
				System.out.println("3-Search By patient Id in hospital");
				System.out.println("4-Search All patient in hospital");
				System.out.println("5- update patient record in  hospital ");
				System.out.println("Enter your choice::");
				choice = sc.nextInt();
				switch(choice)
				{
					case 1 : 
						
						Hospital emp = acceptHospitalDetails(); 
					if(emp!=null){	
					try
					{
						int id = service.addHospital(emp);
						System.out.println("record inserted and id = "+id);
					}
					catch(HospitalException e)
					{
						System.out.println(e.getMessage());
					}}
					break;
					case 2: System.out.println("Enter patient  id to remove from hospital::");
					int id = sc.nextInt();
					try
					{
						Hospital emp1 = service.removeHospital(id);
						System.out.println("patient has been removed  "+emp1);
					}
					catch(HospitalException e)
					{
						System.out.println(e.getMessage());
					}
					break;
					
					case 3 : System.out.println("Enter id to search Patient in hospital::");
					int eid = sc.nextInt();
					try
					{
						Hospital ref = service.getHospitalById(eid);
						System.out.println("emp "+ref);
					}
					catch(HospitalException e)
					{
						System.out.println(e.getMessage());
					}
					break;
					
					case 4 : 
						try
						{							
							ArrayList<Hospital>list = service.getAllHospital();
						
							for(Hospital obj : list)
						{
							System.out.println(obj);
						}
						}
						catch(HospitalException e)
						{
							System.out.println(e.getMessage());
						}
						break;
					case 5: System.out.println("Enter id of patient to update his/her record::");
					int pId = sc.nextInt();
					int bill = sc.nextInt();
					try{
						Hospital eObj = service.updateHospital(pId, bill);
						System.out.println("records has been updated = "+eObj);
					}
					catch(HospitalException e)
					{
						System.out.println(e.getMessage());
					}
					break;
				}
				System.out.println("do you want to continue 1-yes   0-No");
				choice = sc.nextInt();
			}while(choice!=0);
		}

		
	}
	public static Hospital acceptHospitalDetails()
	{
		Hospital emp = null;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter patient name to get admitted::");
			String name = sc.next();
			if(!service.validateName(name))
			{
				continue;
			}
			else
			{
				while(true)
				{
					System.out.println("Enter Bill amount of patient::");
					int bill = sc.nextInt();
					System.out.println("Enter Phone number of patient::");
					int phone = sc.nextInt();
							emp = new Hospital();
							emp.setpName(name);
							emp.setpBill(bill);
							emp.setPhone(phone);
							break;
						}
					}
				
			
			return emp;
		}
		
	}	
}


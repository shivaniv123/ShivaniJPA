package com.capgemini.cabs.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.cab.exception.CabException;
import com.capgemini.cab.service.CabService;
import com.capgemini.cab.service.ICabService;
import com.capgemini.cabs.bean.CabRequest;




public class Client {

	static  ICabService service = 
			new CabService();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		try(Scanner sc = new Scanner(System.in))
		{
			do
			{
				System.out.println("1- Raise Cab Request");
				System.out.println("2- View Cab Request Status");
				System.out.println("3-Exit");
				
				System.out.println("Enter choice::");
				choice = sc.nextInt();
				switch(choice)
				{
					case 1 : 
						
						CabRequest request = acceptCabDetails(); 
					if(request!=null){	
					try
					{
						int id = service.addCabRequestDetails(request);
						System.out.println("inserted and id = "+id);
					}
					catch(CabException e)
					{
						System.out.println(e.getMessage());
					}}
					break;
					
					
					case 2: System.out.println("Enter Request Id to View Details");
					int eid = sc.nextInt();
					try
					{
						CabRequest ref = service.getRequestDetails(eid);
						System.out.println("request "+ref);
					}
					catch(CabException e)
					{
						System.out.println(e.getMessage());
					}
					break;
					case 3:System.out.println("Exit");
					break;
				default: System.out.println("Invalid Choice");
					
				}
				System.out.println("do you want to continue 1-yes 0-No");
				choice = sc.nextInt();
			}while(choice!=0);
		}

	}

	private static CabRequest acceptCabDetails() {
		// TODO Auto-generated method stub
		CabRequest request = null;
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("Enter Customer name:");
			String name = sc.next();
			if(!service.validateName(name))
			{
				continue;
			}
			else
			{
				while(true)
				{
					System.out.println("Enter Phone No::");
					long phn= sc.nextLong();
					if(!service.validatePhnNumber(phn))
					{
						continue;
					}
					else
					{ 
											
											
												System.out
														.println("Enter Address::");
											String address=sc.next();
											System.out.println("Enter Pincode");
											String pin=sc.next();
											if(!service.validatePin(pin))
                                                  continue;
											
											if(pin!=null)
											{
												request = new CabRequest();
											request.setCustomer_name(name);
											request.setPhone_number(phn);
											
											request.setAddress_of_pickup(address);
											request.setPincode(pin);
												
											
											}	
											
										}
								break;	}
								}
						break;	}
		return request;
						
							
					
					
						
						
					}
				
			
		
		
	}



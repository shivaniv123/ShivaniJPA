package com.cg.webservice;

import java.net.URL;
import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		URL url = new URL("http://localhost:"
				+ "8081/cs?wsdl");
		
		QName qname = new QName("http://webservice.cg.com/",
				"ProductService");
		
		Service service = Service.create(url, qname);

		ProductServer endPointIntf = service.getPort(ProductServer.class);
		
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scanner.next();
		System.out.println(""+endPointIntf.searchByName(name));
		
	}

	
}

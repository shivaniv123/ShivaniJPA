package com.cg.intro;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String args[]) throws Exception {

		Resource res = new ClassPathResource("emp.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		Employee e=(Employee) factory.getBean("employ");
	    double deduct=e.Salary(123.0);
	    System.out.println("net salary ="+deduct);
	    System.out.println(e);
	
	}

}

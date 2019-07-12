package com.cg.triangle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  

		Resource res = new ClassPathResource("triangle.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		Triangle t=(Triangle) factory.getBean("trian");
		
		System.out.println("Triangle Points ");t.Draw();
	}

}

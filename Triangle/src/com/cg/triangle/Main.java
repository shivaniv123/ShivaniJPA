package com.cg.triangle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Main {



		public static void main(String args[]) throws Exception {

			Resource res = new ClassPathResource("triangle.xml");
			BeanFactory factory = new XmlBeanFactory(res);
			
			Triangle t=(Triangle) factory.getBean("trian");
			t.Draw(t.getX1(),t.getY1(),t.getX2(),t.getY2(),t.getX3(),t.getY3());
			System.out.println("Traingle Points ");
			
	}

}

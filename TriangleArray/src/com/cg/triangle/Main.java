package com.cg.triangle;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res = new ClassPathResource("triangle.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Triangle curr = (Triangle) factory.getBean("PointList");
		List curs = curr.getPointList();
		System.out.println("Points are: ");
		System.out.println(curs);
	}

}

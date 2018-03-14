package com.nishant.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
		public static void main(String[] args){
			
			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
			
			Triangle obj = (Triangle) context.getBean("triangle");
			obj.draw();
			
			TriangleWithPoints triangleWithPoints = (TriangleWithPoints) context.getBean("triangleWithPoints");
			triangleWithPoints.draw();
			
			TriangleWithAutowiring triangleWithAutowiring = (TriangleWithAutowiring) context.getBean("triangleWithAutowiring");
			triangleWithAutowiring.draw();
		}
}

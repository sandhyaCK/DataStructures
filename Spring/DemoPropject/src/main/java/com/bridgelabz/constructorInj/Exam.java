package com.bridgelabz.constructorInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.sandy.DemoPropject.Bike;

public class Exam {
	public static void main(String[] args) {
		//Student stu = new Student("Sandhya",001);
		System.out.println("@@@@");
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("@@@@");		
   Student stu = (Student) context.getBean("exam",Student.class);
		stu.display();
//		Result result = (Result) context.getBean("res") ;
//		result.show();
	}
 
}
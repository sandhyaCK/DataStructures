package com.bridgelabz.sandy.Properties;

 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
	System.out.println("kshfsj");
	ApplicationContext context =new ClassPathXmlApplicationContext("Property.xml");
	System.out.println("@@@@@@");
	Student student1 = context.getBean("student",Student.class);
	student1.display();
}
}

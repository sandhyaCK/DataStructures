package com.bridgelabz.sandy.DemoPropject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =  new ClassPathXmlApplicationContext("spring.xml");
    	System.out.println("hjghgjh");
      Bike car =(Bike) context.getBean("bike");
      car.drive();
      Bike car1 =(Bike) context.getBean("bike1");
      car1.drive();
   //  car.toString()); 
      System.out.println("Spring started");
       
      
    }
}

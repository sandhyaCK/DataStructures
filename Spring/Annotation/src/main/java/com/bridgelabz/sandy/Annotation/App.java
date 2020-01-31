package com.bridgelabz.sandy.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	try {
    	ApplicationContext context =  new AnnotationConfigApplicationContext(CollegeConfig.class);
    	System.out.println("@@@@@@@" );
    	College college = context.getBean("college",College.class);
    	System.out.println("@@@@@@@" + college);
    	college.display();
    	}
    catch(Exception e) {
    	System.out.println(e);
    }
    //	col.display();
    }
}

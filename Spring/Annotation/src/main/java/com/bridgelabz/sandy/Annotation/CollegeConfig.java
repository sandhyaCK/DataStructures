package com.bridgelabz.sandy.Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bridgelabz.sandy.Annotation")
public class CollegeConfig {
//@Bean(name= {"colBean","ColBean"})
/*@Bean
public Principal principalBean() {
	Principal pprincipal=new Principal();
	return pprincipal;
}
@Bean
public Teacher MathTeacherBean() {
	return  new MathTeacher();
	
}
	@Bean
public College collegeBean() {
	College college= new College();	
	college.setPrincipal(principalBean());
	college.setTeacher(MathTeacherBean());
	return college;
	
	 
}
	*/
}

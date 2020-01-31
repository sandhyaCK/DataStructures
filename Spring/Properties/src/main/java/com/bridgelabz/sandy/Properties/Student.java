package com.bridgelabz.sandy.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	String name;
	String interestedCourse;
	String hobby;
	public Exam exam;
//	@Autowired
//	public void setExam(Exam exam) {
//		this.exam = exam;
//	}
	
	@Value("${Student.name}")
	public void setName(String name) {
		this.name = name;
	}
	@Autowired
	public Student(Exam exam) {
	super();
	this.exam = exam;
}
	@Required
  @Value("${Student.interestedCourse}")
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}
	@Value("${Student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public void display() {
		System.out.println("Student details are displayed");
		System.out.println("StudentName:"  +name);
		System.out.println("StudentInterestedCourse:" +interestedCourse);
		System.out.println("StudentHobby:" +hobby);
		exam.results();
		}
}

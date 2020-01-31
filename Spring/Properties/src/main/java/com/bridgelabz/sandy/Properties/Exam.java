package com.bridgelabz.sandy.Properties;

import org.springframework.beans.factory.annotation.Value;

public class Exam {

  String Subjects;
  int marks;
  @Value("Java")
public void setSubjects(String subjects) {
	Subjects = subjects;
}
  @Value("89")
public void setMarks(int marks) {
	this.marks = marks;
}
  
  public void results() {
	  System.out.println("Subject:"+Subjects);
	  System.out.println("Marks:"+marks);
  }

}

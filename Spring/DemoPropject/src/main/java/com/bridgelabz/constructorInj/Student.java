package com.bridgelabz.constructorInj;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
//String Name;
//int id;
	public Result result;

	public Student() {

	}

//@Autowired
//public Student(Result result) {
//
//	this.result = result;
//}

//public Student(String name, int id, Result result) {
//	Name = name;
//this.id = id;
//	this.result = result;
//}
	@Autowired
	public void setResult(Result result) {
		this.result = result;
	}

	public void display() {
//	System.out.println( "Name:" +Name);
//System.out.println("id:" +id);
		result.show();
	}

}

package com.bridgelabz.constructorInj;

public class Result {
 String java;
 String python;
 
  public Result(String java, String python) {
	this.java = java;
	this.python = python;
}
public void show() {
	  System.out.println("Results announced");
	  System.out.println( "java:" +java);
	  System.out.println("python:" +python);
}
}
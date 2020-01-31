package com.bridgelabz.sandy.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {
	@Autowired
	public Principal principal;
	@Autowired
	public Teacher teacher;
	
/*@Autowired
public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	// public College(Principal principal) {
//		this.principal = principal;
//	}
@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}*/

	void display() {
		principal.PrincipalInfo();
		teacher.teach();
		System.out.println("College class created");

	}

}
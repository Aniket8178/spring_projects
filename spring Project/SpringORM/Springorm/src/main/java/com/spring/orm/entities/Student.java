package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")

public class Student {
	 
	 @Id
	 @Column(name = "studentid")
     private int StudentId;
	 @Column(name = "student_name")
     private String studentName;
	 @Column(name = "student_city")
     private String studentcity;
	 
	public Student(int studentId, String studentName, String studentcity) {
		super();
		StudentId = studentId;
		this.studentName = studentName;
		this.studentcity = studentcity;
	}

	public Student() {
		
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentcity() {
		return studentcity;
	}

	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}
	
	 
	
	 
     
}

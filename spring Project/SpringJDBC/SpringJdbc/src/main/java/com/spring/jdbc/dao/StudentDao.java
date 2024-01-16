package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.student;

public interface StudentDao {
     
	public int insert(student student);
	
	public int change(student student);
	
	public int Delete(student student);
	
	public student getstudent(int studentid);
	
	public List<student> getAllStudents();
}

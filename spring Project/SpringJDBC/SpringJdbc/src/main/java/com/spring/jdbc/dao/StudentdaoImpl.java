package com.spring.jdbc.dao;

import com.spring.jdbc.entities.student;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentdaoImpl implements StudentDao {

	private JdbcTemplate JdbcTemplate;
	
	public int insert(student student) {
        String query = "insert into student(id , name , city) values(? , ? , ?)";
        int update = this.JdbcTemplate.update(query , student.getId() , student.getName() , student.getCity());
		return update;
	}
	
	
	public int change(student student) {
		//updating data
		String query = "update student set name = ? where id = ?";
		int r = this.JdbcTemplate.update(query , student.getName() , student.getId());
		
		return r;
	}
	

	
	public int Delete(student student) {
		String query = "delete from student where id = ?";
		int r = this.JdbcTemplate.update(query , student.getId());
		return r;
	}
	
	
	public student getstudent(int studentid) {
		String Query = "select * from student where id = ?";
		RowMapper<student> rowmapper = new RowMapperImpl();
		student st = this.JdbcTemplate.queryForObject(Query, rowmapper, studentid);
		return st;
	}
	
	
	public List<student> getAllStudents() {
		// selecting Multiple student data
		String query = "select * from student";
		List<student> query2 = this.JdbcTemplate.query(query, new RowMapperImpl());
		return query2;
	}
	public JdbcTemplate getJdbcTemplate() {
		return JdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		JdbcTemplate = jdbcTemplate;
	}



	

	
}

package com.sample.dao.impl;

import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sample.dao.StudentDao;
import com.sample.demo.model.Student;


public class StudentDaoImpl implements StudentDao{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	
		this.jdbcTemplate =new JdbcTemplate(dataSource);
	
	
}

	@Override
	public void insertStudent(Student student) {
		// TODO Auto-generated method stub
		String s="insert into studen (sname,course,fee)values(?,?,?)";
		int insert=jdbcTemplate.update(s,new Object[] {student.getSname(),student.getCourse(),student.getFee()});
		if(insert>0)
			System.out.println("data inserted");
	}

	@Override
	public Student getStudentById(int studentId) {
		String s= "select * from studen where id=?";
		Student student= jdbcTemplate.queryForObject(s, new StudentRowMapper(),studentId);
		return student;
		
	}
	public void deleteStudentById(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudentCourseById(String newCourse, int studentId) {
		// TODO Auto-generated method stub
		
	}
	public List<Student> getAllStudents() {
		String s="select * from studen";
        List<Student>st=jdbcTemplate.query(s, new StudentRowMapper());
		return st;
	}
}
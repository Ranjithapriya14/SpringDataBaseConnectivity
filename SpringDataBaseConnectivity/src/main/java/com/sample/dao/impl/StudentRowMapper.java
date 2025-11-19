package com.sample.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.jdbc.core.RowMapper;

import com.sample.demo.model.Student;

public class StudentRowMapper implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s=new Student();
		s.setId(rs.getInt("Id"));
		s.setSname(rs.getString("sname"));
		s.setCourse(rs.getString("course"));
		s.setFee(rs.getString("fee"));
		return s;
	}
	

}

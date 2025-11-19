package com.sample.dao;

import java.util.List;

import com.sample.demo.model.Student;

public interface StudentDao{
	void insertStudent(Student student);
	Student getStudentById(int studentId);
	void deleteStudentById(Student student);
	void updateStudentCourseById(String newCourse,int studentId);
	List<Student> getAllStudents();
}
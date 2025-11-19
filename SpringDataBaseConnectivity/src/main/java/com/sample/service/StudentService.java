package com.sample.service;

import com.sample.demo.model.Student;

public interface StudentService{
	void addStudent(Student student);
	Student fetchStudentById(int studentId);
	void delStudentById(Student studentId);
	void updateCourseById(String newCourse,int studentId);
}
package com.sample.service.impl;

import java.util.List;

import com.sample.dao.StudentDao;
import com.sample.demo.model.Student;
import com.sample.service.StudentService;

public class StudentServiceImpl implements StudentService{
	private StudentDao studentDao;
	
	
	public StudentDao getStudentDao() {
		return studentDao;
	}


	public void setStudentDao(StudentDao studentDao) {
		this.studentDao=studentDao;
	}

	public void addStudent(Student student) {
		
		studentDao.insertStudent(student);
		
	}

	public Student fetchStudentById(int studentId) {
		
		return studentDao.getStudentById(studentId);
	}
	
	public List<Student> fetchAllStudents(){
		return studentDao.getAllStudents();
	}

	public void delStudentById(Student studentId) {
		
		studentDao.deleteStudentById(studentId);
		
	}

	public void updateCourseById(String newCourse, int studentId) {
		
		studentDao.updateStudentCourseById(newCourse, studentId);
	}
	
}
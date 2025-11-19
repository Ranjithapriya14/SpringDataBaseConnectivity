package com.sample.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.demo.model.Student;
import com.sample.service.impl.StudentServiceImpl;

public class Access{
	public static void main(String[]args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		StudentServiceImpl s=context.getBean(StudentServiceImpl.class);
	    Student student=new Student();	
	    
	    student.setSname("Ranjithapriya");
	    student.setCourse("javaspring");
	    student.setFee("1408");
	    //s.addStudent(student);
	    //System.out.println(s.fetchStudentById(2));
	    List<Student> st=s.fetchAllStudents();
	    for(Student ss:st)
		System.out.println(ss.getId()+" "+ss.getSname()+" "+ss.getCourse()+" "+ss.getFee());
     }
}
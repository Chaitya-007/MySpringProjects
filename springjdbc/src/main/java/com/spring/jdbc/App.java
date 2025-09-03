package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao studentDao = (StudentDao) context.getBean("studentDao");
		Student student = new Student();
//		
		student.setId(459);
		student.setCity("Pune;");
		student.setName("Pittu");
		
		int r = studentDao.insert(student);
		System.out.println("Student added : " + r);
		
//		Student student = new Student();
//		
//		student.setId(222);
//		student.setCity("Pune");
//		student.setName("Paitya");
//		 
//		int r = studentDao.change(student);
//		System.out.println("Rows updated : " + r);
		
//		int r = studentDao.delete(222);
//		System.out.println("Rows updated : " + r);
		
//		Student student = studentDao.getStudent(45);
//		System.out.println(student);
		
//		List<Student> students = studentDao.getAllStudents();
//		System.out.println(students);
		
		
	}
}

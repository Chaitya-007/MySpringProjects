package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
		StudentDao studentDao = (StudentDao) context.getBean("studentDao");

//        Student student = new Student(154,"raju","goa");
//        
//        int r = studentDao.insert(student);
//        System.out.println("done " + r);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while (go) {

			System.out.println("1 Add");
			System.out.println("2 Display All");
			System.out.println("3 Detail of Single Student");
			System.out.println("4 Delete Student");
			System.out.println("5 Update Student");
			System.out.println("6 Exit");
			System.out.println("Enter choice");
			try {

				int input = Integer.parseInt(br.readLine());
				switch (input) {
				case 1:
					System.out.println("Enter user id : ");
					int uid = Integer.parseInt(br.readLine());
					System.out.println("Enter user name : ");
					String uName = br.readLine();
					System.out.println("Enter user city : ");
					String uCity = br.readLine();

					Student student = new Student();
					student.setStudentId(uid);
					student.setStudentCity(uCity);
					student.setStudentName(uName);

					studentDao.insert(student);
					System.out.println("User Added successfully");
					break;
				case 2:

					List<Student> students = studentDao.getAllStudents();
					for (Student s : students) {
						System.out.println("Id : " + s.getStudentId());
						System.out.println("Name : " + s.getStudentName());
						System.out.println("City : " + s.getStudentCity());
						System.out.println("_____________________________________");
					}
					System.out.println("*******************************88");
					break;
				case 3:
					System.out.println("Enter id for which you want details: ");
					uid = Integer.parseInt(br.readLine());

					Student student2 = studentDao.getStudent(uid);
					System.out.println("Details of Student as follows:");
					System.out.println("Id : " + student2.getStudentId());
					System.out.println("Name : " + student2.getStudentName());
					System.out.println("City : " + student2.getStudentCity());

					break;
				case 4:
					System.out.println("Enter id for which you want Delete: ");
					uid = Integer.parseInt(br.readLine());
					studentDao.deleteStudent(uid);
					System.out.println("User Deleted Successfully");

					break;
				case 5:
					System.out.println("Enter new user id : ");
					 uid = Integer.parseInt(br.readLine());
					System.out.println("Enter new user name : ");
					 uName = br.readLine();
					System.out.println("Enter new user city : ");
					 uCity = br.readLine();
					
					Student student3 = new Student();
					student3.setStudentId(uid);
					student3.setStudentCity(uCity);
					student3.setStudentName(uName);
					
					
					studentDao.updateStudent(student3);
					System.out.println("User Update Successfully");
						
					break;
				case 6:
					go = false;
					break;

				}

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid input : " + e.getMessage());
			}
		}

		System.out.println("Thank you for using application");
	}
}

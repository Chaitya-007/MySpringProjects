package com.springcore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddreess;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("Setting Student Id :");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Setting Student Name :");
		this.studentName = studentName;
	}
	public String getStudentAddreess() {
		return studentAddreess;
	}
	public void setStudentAddreess(String studentAddreess) {
		System.out.println("Setting Student Address :");
		this.studentAddreess = studentAddreess;
	}
	
	
	public Student(int studentId, String studentName, String studentAddreess) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddreess = studentAddreess;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddreess="
				+ studentAddreess + "]";
	}
	
	
	
	
	
}

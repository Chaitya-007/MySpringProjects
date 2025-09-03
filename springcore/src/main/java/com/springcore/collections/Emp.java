package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String employeeName;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String, String> courses;
	private Properties properties;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Emp [employeeName=" + employeeName + ", phones=" + phones + ", addresses=" + addresses + ", courses="
				+ courses + ", properties=" + properties + "]";
	}

//	public Emp(String employeeName, List<String> phones, Set<String> addresses, Map<String, String> courses,
//			Properties properties) {
//		super();
//		this.employeeName = employeeName;
//		this.phones = phones;
//		this.addresses = addresses;
//		this.courses = courses;
//		this.properties = properties;
//	}

//	public Emp() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

}

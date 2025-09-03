package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certi cert;
	private List<String> list;

	public Person(String name, int personId, Certi cert, List<String> list) {
		super();
		this.name = name;
		this.personId = personId;
		this.cert = cert;
		this.list = list;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", cert=" + cert + ", list=" + list + "]";
	}

}

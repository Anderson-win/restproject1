package com.rest.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	private int id;
	private String name;
	private boolean good;
	
	public Student() {
		super();
	}

	public Student(int id, String name, boolean good) {
		super();
		this.id = id;
		this.name = name;
		this.good = good;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGood() {
		return good;
	}

	public void setGood(boolean good) {
		this.good = good;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", good=" + good + "]";
	}
	
}

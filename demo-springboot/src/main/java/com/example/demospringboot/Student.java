package com.example.demospringboot;

public class Student {

	private String id;
	private String name;
	private College college;
	
	public Student(String id, String name, College college) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public College getCollage() {
		return college;
	}
	public void setCollage(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", collage=" + college + "]";
	}
	
}

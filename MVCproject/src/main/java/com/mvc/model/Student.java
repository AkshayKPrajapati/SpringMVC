package com.mvc.model;

public class Student {
	private int id;
	private String name;
	private String registerId;
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
	public String getRegisterId() {
		return registerId;
	}
	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", registerId=" + registerId + "]";
	}
	public Student(int id, String name, String registerId) {
		super();
		this.id = id;
		this.name = name;
		this.registerId = registerId;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}

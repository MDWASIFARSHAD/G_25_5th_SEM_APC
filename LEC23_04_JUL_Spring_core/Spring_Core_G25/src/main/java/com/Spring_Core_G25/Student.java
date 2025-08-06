package com.Spring_Core_G25;

import java.util.List;
import java.util.Map;

public class Student {
	
	private int id;
	private String name;
	private List<String> course;
	private Map<String, String> courseAndTrainer;
	private Address add;
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
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
	public List<String> getCourse() {
		return course;
	}
	public void setCourse(List<String> course) {
		this.course = course;
	}
	public Map<String, String> getCourseAndTrainer() {
		return courseAndTrainer;
	}
	public void setCourseAndTrainer(Map<String, String> courseAndTrainer) {
		this.courseAndTrainer = courseAndTrainer;
	}

}

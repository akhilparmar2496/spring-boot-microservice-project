package com.microservice.coursecatalogueservice.model;

public class Course {
	private String name;
	private String author;
	private CourseLevel courseLevel;
	
	public Course(){
		
	}
	
	public Course(String name, String author, CourseLevel courseLevel) {
		super();
		this.name = name;
		this.author = author;
		this.courseLevel = courseLevel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public CourseLevel getCourseLevel() {
		return courseLevel;
	}
	public void setCourseLevel(CourseLevel courseLevel) {
		this.courseLevel = courseLevel;
	}
	

}

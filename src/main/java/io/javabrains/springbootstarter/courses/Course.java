package io.javabrains.springbootstarter.courses;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.RestController;

@Entity
public class Course {
	
	@Id
	private String courseId;
	private String courseDescription;
	

	public Course() {
	}
	
	
	public Course(String courseId, String courseDescription) {
		super();
		this.courseId = courseId;
		this.courseDescription = courseDescription;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	

}

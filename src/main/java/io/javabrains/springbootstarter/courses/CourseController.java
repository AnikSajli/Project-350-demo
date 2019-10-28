package io.javabrains.springbootstarter.courses;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/course")
	public List<Course> getAllCourses(){
		return courseService.getAllCourses();
				
	}
	
	@RequestMapping("/course/{courseId}")
	public Course getCourse(@PathVariable String courseId)
	{
		return courseService.getCourse(courseId);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/course")
	public void addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/course/{courseId}")
	public void updateCourse(@RequestBody Course course, @PathVariable String courseId) {
		courseService.updateCourse(courseId, course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/course/{courseId}")
	public void deleteCourse(@PathVariable String courseId)
	{
		courseService.deleteCourse(courseId);
	}

}

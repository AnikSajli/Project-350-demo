package io.javabrains.springbootstarter.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	 List<Course> courses = new ArrayList<>(Arrays.asList(
			new Course("SWE 350","Project"),
			new Course("SWE 331", "Software metrics"),
			new Course("SWE 333", "V&V")		
			));
	
	public List<Course>getAllCourses()
	{
		return courses;
	}
	
	public Course getCourse(String id)
	{
		return courses.stream().filter(c -> c.getCourseId().equals(id)).findFirst().get();
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	public void updateCourse(String courseId, Course course )
	{
		for(int i = 0; i < courses.size(); i++) {
				Course c = courses.get(i);
				if (c.getCourseId().equals(courseId)) {
					courses.set(i, course);
					return;
			}
		}
	}

	public void deleteCourse(String courseId) {
		courses.removeIf(c -> c.getCourseId().equals(courseId));
	}
}
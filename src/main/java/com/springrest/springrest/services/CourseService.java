package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.course;

public interface CourseService {
	

	public List<course> getCourses();
	public course getCourse(long courseId);
	public course addCourse(course c1);
	public course updateCourse(course c1);
	public void deleteCourse(long courseId);
	
		
	
	

}

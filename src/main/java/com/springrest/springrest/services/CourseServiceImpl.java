package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.course;
@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	public CourseDao courseDao;
	

	@Override
	public List<course> getCourses() {
		return courseDao.findAll();
			
	}
	

	@Override
	public course getCourse(long courseId) {
		
		
		return courseDao.getOne(courseId);
	}

	@Override
	public course addCourse(course c1) {
		 courseDao.save(c1);
		return c1;
	}

	@Override
	public course updateCourse(course c1) {
		 courseDao.save(c1);
		 return c1;
	}

	@Override
	public void deleteCourse(long courseId) {
		course entity=courseDao.getOne(courseId);
		courseDao.delete(entity);
		
		
	}
	
	
	



}

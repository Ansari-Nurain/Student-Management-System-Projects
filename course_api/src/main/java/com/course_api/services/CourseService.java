package com.course_api.services;

import java.util.List;

import com.course_api.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();

	public Course getCourse(long courseId);

	public Course addCourse(Course course);

	public Course update(long coursId, Course course);
	
	
//	void updateById(long coursId, Course course);

	public void deleteCourse(long id);
	
//	public Course deleteCourse(long id);



}

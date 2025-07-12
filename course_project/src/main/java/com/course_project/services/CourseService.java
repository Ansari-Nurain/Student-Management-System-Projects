package com.course_project.services;

import java.util.List;

import com.course_project.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();

	public Course getCourse(long id);

	public Course addCourse(Course course);

	public Course updateCourse(long id, Course course);

	public Course deleteCourse(long id);

}

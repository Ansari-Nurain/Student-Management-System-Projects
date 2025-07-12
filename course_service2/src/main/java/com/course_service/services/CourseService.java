package com.course_service.services;

import java.util.List;

import com.course_service.entities.Course;

public interface CourseService {
	
	public Course addCourse(Course course);
	
	public List<Course> getAllCourse();
	
	public Course getCourseById(long courseId);
	
	public Course updateCourse(long courseId, Course course);
	
	public String deleteCourse(long courseId);
	
	public List<Course> findCourseByStudentId(long studentId);
	
	public List<Course> findCourseByTeacherId(long teacherId);


}

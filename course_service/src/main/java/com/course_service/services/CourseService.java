package com.course_service.services;

import java.util.List;

import com.course_service.entities.Course;

public interface CourseService {
	
	public Course addCourse(Course course);
	
	public List<Course> getAllCourse();
	
	public Course getCourseById(String courseId);
	
	public Course updateCourse(String courseId, Course course);
	
	public String deleteCourse(String courseId);
	
	public List<Course> findCourseByStudentId(String studentId);
	
	public List<Course> findCourseByTeacherId(String teacherId);


}

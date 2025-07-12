package com.course_service.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course_service.entities.Course;

public interface CourseRepository extends JpaRepository<Course, String> {
	
	public List<Course> findByStudentId(String studentId);
	
	public List<Course> findByTeacherId(String teacherId);


}

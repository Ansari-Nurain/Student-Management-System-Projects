package com.course_service.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course_service.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
	
	public List<Course> findByStudentId(long studentId);
	
	public List<Course> findByTeacherId(long teacherId);


}

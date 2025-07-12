package com.course_service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course_service.entities.Course;
import com.course_service.services.CourseService;

@RestController
@RequestMapping("/courses2")
public class CourseControllers {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping
	public Course addCourse(@RequestBody Course course) {
		
		return this.courseService.addCourse(course);
	}
	
	@GetMapping
	public List<Course> getAllCourses(){
		
		return this.courseService.getAllCourse();
	}
	
	@GetMapping("/{courseId}")
	public Course getCourseById(@PathVariable long courseId) {
		
		return courseService.getCourseById(courseId);
	}
	
	@PutMapping("/{courseId}")
	public Course updateCourse(@PathVariable long courseId, @RequestBody Course course) {
		
		return this.courseService.updateCourse(courseId, course);
	}
	
	@DeleteMapping("/{courseId}")
	public String deleteCourse(@PathVariable long courseId) {
		
		return this.courseService.deleteCourse(courseId);
	}
	
	@GetMapping("/students/{studentId}")
	public List<Course> getCourseByStudentId(@PathVariable long studentId){
		
		return courseService.findCourseByStudentId(studentId);
	}
	

	@GetMapping("/teachers/{teacherId}")
	public List<Course> getCourseByTeacherId(@PathVariable long teacherId){
		
		return courseService.findCourseByTeacherId(teacherId);
	}

}

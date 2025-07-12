package com.course_project.controllers;

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

import com.course_project.entities.Course;
import com.course_project.services.CourseService;

@RestController
@RequestMapping("/api")
public class CourseController {
	
	@Autowired
	private CourseService courseService;

	@GetMapping("/courses")
	public List<Course> getCourses(){
		
		
		return this.courseService.getCourses();
	}
	
	@GetMapping("/courses/{id}")
	public Course getCourse(@PathVariable long id) {
		
		return this.courseService.getCourse(id);
	}
	
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course){
		
		return this.courseService.addCourse(course);
	}
	
	@PutMapping("/courses/{id}")
	public Course updateCourse(@PathVariable long id, @RequestBody Course course) {
		
		Course updateCourse = courseService.updateCourse(id,course);
		
		return updateCourse;
	}
	
	@DeleteMapping("/courses/{id}")
	public Course deleteCourse(@PathVariable long id) {
		
		return courseService.deleteCourse(id);
	}
}

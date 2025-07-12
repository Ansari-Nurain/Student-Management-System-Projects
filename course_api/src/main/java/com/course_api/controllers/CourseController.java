package com.course_api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.course_api.entities.Course;
import com.course_api.services.CourseService;

@RestController
@RequestMapping("/api")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		
		return this.courseService.getCourses();
	}
	
	@GetMapping("courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		
		return this.courseService.addCourse(course);
	}
	
	
	@PutMapping("/courses/{coursId}")
	public Course updateCourse(@PathVariable long coursId,@RequestBody Course course) {
		Course update = courseService.update(coursId, course);
		return update;
	}
	
	
//	@PutMapping("/courses/{coursId}")
//	public Course updateCourse(@PathVariable long coursId,@RequestBody Course course) {
//		courseService.updateById(coursId, course);
//		return course;
//	}
	
//	@DeleteMapping("courses/{id}")
//	public Course deleteCourse(@PathVariable long id) {
//		
//		
//		return courseService.deleteCourse(id);
//		
//	}
	
	
	@DeleteMapping("courses/{id}")
	public void deleteCourse(@PathVariable long id) {
		
		courseService.deleteCourse(id);
	}
	
	

}

package com.course_project.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.course_project.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
	private List<Course> list;
	
	public CourseServiceImpl() {
		
		list = new ArrayList<>();
		list.add(new Course(1, "java", "java is a programming language"));
		list.add(new Course(2, "javaScript", "javaScript is a programming language"));
		list.add(new Course(3, "Python", "python is a programming language"));
	}

	@Override
	public List<Course> getCourses() {
		
		return list;
	}

	@Override
	public Course getCourse(long id) {

//		Course c = null;
//		for(Course course : list) {
//			if(course.getId()==id) {
//				c = course;
//				break;
//			}
//		}		
//		return c;
		
		
	Course	course = list.stream().filter(c->c.getId()==id).findFirst().orElse(null);
		
	return course;

	}

	@Override
	public Course addCourse(Course course) {

		list.add(course);
		
		return course;
	}

	@Override
	public Course updateCourse(long id, Course course) {
		
		for(Course c : list) {
			
			if(c.getId()==id) {
				c.setId(course.getId());
				c.setTitle(course.getTitle());
				c.setDescription(course.getDescription());
			}
		}
		
		return course;
	}

	@Override
	public Course deleteCourse(long id) {

//		for(Course course : list) {
//			if(course.getId()==id) {
//				list.remove(course);
//				break;
//			}
//		}
//		
//		return null;
		
		list = list.stream().filter(c->c.getId()!=id).collect(Collectors.toList());
		
		return null;
	}

}

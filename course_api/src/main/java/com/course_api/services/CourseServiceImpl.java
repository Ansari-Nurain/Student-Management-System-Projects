package com.course_api.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.course_api.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	private List<Course> list;
	
	public CourseServiceImpl() {
		
		list = new ArrayList<>();
		
		list.add(new Course(1, "Java", "Java is a programming language"));
		list.add(new Course(2, "JavaScript", "JavaScript is a programming language"));
		list.add(new Course(3, "Python", "Python is a programming language"));

	}
	
	

	@Override
	public List<Course> getCourses() {

		return list;
	}



	@Override
	public Course getCourse(long courseId) {

		 Course c = null;
		 
		 for(Course course : list) {
			 if(course.getId()==courseId) {
				 c=course;
				 break;
			 }
		 }
		
		return c;
	}



	@Override
	public Course addCourse(Course course) {

		list.add(course);
		
		return course;
	}



	@Override
	public Course update(long coursId, Course course) {
//
//		list.forEach(c->{
//			if(c.getId()==coursId) {
//				c.setId(course.getId());
//				c.setTitle(course.getTitle());
//				c.setDescription(course.getDescription());
//				
//			}
//		});
//		
//		return course;
//		}
	
		
		for(Course c : list) {
			
			if(c.getId()==coursId) {
				c.setId(course.getId());
				c.setTitle(course.getTitle());;
				c.setDescription(course.getDescription());
			}
		}
		
		return course;
		}
		
		
		
//		list.stream().filter(c->c.getId()==coursId).findFirst().ifPresent(c->{
//			c.setId(course.getId());
//			c.setTitle(course.getTitle());
//			c.setDescription(course.getDescription());
//		});
//		
//		return course;
//		}
	
	
//}
		


	
//	@Override
//	public void updateById(long coursId, Course course) {
//
//		list = list.stream()
//	    .map(c -> {
//	        if (c.getId() == coursId) {
//	        	c.setId(course.getId());
//	            c.setTitle(course.getTitle());
//	            c.setDescription(course.getDescription());
//	        }
//	        return c; 
//	    })
//	    .collect(Collectors.toList()); 
//		
//		
//		}




//	@Override
//	public Course deleteCourse(long id) {
//
//		for(Course c : list) {
//			
//			if(c.getId()==id) {
//				list.remove(c);
//				return c;
//			}
//		}
//		return null;
//		
//			}
	
	
	@Override
	public void deleteCourse(long id) {

//	list=list.stream().filter(c->{
//			if(c.getId()!=id) {
//				return true;
//			}else {
//				return false;
//			}
//		}).collect(Collectors.toList());
		
		
   list = list.stream().filter(c->c.getId()!=id).collect(Collectors.toList());
	
   
   
}
		
	
	}
	
	
	


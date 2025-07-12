package com.teacher_service.servies;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teacher_service.entities.Course;
import com.teacher_service.entities.Teacher;
import com.teacher_service.exception.TeacherNotFoundException;
import com.teacher_service.repositories.TeacherRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class TeacherSeviceImpl implements TeacherService {

	@Autowired
	private TeacherRepository teacherRepo;
	
	@Override
	public Teacher addTeacher(Teacher teacher) {
		
		for(Course course : teacher.getCourses()) {
			course.setTeacher(teacher);
		}
		
		return teacherRepo.save(teacher);
	}

	@Override
	public List<Teacher> getAllTeacher() {

		return teacherRepo.findAll();
	}

	@Override
	public Teacher getTeacherById(long teacherId) {

	  Teacher teacher =	teacherRepo.findById(teacherId).orElse(null);
	  if(teacher==null) {
		  throw new EntityNotFoundException("Teacher not found with "+teacherId);
	  }
		
		return teacher;
	}

	@Override
	public Teacher updateTeacher(long teacherId,Teacher teacher) {

		Teacher orElse = teacherRepo.findById(teacherId).orElse(null);
		
		if(orElse.getTeacherId()==teacherId) {
			orElse.setTeacherId(teacher.getTeacherId());
			orElse.setFirstName(teacher.getFirstName());
			orElse.setLastName(teacher.getLastName());
			orElse.setEmail(teacher.getEmail());
			orElse.setPhoneNumber(teacher.getPhoneNumber());
		}else {
			
			throw new TeacherNotFoundException("Teacher not found with "+teacherId);
		}
		
		return teacherRepo.save(teacher);
	}

	@Override
	public String deleteTeacher(long teacherId) {

		teacherRepo.deleteById(teacherId);
		
		return "Deleted";
	}

}

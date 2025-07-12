package com.teacher_service.servies;

import java.util.List;

import com.teacher_service.entities.Teacher;

public interface TeacherService {

	public Teacher addTeacher(Teacher teacher);
	
	public List<Teacher> getAllTeacher();
	
	public Teacher getTeacherById(long teacherId);
	
	public Teacher updateTeacher(long teacherId,Teacher teacher);
	
	public String deleteTeacher(long teacherId);
	
}

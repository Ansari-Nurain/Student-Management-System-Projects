package com.student_service.service;

import java.util.List;

import com.student_service.entity.Student;

public interface StudentService {
	
	public Student addStudent(Student student);

	public List<Student> getAllStudent();
	
	public Student getStudentById(long studentId);
	
	public Student updateStudent(long studentId, Student student);
	
	public String deleteStudent(long studentId);

}

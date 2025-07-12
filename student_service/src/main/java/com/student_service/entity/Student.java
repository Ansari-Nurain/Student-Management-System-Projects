package com.student_service.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity 
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@Id
	private String studentId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String gender;
	
	@Transient
	private List<Course> subjects = new ArrayList<>();
	

}

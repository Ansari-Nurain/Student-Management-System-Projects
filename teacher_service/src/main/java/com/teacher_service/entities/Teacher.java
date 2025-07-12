package com.teacher_service.entities;

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
public class Teacher {
	
	@Id
	private String teacherId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	
	@Transient
	private List<Course> subjects = new ArrayList<>();

}

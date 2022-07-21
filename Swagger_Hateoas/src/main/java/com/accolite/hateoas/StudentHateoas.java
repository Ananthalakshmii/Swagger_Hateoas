package com.accolite.hateoas;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentHateoas extends RepresentationModel<StudentHateoas> {
	
	private int studentId;
	private String studentName;

}

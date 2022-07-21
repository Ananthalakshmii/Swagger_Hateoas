package com.accolite.hateoas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
@RequestMapping("/example")
public class StudentControllerHateoas {

	@GetMapping("/rest/api")
	public List<StudentHateoas> getAllStudents(){
		StudentHateoas stud1=new StudentHateoas(1, "Bharathi");
		StudentHateoas stud2=new StudentHateoas(2,"Jaya");
		ArrayList<StudentHateoas> list= new ArrayList<StudentHateoas>();
		list.add(stud1);
		list.add(stud2);
		return list;
	}
	
	@GetMapping("/rest/api/hateoas")
	public List<StudentHateoas> getAllStudentsHateoas(){
		StudentHateoas stud1=new StudentHateoas(1, "Bharathi");
		StudentHateoas stud2=new StudentHateoas(2,"Jaya");
		ArrayList<StudentHateoas> list= new ArrayList<StudentHateoas>();
		
		stud1.add(linkTo(methodOn(StudentControllerHateoas.class).getAllStudents()).withRel("View all students"));
		stud2.add(linkTo(methodOn(StudentControllerHateoas.class).getAllStudents()).withSelfRel());
		list.add(stud1);
		list.add(stud2);
		return list;

	}
}

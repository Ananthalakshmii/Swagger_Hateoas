package com.accolite;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swagger")
public class StudentController{
	
	@PostMapping("/")
	public void registerStudent(@RequestBody Student student) {
		System.out.println("inside register student");
	}
	
	@GetMapping("/{id}")
	public void getStudent(@PathVariable int id) {
		System.out.println("inside get student "+id);
	}
	
	@PutMapping("/{id}")
	public void updateStudent(@PathVariable int id, @RequestBody Student student) {
		System.out.println("inside update student "+id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable int id) {
		System.out.println("inside delete student "+id);
	}

}

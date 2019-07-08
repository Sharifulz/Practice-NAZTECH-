package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.entity.Student;
import com.exam.service.StudentService;

@RestController
@RequestMapping("/get")
public class StudentRestController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/all")
	public List<Student> getAll(){
		return studentService.getAllStudents();
	}
	
	@PostMapping("/save")
	public void postStu(@RequestBody Student stu) {
		System.out.println("Save method Called");
		studentService.postStudent(stu);
	}
}

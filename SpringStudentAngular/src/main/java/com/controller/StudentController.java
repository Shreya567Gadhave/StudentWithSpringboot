package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentServiceImpl;

@RestController
@CrossOrigin("*")
public class StudentController {

	@Autowired
	StudentServiceImpl StudeService;
	
	@PostMapping("/addStud")
	public Student addStudent(@RequestBody Student student) {
		return StudeService.addStudent(student);
	}
	@GetMapping("/getStudent")
	public List<Student> getStudent() {
		return StudeService.getStudent();
	}
	
	@GetMapping("/stud/{id}")
	public Student getStudentById(@PathVariable int id) {
		return StudeService.getStudentById(id);
	}
	
	@PostMapping("/stu")
	public List<Student> addStudent(@RequestBody List<Student> student) {
		return StudeService.addStudent(student);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		return StudeService.deleteStudent(id);
	}
	
	@PutMapping("/update/{id}")
	public Student updateStudent(@RequestBody Student student,@PathVariable int id) {
		return StudeService.updateStudent(student, id);
	}
}

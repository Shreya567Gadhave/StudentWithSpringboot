package com.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.StudentRepository;
import com.model.Student;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepo;
	
	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id).orElse(null);
	}

	@Override
	public List<Student> addStudent(List<Student> student) {
		// TODO Auto-generated method stub
		return studentRepo.saveAll(student);
	}

	@Override
	public String deleteStudent(int id) {
		studentRepo.deleteById(id);
		return "Student Record Deleted " + id;
	}

	@Override
	public Student updateStudent(Student student, int id) {
		
		Student existingStudent=studentRepo.findById(id).orElse(null);
		
		if(existingStudent!=null) {
			existingStudent.setName(student.getName());
			existingStudent.setEmail(student.getEmail());
			existingStudent.setMarks(student.getMarks());
		}
		else {
			System.out.println("Student is not Existing...!");
		}
		return studentRepo.save(existingStudent);
		
	}

	

}

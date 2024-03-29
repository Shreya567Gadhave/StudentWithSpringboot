package com.service;

import java.util.List;
import com.model.Student;

public interface StudentService {

	Student addStudent (Student student);
	List<Student> getStudent();
	Student getStudentById(int id);
	List<Student> addStudent(List<Student> student);
    String deleteStudent(int id);
    Student updateStudent(Student student,int id);
}

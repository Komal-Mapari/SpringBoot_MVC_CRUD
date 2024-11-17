package com.cjc.app.service;

import java.util.List;

import com.cjc.app.model.Student;

public interface StudentService {

	void saveStudent(Student student);

	boolean loginCheck(String username, String password);

	List<Student> getAllData();

	List<Student> deleteStudent(int rollno);

	Student getStudent(int rollno);

	List<Student> updateStudent(Student student);

}

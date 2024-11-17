package com.cjc.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.model.Student;
import com.cjc.app.repository.StudentRepository;

@Service
public class StudentServiceIMPL implements StudentService
{
	private StudentRepository repository;

	@Autowired
	public StudentServiceIMPL(StudentRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Override
	public void saveStudent(Student student) {
		System.out.println("Student data inside service layer : "+student);
		repository.save(student);
	}
	
	    @Override
	    public boolean loginCheck(String username, String password) {
	         if(username.equalsIgnoreCase("Admin")&&password.equals("Admin@123")) {
	        	 return true;
	         }
	    	return false;
	    }
	    
	    @Override
	    public List<Student> getAllData() {
	    	Iterable<Student> list = repository.findAll();
	    	List<Student> stuList=(List<Student>)list;
	    	return stuList;
	    }
	    
	    @Override
	    public List<Student> deleteStudent(int rollno) {
	    	repository.deleteById(rollno);
	    	return getAllData();
	    }
	    
	    @Override
	    public Student getStudent(int rollno) {
	    	return repository.findById(rollno).get();
	    	
	    }
	    
	    @Override
	    public List<Student> updateStudent(Student student) {
	    	repository.save(student);
	    	return getAllData();
	    }

}

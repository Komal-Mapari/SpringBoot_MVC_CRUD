package com.cjc.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cjc.app.model.Student;
import com.cjc.app.service.StudentService;

@Controller
public class StudentController {

	private StudentService service;
	
	@Autowired
	public void setService(StudentService service) {
		this.service = service;
	}


	@RequestMapping(value = "/")
	public String landingPage() {
		System.out.println("In Landing Page");
		
		return "index";
	}
	
	
	@RequestMapping(value = "/log")
	public String loginPage() {
		System.out.println("inside login method");
		
		return "login";
	}
	
	@RequestMapping(value = "/reg")
	public String registerPage() {
		System.out.println("Inside Register Page");
		
		return "register";
	}
	
	@RequestMapping(value = "/register" , method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute Student student) {
		System.out.println("Student Data In Controller Layer : "+student);
		service.saveStudent(student);
		return"index";
	}
	
	@RequestMapping(value = "/login")
	public String logincheck(@RequestParam String username, @RequestParam String password ,Model model) {
		System.out.println("Username :"+username+"\nPassword : "+password);
		boolean flag=service.loginCheck(username,password);
		if(flag) {
			List<Student> stuList = service.getAllData();
			model.addAttribute("list", stuList);
			return "display";
		}
		return "index";
	}
	
	@RequestMapping(value = "/delete")
	public String deleteStudent(@RequestParam int rollno, ModelMap map) {
		System.out.println("Student Rollno : "+rollno);
	List<Student> stuList = service.deleteStudent(rollno);
	    map.addAttribute("list", stuList);
	
		return "display";
	}
	
	@RequestMapping(value = "/edit")
	public ModelAndView editData(@RequestParam int rollno) {
		System.out.println("In Controller Layer : "+rollno);
	Student stu = service.getStudent(rollno);
	   ModelAndView mv=new ModelAndView();
	    mv.addObject("student", stu);
	    mv.setViewName("edit");
		return mv;
	}
	
	@RequestMapping(value = "/update")
	public ModelAndView updateStudent(@ModelAttribute Student student) {
		System.out.println("Student data : "+student);
	  List<Student> stuList = service.updateStudent(student);
	 ModelAndView mv=new ModelAndView();
	 mv.addObject("list", stuList);
	 mv.setViewName("display");
	 return mv;
	}
	
	
	
	
	
}
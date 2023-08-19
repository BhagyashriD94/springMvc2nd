package com.BikkadIT.SpringMvcFirstApp.Controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIT.SpringMvcFirstApp.model.Student;

@Controller
public class StudentController {
	@GetMapping("/getstu")
	public ModelAndView getStudent() {
		Student stu=new Student();
		stu.setSid(111);
		stu.setSname("Shree");
		stu.setSaddress("pune");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("STU",stu);
		mav.setViewName("student");
		return mav;
		
	}
	
	@GetMapping("/getstus")
	public ModelAndView getStudents() {
		Student stu=new Student();
		stu.setSid(111);
		stu.setSname("Shree");
		stu.setSaddress("pune");
	
		Student stu1=new Student();
		stu1.setSid(222);
		stu1.setSname("Rani");
		stu1.setSaddress("Nashik");
		
		Student stu2=new Student();
		stu2.setSid(333);
		stu2.setSname("Prachi");
		stu2.setSaddress("Aurangabad");
		
		ArrayList<Student> al=new ArrayList<>();
		al.add(stu);
		al.add(stu1);
		al.add(stu2);
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("STUDENTS",al);
		mav.setViewName("students");
		
		return mav;
		
	}

}

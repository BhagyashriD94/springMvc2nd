package com.BikkadIT.SpringMvcFirstApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	@GetMapping("/welcomeEmployee")
	public String welcomeEmp(Model model) {
		String msg="Hii shree welcome to BikkadIt";
		model.addAttribute("MESSAGE",msg);
		
		return "welEmp";
		
	}

}

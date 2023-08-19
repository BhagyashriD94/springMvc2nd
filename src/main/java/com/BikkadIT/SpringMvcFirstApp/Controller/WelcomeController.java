package com.BikkadIT.SpringMvcFirstApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/message")
	public ModelAndView Welcomemsg() {
		String msg="Welcome to BikkadIT";
		ModelAndView mav=new ModelAndView();
		mav.addObject("MSG", msg);
		mav.setViewName("welcome");
		return mav;
		
	}

}

package com.BikkadIT.SpringMvcFirstApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class GreetController {
	
	@GetMapping("/greetMsg")
	public ModelAndView greetMsg() {
		String msg="Good Night All";
		ModelAndView mav=new ModelAndView();
		mav.addObject("GRT",msg);
		mav.setViewName("greet");
		return mav;
		
		
	}

}

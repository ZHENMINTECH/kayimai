package com.kayimai.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserLoginController {
	
	@RequestMapping("/loginhome")
	public ModelAndView loginhome(ModelAndView model){
		
		model.setViewName("user/login");
		
		return model;
		
	}
	
	

}

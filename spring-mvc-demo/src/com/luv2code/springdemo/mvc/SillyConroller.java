package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyConroller {
	
	//need a controller method to show the initial HTML
	@RequestMapping("/showForm")
	public String displayTheForm()
	{
		return "silly";
	}
	
	//need a controller method to the process the HTML form

}

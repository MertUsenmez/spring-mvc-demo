package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")  //->parent mapping
public class HelloWordController {
	
	//need a controller method to show the initial HTML
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloword-form";
	}
	
	//need a controller method to the process the HTML form
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloword";
	}
	
	//binding with Servlet
	//new controller method for read form data
	//add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model)
	{
		//read the request parameter from the HTML form 
		String theName = request.getParameter("studentName");
		
		//convert the data to all caps
		theName = theName.toUpperCase();
		
		//create new message
		String result = "Yo! " + theName;
		
		//add message to the model
		model.addAttribute("message", result);  //"message"=Name //result=Value
		
		return "helloword";
	}
	
	//binding with @RequestParam()
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName")String theName, Model model)
	{
		//convert the data to all caps
		theName = theName.toUpperCase();
		
		//create new message
		String result = "Hey my friend " + theName;
		
		//add message to the model
		model.addAttribute("message", result);  //"message"=Name //result=Value
		
		return "helloword";
	}

}

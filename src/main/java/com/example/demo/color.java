package com.example.demo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller

public class color {


	
	
		@RequestMapping("/hello")
		public String display(HttpServletRequest req)
		{
			String color=req.getParameter("color");
			HttpSession session = req.getSession();
			
	session.setAttribute("displayColor", color);
			
			return "NewFile.jsp";
		}

	

	
	

}

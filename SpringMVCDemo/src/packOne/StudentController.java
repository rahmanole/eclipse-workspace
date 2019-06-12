package packOne;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class StudentController {
	
	
	//this function for root mapping.at start up which page will be loaded thus function decide
	@RequestMapping("/")
	public String homePage() {
		
		return "index";
	}
	
	//Following two methods shows how to catch data normally through param key word
	
	
	/*
		 @RequestMapping("/showForm")
		public String studetnForm() {
			return "student-form";
		}
		
		@RequestMapping("/confirm")
		public String confirmForm() {
			
			return "confirm-student";
		}
	*/
	
	//--------------end-----------
	
	//Following two methods will show how to receive data with Httpservletrequest
	
	@RequestMapping("/showForm")
	public String showForm(HttpServletRequest request) {
		return null;				
	}
}

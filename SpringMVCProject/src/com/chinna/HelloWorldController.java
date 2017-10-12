package com.chinna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.EmployeeDao;
import com.pojo.Employee;
	
	@Controller
	public class HelloWorldController {
		
		@Autowired
		EmployeeDao dao;
		//Testting GITTTTT
		@RequestMapping(value="/hellopage", method=RequestMethod.GET)  
		    public ModelAndView insert() {  
			
		        return new ModelAndView("hellopage");  
		    }
		
		@RequestMapping(value="/update", method=RequestMethod.GET)  
	    public ModelAndView update() {  
		
	        return new ModelAndView("update");  
	    }
		
		@RequestMapping(value="/delete", method=RequestMethod.GET)  
	    public ModelAndView delete() {  
		
	        return new ModelAndView("delete");  
	    }

		 @RequestMapping(value="/hellopagesave", method=RequestMethod.POST)  
		    public ModelAndView hellopage(@ModelAttribute("Employee1") Employee e, BindingResult res) {  
			 if(res.hasErrors())
			 {
				 ModelAndView model=new ModelAndView("hellopage");
				 return model;
			 }
			    dao.saveEmployee(e); 
		        String message = "student data inserted successfully";  
		        return new ModelAndView("hellopage", "message", message);  
		    }  

		 @RequestMapping(value="/hellopageupdate", method=RequestMethod.POST)  
		    public ModelAndView hellopageupdate(@ModelAttribute("Employee1") Employee e) {  
			 
			    dao.updateEmployee(e);
		        String message = "student data updated successfully";  
		        return new ModelAndView("update", "message", message);  
		    }  
		 
		 @RequestMapping(value="/hellopagedelete", method=RequestMethod.POST)  
		    public ModelAndView hellopagedelete(@ModelAttribute("Employee1") Employee e) {  
			 
			    dao.deleteEmployee(e);		 
		        String message = "student data deleted successfully";  
		        return new ModelAndView("delete", "message", message);  
		    }  


	}

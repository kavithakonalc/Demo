package com.test.Test;


	import org.springframework.stereotype.Controller;  
	import org.springframework.web.bind.annotation.RequestMapping;  
	@Controller  
	public class HelloController {  
	@RequestMapping("/hello")  
	    public String view()  
	    {  
	        return "viewpage";  
	    }     
	@RequestMapping("/helloagain")  
	public String display()  
	{  
	    return "final";  
	}  
	@RequestMapping("/helloagain1")  
	public String display1()  
	{  
	    return "final1";  
	}  
	}  


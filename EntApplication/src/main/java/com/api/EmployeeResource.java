package com.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class EmployeeResource {
	
	@RequestMapping("/hello")
	public String getEmployeeDetailsByName(){
		return "Hello Niranjan...!!!";
	}

}

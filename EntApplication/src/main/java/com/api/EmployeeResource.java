package com.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.EmployeeDao;
import com.dto.Employee;





@RestController
public class EmployeeResource {
	@Autowired
	EmployeeDao dao;
	
	public EmployeeResource(){}
	public EmployeeResource(EmployeeDao dao){
		this.dao=dao;
	}
	@RequestMapping("/hello")
	public Employee getEmployeeDetailsByName(){
		System.out.println(dao);
		Employee e=dao.getEmployeeByName("Niranjan Sahu");
		System.out.println(e.getName());
		return e;
	}

}

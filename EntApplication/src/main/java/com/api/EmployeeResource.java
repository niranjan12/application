package com.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.EmployeeDao;
import com.dto.Employee;
import com.vo.EmployeeVO;





@RestController
public class EmployeeResource {
	@Autowired
	EmployeeDao dao;
	
	public EmployeeResource(){}
	public EmployeeResource(EmployeeDao dao){
		this.dao=dao;
	}
	@RequestMapping("/hello")
	public EmployeeVO getEmployeeDetailsByName(){
		System.out.println(dao);
		Employee e=dao.getEmployeeByName("Niranjan Sahu");
		EmployeeVO vo=new EmployeeVO();
		vo.setAddress(e.getAddress());
		vo.setDept(e.getDept());
		vo.setEmpType(e.getEmpType());
		vo.setId(e.getId());
		vo.setIsActive(e.getIsActive());
		vo.setName(e.getName());
		vo.setSal(e.getSal());
		System.out.println(e.getName());
		return vo;
	}

}

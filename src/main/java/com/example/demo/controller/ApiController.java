package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class ApiController {
	
	@Autowired
	EmployeeService eser;
	
	@PostMapping("addemp")
	public Employee add(@RequestBody Employee e)
	{
		return eser.saveinfo(e);
	}
	
	@GetMapping("showemp")
	public List<Employee> show()
	{
		return eser.showinfo();
	}
	
	

}

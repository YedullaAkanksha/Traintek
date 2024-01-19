package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController {
	
	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/getStudent")
	public List<Student> getStudent(){
		return repo.findAll();
				
				
		
	}

}

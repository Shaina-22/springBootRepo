package com.myProject;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//Controller
@RestController
public class HelloSpringController {

	// GET and URI
//	@RequestMapping(method=RequestMethod.GET, path="/getResult")
	@GetMapping("/hello")
	public String HelloSpring() {
		return "Hello Spring Boot";
	}
	
	@GetMapping("/beans")
	public helloBeanSpring fxn() {
		return new helloBeanSpring("shaina","24");
	}

}

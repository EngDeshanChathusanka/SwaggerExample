package com.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
	@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
	public String sayHelloWorld() {
		return "Swagger Hello World";
	}
}



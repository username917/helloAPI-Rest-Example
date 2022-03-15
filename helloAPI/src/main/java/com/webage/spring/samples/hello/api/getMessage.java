package com.webage.spring.samples.hello.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getMessage {
	
	@GetMapping("/hello-message")
	public HelloResponse getMessage() {
		return new HelloResponse("Hello!");
	}

}

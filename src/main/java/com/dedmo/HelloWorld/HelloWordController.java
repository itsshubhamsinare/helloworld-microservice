package com.dedmo.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
	@GetMapping("/hello/{name}")
 public GreetingBean getMessage(@PathVariable String name) {
		return new GreetingBean("Hello", name);
	 
 }
}

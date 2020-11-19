package com.in28minutes.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController //handles http request
public class HelloWorldController {
	
	//GET
	//URI - /hello-world
	//method - "Hello World"
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	
	//hello-world-bean
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		//throw new RuntimeException("Some Error has Happened! Contact Support at ***-***");
		return new HelloWorldBean("Hello World - Changed");
	}
	
	//hello-world/path-variable/in28miunutes
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s",name));
	} 
	
	/*Retrieve all todos for a user
	GET /users/{user_name}/todos
	
	Delete a todo of a user
	DELETE  /users/{user_name}/todos/{todo_id}
	
	Edit/Update a todo
	PUT /users/{user_name}/todos/{todo_id}
	
	Create a new todo
	POST /users/{user_name}/todos/
	
	*/
}

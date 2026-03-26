package com.klu.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.model.User;

@RestController
@RequestMapping("/app")
public class AppController {
	@GetMapping("/{id}")
	public User getUserDataint(@PathVariable("id")int id) {
		User user=new User(id,"sample");
		return user;
	}
	@PostMapping
	public User createUser(@RequestBody User user) {
		  return user;
	}
	@PutMapping("/{id}")
	public User updateUser(@PathVariable int id,@RequestBody User user) {
		user.setId(id);
		
		
		return user;
	}
	@DeleteMapping("/{id}")
	public String deletUser(@PathVariable("id") int id) {
		return "User got deleted";
	}
}


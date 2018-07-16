package com.qwinix.productcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qwinix.productcatalog.model.UserSignup;
import com.qwinix.productcatalog.service.UserSignupService;

@RestController
@EnableAutoConfiguration
public class UserSignupController {
	@Autowired
	UserSignupService userSignupService;
	
	@GetMapping("/users")
	public List<UserSignup> getAllUser() {
		return  userSignupService.getAllUser();
	}

	@GetMapping("/user/{email}")
	public UserSignup getUserById(@PathVariable String email) {
		return userSignupService.findByEmail(email);
	}
	
	@PostMapping("/user")
	public @ResponseBody UserSignup createUser(@RequestBody UserSignup userDetails) {
		userDetails = userSignupService.createUser(userDetails);
		return userDetails;	
	}
	@PutMapping("/user/{id}")
	public void updateUser(@RequestBody UserSignup userDetails) {
		userSignupService.updateUser(userDetails);
	}

	@DeleteMapping("/user/{id}")
	public void deleteById(@PathVariable(value = "id") int deleteUserId) {
		userSignupService.deleteById(deleteUserId);
	}
}

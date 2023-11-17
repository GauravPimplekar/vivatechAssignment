package com.user;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.User;
import com.user.service.UserService;
import com.user.serviceimpl.UserServiceImpl;


@RestController
public class UserController {

	@Autowired
	public UserService uService;
	
	
	@PostMapping("/getUser")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		User user2 = uService.saveUser(user);
		return new ResponseEntity<User>(user2,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteUser/{userId}")
	public ResponseEntity<User> deleteUser(@PathVariable Integer userId) {
		User user = uService.deleteUser(userId);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@GetMapping("/getUser/{userId}")
	public ResponseEntity<User> getUser(@PathVariable Integer userId) {
		User user = uService.getUser(userId);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
}

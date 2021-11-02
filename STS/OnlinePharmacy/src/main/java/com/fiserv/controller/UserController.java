package com.fiserv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiserv.entity.Users;
import com.fiserv.service.PharmaService;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {
	@Autowired
	PharmaService serviceobj;

//Create user
	@PostMapping("/adduser") // http://localhost:8586/employees/EmployeeCreation
	public ResponseEntity<String> AddUser(@RequestBody Users user) {
		String message = serviceobj.AddUser(user);
		return new ResponseEntity<String>(message, new HttpHeaders(), HttpStatus.OK);
	}

//Get Particular user Data
	@GetMapping("/GetUser/{username}") // http://localhost:8586/employees/GetEmployee/123
	private ResponseEntity<Users> getUser(@PathVariable("username") String username) {
		Users u = serviceobj.getUserByUserName(username);
		return new ResponseEntity<Users>(u, new HttpHeaders(), HttpStatus.OK);

	}

//Get All users Data
	@GetMapping("/GetAllUsers") // http://localhost:8586/employees/GetAllEmployees
	private ResponseEntity<List<Users>> getAllUsers() {
		List<Users> userlist = serviceobj.getAllUsers();
		return new ResponseEntity<List<Users>>(userlist, new HttpHeaders(), HttpStatus.OK);

	}

//Updating user data
	@PutMapping("/UpdateUser")

	public ResponseEntity<String> UpdateUser(@RequestBody Users user)// 123
	{
		String message = serviceobj.UpdateUser(user);
		return new ResponseEntity<String>(message, new HttpHeaders(), HttpStatus.OK);
	}

//Deleting User by username
	@DeleteMapping("/DeleteUser/{username}")
	private ResponseEntity<String> deluser(@PathVariable("username") String username) {
		String message = serviceobj.deleteByUserName(username);
		return new ResponseEntity<String>(message, new HttpHeaders(), HttpStatus.OK);
	}

}

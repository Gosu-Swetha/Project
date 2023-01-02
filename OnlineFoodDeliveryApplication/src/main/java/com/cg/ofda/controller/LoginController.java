package com.cg.ofda.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ofda.dto.LoginDto;
import com.cg.ofda.dto.RestaurantDto;
import com.cg.ofda.repository.ILoginRepository;
import com.cg.ofda.service.ILoginService;

//import jakarta.validation.Valid;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	ILoginService loginservice;;
	ILoginRepository loginrepository;
	
//	@PostMapping("/signin")
//	public boolean signIn() {
//		return loginservice.signIn()
//		
//	}

	@PostMapping("/signIn")
	public ResponseEntity<String> signIn(@RequestBody LoginDto login) {

		return new ResponseEntity<String>("Welcome  "+(loginservice.signIn(login).getUserName()), HttpStatus.ACCEPTED);
	}

	
//	//@PostMapping("/account")
//	public ResponseEntity<String> login(@RequestBody User user) {
//
//		return new ResponseEntity<String>("Welcome " + ((Admin) userService.login(user)).getName(),
//				HttpStatus.ACCEPTED);
//
//	}
	
	@GetMapping("/viewloginDetails/{id}")
	public LoginDto viewloginDetails( @PathVariable("id") String id) {
		return loginservice.viewLoginDetails(id);
	}
	@GetMapping("/signOut")
	public boolean signOut() {
		return loginservice.signOut() ;
		
	}
	
	
}

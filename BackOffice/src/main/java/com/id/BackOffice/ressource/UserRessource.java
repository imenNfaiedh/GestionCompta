package com.id.BackOffice.ressource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.id.BackOffice.Dto.UserDto;
import com.id.BackOffice.jwt.JwtUserDetails;
import com.id.BackOffice.model.User;
import com.id.BackOffice.service.UserService;

@RestController
@CrossOrigin("*")

public class UserRessource {

	@Autowired 
	private UserService userService;
	
	@PostMapping("/users")
	public ResponseEntity<JwtUserDetails> saveUser(@RequestBody JwtUserDetails user) {
		
		return ResponseEntity.ok(userService.save(user));
	}
	
	
	
	@PutMapping("/users/{id}")
	 public ResponseEntity<JwtUserDetails> updateUser(@RequestBody JwtUserDetails user , @PathVariable Long id) {
		 
		user.setId(id);
		return ResponseEntity.ok(userService.save(user));
	}
	
	
	
	@GetMapping("/users/{id}")
	public ResponseEntity<JwtUserDetails>  findUserById(@PathVariable Long  id     ) {
		
		return ResponseEntity.ok(userService.findById(id));
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<JwtUserDetails>>   findAllUser(  ) {
		
		return ResponseEntity.ok(userService.findAll());
	}
	
	
	@DeleteMapping("/users/{id}")
	public void  deleteById(@PathVariable Long  id     ) {
		
		userService.deleteById(id);
		  
	}
	
	
}

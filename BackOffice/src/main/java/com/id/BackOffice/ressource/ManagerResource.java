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

import com.id.BackOffice.Dto.ManagerDto;

import com.id.BackOffice.model.Manager;
import com.id.BackOffice.service.ManagerService;
@RestController
@CrossOrigin("*")
public class ManagerResource {

	@Autowired 
	private ManagerService managerService;
	
 
	
	@PostMapping("/managers")
	public ResponseEntity<Manager> saveManager(@RequestBody Manager manager) {
		
		return ResponseEntity.ok(managerService.save(manager));
	}
	
	
	@PutMapping("/managers/{id}")
	 public ResponseEntity<Manager> updateManager(@RequestBody Manager manager , @PathVariable Long id) {
		 
		 manager.setId(id);
		return ResponseEntity.ok(managerService.save(manager));
	}
	
	
	@GetMapping("/managers/{id}")
	public ResponseEntity<ManagerDto>  findManagerById(@PathVariable Long  id     ) {
		
		return ResponseEntity.ok(managerService.findById(id));
	}
	
	@GetMapping("/managers")
	public ResponseEntity<List<ManagerDto>>   findAllManger(  ) {
		
		return ResponseEntity.ok(managerService.findAll());
	}
	
	@DeleteMapping("/managers/{id}")
	public void  deleteById(@PathVariable Long  id     ) {
		
		
		managerService.deleteById(id);
		  
	}
	
	
	
	
	
	
}

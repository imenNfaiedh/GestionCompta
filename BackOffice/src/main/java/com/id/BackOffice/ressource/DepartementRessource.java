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

import com.id.BackOffice.Dto.DepartementDto;
import com.id.BackOffice.model.Departement;
import com.id.BackOffice.service.DepartementService;

@RestController
@CrossOrigin("*")

public class DepartementRessource {
	
	
	@Autowired
	private DepartementService departementService;
	
 
	
	@PostMapping("/departements")
	public ResponseEntity<Departement> saveDepartement(@RequestBody Departement departement) {
		
		return ResponseEntity.ok(departementService.save(departement));
	}
	

	 @PutMapping("/departements/{id}")
	 public ResponseEntity<Departement> updateDepartement(@RequestBody Departement departement , @PathVariable Long id) {
		 
		 departement.setId(id);
		return ResponseEntity.ok(departementService.save(departement));
	}
	
	
	@GetMapping("/departements/{id}")
	public ResponseEntity<DepartementDto>  findDepartementById(@PathVariable Long  id     ) {
		
		return ResponseEntity.ok(departementService.findById(id));
	}
	
	@GetMapping("/departements")
	public ResponseEntity<List<DepartementDto>>   findAllDepartement(  ) {
		
		return ResponseEntity.ok(departementService.findAll());
	}
	
	@DeleteMapping("/departements/{id}")
	public void  deleteById(@PathVariable Long  id     ) {
		
		
		departementService.deleteById(id);  
		  
	}
	
	
}








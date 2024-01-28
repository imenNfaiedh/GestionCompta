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

import com.id.BackOffice.Dto.CollaborateurDto;
import com.id.BackOffice.model.Collaborateur;
import com.id.BackOffice.service.CollaborateurService;

@RestController
@CrossOrigin("*")
public class collaborateurRessource {
	
	

	@Autowired
	private CollaborateurService collaborateurService;
	
 
	
	@PostMapping("/collaborateurs")
	public ResponseEntity<Collaborateur> saveCollaborateur(@RequestBody Collaborateur collaborateur) {
		
		return ResponseEntity.ok(collaborateurService.save(collaborateur));
	}
	
	
	
	 @PutMapping("/collaborateurs/{id}")
	 public ResponseEntity<Collaborateur> updateCollaborateur(@RequestBody Collaborateur collaborateur , @PathVariable Long id) {
		 
		 collaborateur.setId(id);
		return ResponseEntity.ok(collaborateurService.save(collaborateur));
	}
	 
	 
	
	 @GetMapping("/collaborateurs/{id}")
		public ResponseEntity<CollaborateurDto>  findCollaborateurById(@PathVariable Long  id     ) {
			
			return ResponseEntity.ok(collaborateurService.findById(id));
		}
		
		@GetMapping("/collaborateurs")
		public ResponseEntity<List<CollaborateurDto>>   findAllCollaborateur(  ) {
			
			return ResponseEntity.ok(collaborateurService.findAll());
		}
	
	
	
	@DeleteMapping("/collaborateurs/{id}")
	public void  deleteById(@PathVariable Long  id     ) {
		
		
		collaborateurService.deleteById(id);  
		  
	}

}

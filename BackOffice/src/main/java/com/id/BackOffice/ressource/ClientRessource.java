
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

import com.id.BackOffice.Dto.ClientDto;
import com.id.BackOffice.model.Client;
import com.id.BackOffice.service.ClientService;
@RestController
@CrossOrigin("*")

public class ClientRessource {
	
	
	@Autowired
	private ClientService clientService;
	
 
	
	@PostMapping("/clients")
	public ResponseEntity<Client> saveClient(@RequestBody Client client) {
		
		return ResponseEntity.ok(clientService.save(client));
	}
	

	 @PutMapping("/clients/{id}")
	 public ResponseEntity<Client> updateClient(@RequestBody Client client , @PathVariable Long id) {
		 
		 client.setId(id);
		return ResponseEntity.ok(clientService.save(client));
	}
	
	
	@GetMapping("/clients/{id}")
	public ResponseEntity<ClientDto>  findClientById(@PathVariable Long  id     ) {
		
		return ResponseEntity.ok(clientService.findById(id));
	}
	
	@GetMapping("/clients")
	public ResponseEntity<List<ClientDto>>   findAllClient(  ) {
		
		return ResponseEntity.ok(clientService.findAll());
	}
	
	@DeleteMapping("/clients/{id}")
	public void  deleteById(@PathVariable Long  id     ) {
		
		
		clientService.deleteById(id);  
		  
	}
	
	
}




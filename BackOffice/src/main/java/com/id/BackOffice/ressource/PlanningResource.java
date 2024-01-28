package com.id.BackOffice.ressource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.id.BackOffice.Dto.PlanningCollaborateurDto;
import com.id.BackOffice.Dto.PlanningDto;
import com.id.BackOffice.model.Client;
import com.id.BackOffice.service.PlanningService;

@RestController
@CrossOrigin("*")
public class PlanningResource {
	
	@Autowired private PlanningService planningService;
	
	 
	
	@PostMapping("/planings")
	public ResponseEntity< PlanningDto> savePlaning(@RequestBody     PlanningDto dto) {
		
		return ResponseEntity.ok(planningService.save(dto));
	}

	
	@GetMapping("/planings")
	public ResponseEntity< List<PlanningDto>>  getAll(){
		
		return ResponseEntity.ok(planningService.findAll());
	}
	
 
	
	@GetMapping("/list-of-collabortaeur-by/planings/{id}")
	public ResponseEntity< List< PlanningCollaborateurDto>>  getAllByPlanningId( @PathVariable Long id){
		
		
		List<PlanningCollaborateurDto> planningCollaborateurDto =  planningService.findByPlanningId(id);
		for(PlanningCollaborateurDto item   : planningCollaborateurDto) {
			 item.setPrixTotlale( item.getPrixHeure() * item.getNombreHeure());
		}
		return ResponseEntity.ok(planningCollaborateurDto);
	}

}

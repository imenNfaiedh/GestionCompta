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

import com.id.BackOffice.Dto.MissionDto;
import com.id.BackOffice.model.Mission;
import com.id.BackOffice.service.MissionService;
@RestController
@CrossOrigin("*")
public class MissionRessource {
	
	@Autowired 
	private MissionService missionService;
	
 
	
	@PostMapping("/missions")
	public ResponseEntity<Mission> saveMission( @RequestBody Mission mission) {
		
		return ResponseEntity.ok(missionService.save(mission));
	}
	
	
	@PutMapping("/missions/{id}")
	 public ResponseEntity<Mission> updateMission(@RequestBody Mission mission , @PathVariable Long id) {
		 
		 mission.setId(id);
		return ResponseEntity.ok(missionService.save(mission));
	}
	
	
	
	@GetMapping("/missions/{id}")
	public ResponseEntity<MissionDto>  findMissionById(@PathVariable Long  id     ) {
		
		return ResponseEntity.ok(missionService.findById(id));
	}
	
	@GetMapping("/missions")
	public ResponseEntity<List<MissionDto>>   findAllMission(  ) {
		
		return ResponseEntity.ok(missionService.findAll());
	}
	
	@DeleteMapping("/missions/{id}")
	public void  deleteById(@PathVariable Long  id     ) {
		
		
		missionService.deleteById(id);
		  
	}
	
	

}

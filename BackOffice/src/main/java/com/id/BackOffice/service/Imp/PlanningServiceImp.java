package com.id.BackOffice.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.id.BackOffice.Dto.PlanningCollaborateurDto;
import com.id.BackOffice.Dto.PlanningDto;
import com.id.BackOffice.mapper.PlanningCollaborateurMapper;
import com.id.BackOffice.mapper.PlanningMapper;
import com.id.BackOffice.model.CollaboratuerPlanning;
import com.id.BackOffice.model.Planinng;
import com.id.BackOffice.repository.CollaboratuerPlanningRepository;
import com.id.BackOffice.repository.PlanningRepository;
import com.id.BackOffice.service.PlanningService;


@Service
public class PlanningServiceImp implements PlanningService {
	
	
	@Autowired
	private PlanningMapper planningMapper;
	
	@Autowired
	private PlanningRepository planningRepository;
	
	@Autowired 
	private PlanningCollaborateurMapper collaborateurMapper;

	@Autowired
	private CollaboratuerPlanningRepository collaboratuerPlanningRepository;
	
	@Autowired
	private PlanningCollaborateurMapper planningCollaborateurMapper;
	
	@Override
	public PlanningDto save(PlanningDto planningDto) {
		Planinng  planinng = planningMapper.toEntity(planningDto);
		List<PlanningCollaborateurDto> collaborateurDtos  =  planningDto.getItems();
		planinng = planningRepository.save(planinng);
		List<CollaboratuerPlanning> collaboratuerPlannings =  collaborateurMapper.toEntity(collaborateurDtos);
		for (CollaboratuerPlanning item : collaboratuerPlannings) {
			item.setPlaninng(planinng);
		}
		collaboratuerPlanningRepository.saveAll(collaboratuerPlannings);
		return planningMapper.toDto(planinng)  ;
	}

	@Override
	public List<PlanningDto> findAll() {
	 List<Planinng> planinngs = (List<Planinng>) planningRepository.findAll();
		return   planningMapper.toDto(planinngs);
	}

	@Override
	public List<PlanningCollaborateurDto> findByPlanningId(Long id) {
		 
		
		List< CollaboratuerPlanning> collaboratuerPlannings = collaboratuerPlanningRepository
				.findByPlaninngId(id);
		return  planningCollaborateurMapper.toDto(collaboratuerPlannings);
	}

}

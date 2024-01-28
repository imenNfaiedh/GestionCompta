package com.id.BackOffice.service;

import java.util.List;

import com.id.BackOffice.Dto.PlanningCollaborateurDto;
import com.id.BackOffice.Dto.PlanningDto;

public interface PlanningService {
	
public PlanningDto save (PlanningDto planningDto);
public List<PlanningDto>  findAll ( );
public List<PlanningCollaborateurDto> findByPlanningId(Long id);

}

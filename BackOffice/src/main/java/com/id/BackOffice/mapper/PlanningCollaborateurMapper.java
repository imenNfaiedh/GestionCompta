package com.id.BackOffice.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.id.BackOffice.Dto.MissionDto;
import com.id.BackOffice.Dto.PlanningCollaborateurDto;
import com.id.BackOffice.model.CollaboratuerPlanning;
import com.id.BackOffice.model.Mission;

@Mapper(componentModel = "spring" , uses = {})
public interface PlanningCollaborateurMapper {
	
	  PlanningCollaborateurDto toDto ( CollaboratuerPlanning   collaboratuerPlanning) ;
		List<PlanningCollaborateurDto> toDto (List<CollaboratuerPlanning>  collaboratuerPlannings) ;
		CollaboratuerPlanning toEntity (PlanningCollaborateurDto missionDto);
		List<CollaboratuerPlanning> toEntity (List<PlanningCollaborateurDto> missionDto);

}

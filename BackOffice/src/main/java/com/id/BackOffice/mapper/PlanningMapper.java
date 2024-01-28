package com.id.BackOffice.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.id.BackOffice.Dto.PlanningDto;
import com.id.BackOffice.model.Planinng;

@Mapper(componentModel = "spring" , uses = {})
public interface PlanningMapper {
	
	
     PlanningDto toDto ( Planinng planinng) ;
	List<PlanningDto> toDto (List<Planinng>  planinngs) ;
	Planinng toEntity (PlanningDto  planningDto);
	List<Planinng> toEntity (List<PlanningDto>  planningDtos);

}

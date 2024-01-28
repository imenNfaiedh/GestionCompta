package com.id.BackOffice.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.id.BackOffice.Dto.CollaborateurDto;
import com.id.BackOffice.model.Collaborateur;

@Mapper(componentModel = "spring" , uses = {})
public interface CollaborateurMapper {
	
	
	CollaborateurDto toDto (Collaborateur collaborateur);
	List<CollaborateurDto> toDto (List<Collaborateur> collaborateur);

}






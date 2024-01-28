package com.id.BackOffice.mapper;


import java.util.List;
import org.mapstruct.Mapper;

import com.id.BackOffice.Dto.DepartementDto;
import com.id.BackOffice.model.Departement;



@Mapper(componentModel = "spring" , uses = {})
public interface DepartementMapper {
	
	DepartementDto toDto (Departement departement) ;
	List<DepartementDto> toDto (List<Departement> departement) ;
	Departement toEntity (DepartementDto departementDto);
	List<Departement> toEntity (List<DepartementDto> departementDto);
		

}

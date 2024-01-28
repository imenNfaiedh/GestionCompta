package com.id.BackOffice.mapper;


import java.util.List;

import org.mapstruct.Mapper;

import com.id.BackOffice.Dto.ManagerDto;
import com.id.BackOffice.model.Manager;

 

@Mapper(componentModel = "spring" , uses = {})
public interface ManagerMapper {
	
	ManagerDto toDto (Manager manager) ;
	List<ManagerDto> toDto (List<Manager> manager) ;
	Manager toEntity (ManagerDto managerDto);
	List<Manager> toEntity (List<ManagerDto> managerDto);
	
	

}

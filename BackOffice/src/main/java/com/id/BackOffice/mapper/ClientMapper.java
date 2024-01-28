package com.id.BackOffice.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.id.BackOffice.Dto.ClientDto;
import com.id.BackOffice.model.Client;

 

@Mapper(componentModel = "spring" , uses = {})
public interface ClientMapper {
	
	ClientDto toDto (Client client) ;
	List<ClientDto> toDto (List<Client> client) ;
	Client toEntity (ClientDto clientDto);
	List<Client> toEntity (List<ClientDto> clientDto);
	
	

	
	
}

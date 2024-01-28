package com.id.BackOffice.service;


import java.util.List;


import com.id.BackOffice.Dto.ClientDto;
import com.id.BackOffice.model.Client;


public interface ClientService {
	
	
	
	Client save(Client client);

	ClientDto findById(Long id);

	List<ClientDto> findAll();

	void deleteById(Long id);


}

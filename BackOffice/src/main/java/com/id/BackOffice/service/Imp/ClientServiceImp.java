package com.id.BackOffice.service.Imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.id.BackOffice.Dto.ClientDto;
import com.id.BackOffice.mapper.ClientMapper;
import com.id.BackOffice.model.Client;
import com.id.BackOffice.repository.ClientRepository;
import com.id.BackOffice.service.ClientService;

@Service  
public class ClientServiceImp implements ClientService {

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private ClientMapper clientMapper;

	@Override
	public Client save(Client client) {
		Client clientSave = clientRepository.save(client);
		return clientSave;
	}

	@Override
	public ClientDto findById(Long id) {
		Optional<Client> client = clientRepository.findById(id);
		if (client.isPresent()) {
			return clientMapper.toDto(client.get());
	} else {
			// throw exception
			System.out.println("Client is not exist");
			return null;
		}

	}

	@Override
	public List<ClientDto> findAll() {
		List<Client> clients = (List<Client>) clientRepository.findAll();
        List<ClientDto> clientDtos = clientMapper.toDto(clients);
        for (ClientDto item : clientDtos) {
        	item.setFullName(item.getFirstName() + " " + item.getLastName());
        }
		return clientDtos;
	}

	@Override
	public void deleteById(Long id) {
		clientRepository.deleteById(id);

	}

}

package com.id.BackOffice.service.Imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.id.BackOffice.Dto.ManagerDto;
import com.id.BackOffice.mapper.ManagerMapper;
import com.id.BackOffice.model.Manager;
import com.id.BackOffice.repository.ManagerRepository;
import com.id.BackOffice.service.ManagerService;

@Service
public class ManagerServiceImp  implements ManagerService{

	@Autowired
	private ManagerRepository managerRepository;
	
	@Autowired
	private ManagerMapper managerMapper;
	
	@Override
	public Manager save(Manager manager) {
		Manager managerSave = managerRepository.save(manager);
		return managerSave;
	}

	@Override
	public ManagerDto findById(Long id) {
		Optional<Manager> manager = managerRepository.findById(id);
		if (manager.isPresent()) {
			return managerMapper.toDto(manager.get());
		} else {
			// throw exception
			System.out.println("Manager is not exist");
			return null;
		}
		 
	}

	@Override
	public List<ManagerDto> findAll() {
		List<Manager> managers = (List<Manager>) managerRepository.findAll();
        List<ManagerDto> managerDtos = managerMapper.toDto(managers);
        for (ManagerDto item : managerDtos) {
        	item.setFullName(item.getFirstName() + " " + item.getLastName());
        }
		return  managerDtos;
	}
	
	
	@Override
	public void deleteById(Long id) {
		managerRepository.deleteById(id);
		
	}
	
	
	
}

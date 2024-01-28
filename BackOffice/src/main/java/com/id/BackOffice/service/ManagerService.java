package com.id.BackOffice.service;

import java.util.List;



import com.id.BackOffice.Dto.ManagerDto;
import com.id.BackOffice.model.Manager;

 

public interface ManagerService {

	Manager save(Manager manager);

	ManagerDto findById(Long id);

	List<ManagerDto> findAll();

	void deleteById(Long id);

	

}

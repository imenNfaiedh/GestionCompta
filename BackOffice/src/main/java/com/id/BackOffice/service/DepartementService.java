package com.id.BackOffice.service;


import java.util.List;
import com.id.BackOffice.Dto.DepartementDto;
import com.id.BackOffice.model.Departement;


public interface DepartementService {
	
	
	
	Departement save(Departement departement);

	DepartementDto findById(Long id);

	List<DepartementDto> findAll();

	void deleteById(Long id);


}


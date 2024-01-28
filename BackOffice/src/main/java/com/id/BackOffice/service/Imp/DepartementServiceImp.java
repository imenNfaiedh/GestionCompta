package com.id.BackOffice.service.Imp;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.id.BackOffice.Dto.DepartementDto;
import com.id.BackOffice.mapper.DepartementMapper;
import com.id.BackOffice.model.Departement;
import com.id.BackOffice.repository.DepartementRepository;
import com.id.BackOffice.service.DepartementService;

@Service
public  class DepartementServiceImp implements DepartementService {

	@Autowired
	private DepartementRepository departementRepository;
	
	@Autowired
	private DepartementMapper departementMapper; 
	
	@Override
	public Departement save(Departement departement) {
	      System.out.println(departement);
		Departement departementSave =  departementRepository.save(departement);
		return departementSave;
	}

	@Override
	public DepartementDto findById(Long id) {
		Optional<Departement> departement = departementRepository.findById(id);
		if (departement.isPresent()) {
			return departementMapper.toDto(departement.get());
		} else {
			// throw exception
			System.out.println("Departement is not exist");
			return null;
		}

	}

	@Override
	public List<DepartementDto> findAll() {
		List<Departement> departements = (List<Departement>) departementRepository.findAll();

		return departementMapper.toDto(departements);
	}

	@Override
	public void deleteById(Long id) {
		departementRepository.deleteById(id);
		
	}


}


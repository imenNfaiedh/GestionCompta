package com.id.BackOffice.service;

import java.util.List;

import com.id.BackOffice.Dto.CollaborateurDto;
import com.id.BackOffice.model.Collaborateur;

public interface CollaborateurService {
	
	Collaborateur save(Collaborateur collaborateur);
	CollaborateurDto findById(Long id);
	List<CollaborateurDto> findAll();
	void deleteById(Long id);

}

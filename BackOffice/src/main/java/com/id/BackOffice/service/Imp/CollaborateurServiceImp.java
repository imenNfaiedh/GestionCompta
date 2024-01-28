package com.id.BackOffice.service.Imp;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.id.BackOffice.Dto.CollaborateurDto;
import com.id.BackOffice.mapper.CollaborateurMapper;
import com.id.BackOffice.model.Collaborateur;
import com.id.BackOffice.repository.CollaborateurRepository;

import com.id.BackOffice.service.CollaborateurService;


@Service
public class CollaborateurServiceImp implements CollaborateurService {
	
	
	
	@Autowired
	private CollaborateurRepository collaborateurRepository;
	
	@Autowired
	private CollaborateurMapper collaborateurMapper;
	
	
	@Override
	public Collaborateur save(Collaborateur collaborateur) {
     Collaborateur collaborateurSave =  collaborateurRepository.save(collaborateur);
		return collaborateurSave;
	}


	@Override
	public CollaborateurDto findById(Long id) {
		 Optional<Collaborateur>  collaborateur = collaborateurRepository.findById(id);
		 if(collaborateur.isPresent()) {
			return collaborateurMapper.toDto(collaborateur.get());
		 }
		 else
		 {
			 // throw exception 
			 System.out.println("Collaborateur is not exist");
			 return null;
		 }
		 
	}

	@Override
	public List<CollaborateurDto> findAll() {
		List<Collaborateur> collaborateurs = (List<Collaborateur>) collaborateurRepository.findAll();		 
		return collaborateurMapper.toDto(collaborateurs);
	}

	@Override
	public void deleteById(Long id) {
		collaborateurRepository.deleteById(id);
		
	}



}

package com.id.BackOffice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.id.BackOffice.model.CollaboratuerPlanning;

@Repository
public interface CollaboratuerPlanningRepository extends CrudRepository<CollaboratuerPlanning,  Long> {
	
	List<CollaboratuerPlanning> findByPlaninngId(Long id);

}


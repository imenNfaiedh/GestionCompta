package com.id.BackOffice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.id.BackOffice.model.Planinng;

@Repository
public interface PlanningRepository  extends CrudRepository<Planinng, Long>{

}

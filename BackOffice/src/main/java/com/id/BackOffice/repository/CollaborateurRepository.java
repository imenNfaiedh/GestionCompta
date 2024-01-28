package com.id.BackOffice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.id.BackOffice.model.Collaborateur;

@Repository
public interface CollaborateurRepository  extends CrudRepository <Collaborateur,  Long>{

}
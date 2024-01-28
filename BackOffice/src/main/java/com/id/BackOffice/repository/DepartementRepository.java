package com.id.BackOffice.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.id.BackOffice.model.Departement;

@Repository
public interface DepartementRepository extends CrudRepository<Departement,  Long> {

}

package com.id.BackOffice.repository;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
import com.id.BackOffice.model.Manager;
 
@Repository
public interface ManagerRepository extends CrudRepository<Manager,  Long> {

	 
}
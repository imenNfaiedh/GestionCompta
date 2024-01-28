package com.id.BackOffice.repository;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
import com.id.BackOffice.model.Client;
 
@Repository
public interface ClientRepository extends CrudRepository<Client,  Long> {
 
}
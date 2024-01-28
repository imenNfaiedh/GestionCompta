package com.id.BackOffice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.id.BackOffice.model.Mission;
 
@Repository
public interface MissionRepository extends CrudRepository<Mission,  Long>{

}

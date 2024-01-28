package com.id.BackOffice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.id.BackOffice.jwt.JwtUserDetails;
import com.id.BackOffice.model.User;
@Repository
public interface UserRepository extends CrudRepository<JwtUserDetails,  Long> {

}

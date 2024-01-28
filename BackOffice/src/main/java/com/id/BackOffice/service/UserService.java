package com.id.BackOffice.service;

import java.util.List;

import com.id.BackOffice.Dto.UserDto;
import com.id.BackOffice.jwt.JwtUserDetails;
import com.id.BackOffice.model.User;

public interface UserService {
	
	JwtUserDetails save(JwtUserDetails user);

	JwtUserDetails findById(Long id);

	List<JwtUserDetails> findAll();

	void deleteById(Long id);

}

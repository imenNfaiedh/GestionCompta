package com.id.BackOffice.service.Imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.id.BackOffice.Dto.UserDto;
import com.id.BackOffice.jwt.JwtUserDetails;
import com.id.BackOffice.mapper.UserMapper;
import com.id.BackOffice.model.User;
import com.id.BackOffice.repository.UserRepository;
import com.id.BackOffice.service.UserService;

@Service
public class UserServiceImp  implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public JwtUserDetails save(JwtUserDetails user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	    String encodedString = encoder.encode(user.getPassword());
		user.setPassword(encodedString);
		JwtUserDetails userSave = userRepository.save(user);
		return userSave;
	}
	
	
	@Override
	public JwtUserDetails findById(Long id) {
		 return userRepository.findById(id).get();
		 
	}
	
	
	
	
	@Override
	public List<JwtUserDetails> findAll() {
		List<JwtUserDetails> users = (List<JwtUserDetails>) userRepository.findAll();

		return users;
	}
	
	
	@Override
	public void deleteById(Long id) {
		userRepository.deleteById(id);
		
	}
	
	
	
	
	

}

package com.id.BackOffice.mapper;
import java.util.List;

import org.mapstruct.Mapper;

import com.id.BackOffice.Dto.UserDto;
import com.id.BackOffice.model.User;

 

@Mapper(componentModel = "spring" , uses = {})


public interface UserMapper {
	
	UserDto toDto (User user) ;
	List<UserDto> toDto (List<User> user) ;
	User toEntity (UserDto userDto);
	List<User> toEntity (List<UserDto> userDto);
	
	
	
	
	

}

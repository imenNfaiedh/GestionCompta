package com.id.BackOffice.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {
	
	private Long id;
    private String firstName;
    private String lastName ;
    private String userName;
    private String  password ;
    private String confirmPassword;
    private String  email ;

    private String role ; // ADMIN // CONSULTANTE


}

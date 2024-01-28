package com.id.BackOffice.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "USER2")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User       {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
    private String firstName;
    private String lastName ;
    private String userName;
    private String password ;
    private String  email ;
 
}

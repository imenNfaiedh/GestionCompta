package com.id.BackOffice.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;
@Entity(name = "MANAGER")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Manager {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Long id;
	//@Column(name = "firstName")
	private String firstName;
	private String lastName;
	private Date dateNaiss;
	private Long cin;
	private Long numPasseport;
	private String nationalite;
	private String address ;
	private String pays ;
	private String gouvernerat ;
		
	private String telephone;
	private String email;
	private Long  codePostal;
	
    private String fullName;

	
	
	

}

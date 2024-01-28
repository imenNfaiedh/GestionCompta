package com.id.BackOffice.Dto;


import java.util.Date;

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
public class CollaborateurDto {
	
	private Long id;

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
	private String grade;
	private Long  codePostal;
	
	private DepartementDto departement;



}

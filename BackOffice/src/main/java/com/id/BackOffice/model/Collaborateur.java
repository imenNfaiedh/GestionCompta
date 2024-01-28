package com.id.BackOffice.model;


import java.util.Date;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

 
@Entity(name="COLLABORATEUR")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Collaborateur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
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
	
	@ManyToOne
	@JoinColumn(name = "Dept_Id")
	private Departement departement;
	

}

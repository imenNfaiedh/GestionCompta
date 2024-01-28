package com.id.BackOffice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

 

@Entity(name = "CLIENT")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Long id;
	@Column(name = "firstName")
	private String firstName;
	private String lastName;
	private Long telephone ;
	private String email;
	private String address;
	private String ville;
	private int  codePostal;
	
    private String fullName;

	

	

	
	
	
	
		
	
	

}

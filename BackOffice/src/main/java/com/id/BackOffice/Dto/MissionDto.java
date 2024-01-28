package com.id.BackOffice.Dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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

public class MissionDto {
	private Long id;
	private String name ;
	@Temporal(TemporalType.DATE)
	private Date dateDebut ;
	@Temporal(TemporalType.DATE)
	private Date dateFin ;
	private String localisation ;
	private int nbHeurs;
	
	private ClientDto client;
	private CollaborateurDto collaborateur;


	

}

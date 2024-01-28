package com.id.BackOffice.model;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity(name = "MISSION")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Mission {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Long id;
	private String name ;
	@Temporal(TemporalType.DATE)
	private Date dateDebut ;
	@Temporal(TemporalType.DATE)
	private Date dateFin ;
	private String localisation ;
	private int nbHeurs;
	  
	
	  @ManyToOne(cascade =  CascadeType.REMOVE)
	  private Client client;
	
	
	
	
	


}

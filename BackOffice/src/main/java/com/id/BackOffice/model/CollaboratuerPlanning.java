package com.id.BackOffice.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name = "CollaboratuerPlanning")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CollaboratuerPlanning {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Long id;
	
	@ManyToOne
	private Planinng planinng;
	@ManyToOne
	private Collaborateur collaborateur;
	
	private  int  nombreHeure;
	private Double  prixHeure;
	
	 

}

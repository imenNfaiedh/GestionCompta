package com.id.BackOffice.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Facturation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Long id;

}

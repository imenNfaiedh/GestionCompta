package com.id.BackOffice.model;

import java.util.Date;

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

@Entity(name = "Planinng")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Planinng {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Long id;
	
	private String reference;
	private  String designation;
	@ManyToOne
	@JoinColumn(name = "idMission")
	private Mission mission;

}

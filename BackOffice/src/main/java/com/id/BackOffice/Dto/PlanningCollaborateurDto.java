package com.id.BackOffice.Dto;

import java.util.Date;

import javax.persistence.ManyToOne;

import com.id.BackOffice.model.Collaborateur;
import com.id.BackOffice.model.Planinng;

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

public class PlanningCollaborateurDto {
	
    private Long id;
	private CollaborateurDto collaborateur;
	private  int  nombreHeure;
	private Double  prixHeure;
	private Double prixTotlale;
	

}

package com.id.BackOffice.Dto;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.id.BackOffice.model.Mission;

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
public class PlanningDto {
	
	
	
	private Long id;
	private  String reference;
	private  String designation;
	private  MissionDto mission;
	private List<PlanningCollaborateurDto> items;

}

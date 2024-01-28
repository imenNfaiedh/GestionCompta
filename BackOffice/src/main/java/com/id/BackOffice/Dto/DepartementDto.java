package com.id.BackOffice.Dto;


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

public class DepartementDto {
    private Long id;
    
	private String name;
	private  String specialite ;
	private ManagerDto manager;

	
}

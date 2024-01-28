package com.id.BackOffice.service;
import java.util.List;

import com.id.BackOffice.Dto.MissionDto;
import com.id.BackOffice.model.Mission;


public interface MissionService {
	

	Mission save(Mission mission);

	MissionDto findById(Long id);

	List<MissionDto> findAll();

	void deleteById(Long id);


}

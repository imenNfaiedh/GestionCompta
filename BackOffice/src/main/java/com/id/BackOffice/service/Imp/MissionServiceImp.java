package com.id.BackOffice.service.Imp;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.id.BackOffice.Dto.MissionDto;
import com.id.BackOffice.mapper.MissionMapper;
import com.id.BackOffice.model.Mission;
import com.id.BackOffice.repository.MissionRepository;
import com.id.BackOffice.service.MissionService;


@Service
public class MissionServiceImp  implements MissionService{
	
	
	
	@Autowired
	private MissionRepository missionRepository;
	
	
	@Autowired
	private MissionMapper missionMapper;
	
	@Override
	public Mission save(Mission mission) {
		 Mission missionSave =  missionRepository.save(mission);
		return missionSave;
	}

	@Override
	public MissionDto findById(Long id) {
		Optional<Mission> mission = missionRepository.findById(id);
		if (mission.isPresent()) {
			return missionMapper.toDto(mission.get());
		} else {
			// throw exception
			System.out.println("Mission is not exist");
			return null;
		}

	}

	@Override
	public List<MissionDto> findAll() {
		List<Mission> missions = (List<Mission>) missionRepository.findAll();

		return missionMapper.toDto(missions);
	}
	@Override
	public void deleteById(Long id) {
		missionRepository.deleteById(id);
		
	}


}

package com.id.BackOffice.mapper;


import java.util.List;                                                                               
import org.mapstruct.Mapper;


import com.id.BackOffice.Dto.MissionDto;
import com.id.BackOffice.model.Mission;

@Mapper(componentModel = "spring" , uses = {})
public interface MissionMapper {
	
	
		
	    MissionDto toDto (Mission mission) ;
		List<MissionDto> toDto (List<Mission> mission) ;
		Mission toEntity (MissionDto missionDto);
		List<Mission> toEntity (List<MissionDto> missionDto);
		
		

	

}

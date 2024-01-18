package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.PersonaEntityDto;
import com.Zooftware.Zooftware.modelJPA.persona.PersonaEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonaEntityMapper {


    PersonaEntityMapper mapper = Mappers.getMapper(PersonaEntityMapper.class);

    PersonaEntity toEntity(PersonaEntityDto personaEntityDto);


    PersonaEntityDto toDto(PersonaEntity personaEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PersonaEntity partialUpdate(PersonaEntityDto personaEntityDto, @MappingTarget PersonaEntity personaEntity);
}
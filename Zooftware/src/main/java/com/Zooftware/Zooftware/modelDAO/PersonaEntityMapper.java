package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.PersonaEntityDto;
import com.Zooftware.Zooftware.modelJPA.PersonaEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PersonaEntityMapper {

    PersonaEntityMapper INSTANCE= Mappers.getMapper(PersonaEntityMapper.class);
    PersonaEntity toEntity(PersonaEntityDto personaEntityDto);

    PersonaEntityDto toDto(PersonaEntity personaEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PersonaEntity partialUpdate(PersonaEntityDto personaEntityDto, @MappingTarget PersonaEntity personaEntity);
}
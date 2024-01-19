package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ClienteEntityDto;
import com.Zooftware.Zooftware.modelDTO.EmpleadoEntityDto;
import com.Zooftware.Zooftware.modelDTO.JefeEntityDto;
import com.Zooftware.Zooftware.modelDTO.PersonaEntityDto;
import com.Zooftware.Zooftware.modelJPA.persona.ClienteEntity;
import com.Zooftware.Zooftware.modelJPA.persona.EmpleadoEntity;
import com.Zooftware.Zooftware.modelJPA.persona.JefeEntity;
import com.Zooftware.Zooftware.modelJPA.persona.PersonaEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonaEntityMapper {
    PersonaEntityMapper mapper = Mappers.getMapper(PersonaEntityMapper.class);
    EmpleadoEntity toEmpleadoEntity(EmpleadoEntityDto personaEntityDto);
    JefeEntity toJefeEntity(JefeEntityDto personaEntityDto);
    ClienteEntity toClienteEntity(ClienteEntityDto personaEntityDto);

    EmpleadoEntityDto toEmpleadoDto(PersonaEntity personaEntity);
    JefeEntityDto toJefeDto(PersonaEntity personaEntity);
    ClienteEntityDto toClienteDto(PersonaEntity personaEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PersonaEntity partialUpdate(PersonaEntityDto personaEntityDto, @MappingTarget PersonaEntity personaEntity);
}
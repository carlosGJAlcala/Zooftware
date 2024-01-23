package com.Zooftware.Zooftware.model.dao.persona;

import com.Zooftware.Zooftware.model.dto.persona.ClienteEntityDto;
import com.Zooftware.Zooftware.model.dto.persona.EmpleadoEntityDto;
import com.Zooftware.Zooftware.model.dto.persona.JefeEntityDto;
import com.Zooftware.Zooftware.model.dto.persona.PersonaEntityDto;
import com.Zooftware.Zooftware.model.entities.persona.ClienteEntity;
import com.Zooftware.Zooftware.model.entities.persona.EmpleadoEntity;
import com.Zooftware.Zooftware.model.entities.persona.JefeEntity;
import com.Zooftware.Zooftware.model.entities.persona.PersonaEntity;
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
package com.Zooftware.Zooftware.model.dao.persona;

import com.Zooftware.Zooftware.model.dto.persona.EmpleadoEntityDto;
import com.Zooftware.Zooftware.model.dto.persona.JefeEntityDto;
import com.Zooftware.Zooftware.model.dto.persona.TrabajadorEntityDto;
import com.Zooftware.Zooftware.model.entities.persona.EmpleadoEntity;
import com.Zooftware.Zooftware.model.entities.persona.JefeEntity;
import com.Zooftware.Zooftware.model.entities.persona.TrabajadorEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TrabajadorEntityMapper {
    EmpleadoEntityMapper mapper = Mappers.getMapper(EmpleadoEntityMapper.class);

    EmpleadoEntity toEntity(EmpleadoEntityDto empleadoEntity);
    JefeEntity toEntity(JefeEntityDto jefeEntity);

    EmpleadoEntityDto toDto(EmpleadoEntity empleadoEntityDto);
    JefeEntityDto toDto(JefeEntity jefeEntityDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    TrabajadorEntity partialUpdate(TrabajadorEntityDto trabajadorEntityDto, @MappingTarget TrabajadorEntity trabajadorEntity);
}
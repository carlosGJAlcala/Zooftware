package com.Zooftware.Zooftware.model.dao.persona;

import com.Zooftware.Zooftware.model.dto.persona.EmpleadoEntityDto;
import com.Zooftware.Zooftware.model.entities.persona.EmpleadoEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmpleadoEntityMapper {

    EmpleadoEntityMapper mapper = Mappers.getMapper(EmpleadoEntityMapper.class);
    EmpleadoEntity toEntity(EmpleadoEntityDto empleadoEntityDto);

    EmpleadoEntityDto toDto(EmpleadoEntity empleadoEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    EmpleadoEntity partialUpdate(EmpleadoEntityDto empleadoEntityDto, @MappingTarget EmpleadoEntity empleadoEntity);
}
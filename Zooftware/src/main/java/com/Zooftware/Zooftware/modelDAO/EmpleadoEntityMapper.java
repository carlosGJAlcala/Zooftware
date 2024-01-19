package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.EmpleadoEntityDto;
import com.Zooftware.Zooftware.modelJPA.persona.EmpleadoEntity;
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
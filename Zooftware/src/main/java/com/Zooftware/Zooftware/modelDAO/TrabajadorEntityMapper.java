package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.EmpleadoEntityDto;
import com.Zooftware.Zooftware.modelDTO.JefeEntityDto;
import com.Zooftware.Zooftware.modelDTO.TrabajadorEntityDto;
import com.Zooftware.Zooftware.modelJPA.persona.EmpleadoEntity;
import com.Zooftware.Zooftware.modelJPA.persona.JefeEntity;
import com.Zooftware.Zooftware.modelJPA.persona.TrabajadorEntity;
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
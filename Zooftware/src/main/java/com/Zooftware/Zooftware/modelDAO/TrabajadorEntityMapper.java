package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.EmpleadoEntityDto;
import com.Zooftware.Zooftware.modelDTO.JefeEntityDto;
import com.Zooftware.Zooftware.modelDTO.TrabajadorEntityDto;
import com.Zooftware.Zooftware.modelJPA.persona.TrabajadorEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TrabajadorEntityMapper {

    TrabajadorEntityMapper mapper = Mappers.getMapper(TrabajadorEntityMapper.class);
    TrabajadorEntity toEntity(TrabajadorEntityDto trabajadorEntityDto);

    EmpleadoEntityDto toDtoEmpleado(TrabajadorEntity trabajadorEntity);
    JefeEntityDto toDtoJefe(TrabajadorEntity trabajadorEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    TrabajadorEntity partialUpdate(TrabajadorEntityDto trabajadorEntityDto, @MappingTarget TrabajadorEntity trabajadorEntity);
}
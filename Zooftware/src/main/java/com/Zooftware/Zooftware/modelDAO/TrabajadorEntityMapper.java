package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.TrabajadorEntityDto;
import com.Zooftware.Zooftware.modelJPA.TrabajadorEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TrabajadorEntityMapper {

    TrabajadorEntityMapper mapper = Mappers.getMapper(TrabajadorEntityMapper.class);
    TrabajadorEntity toEntity(TrabajadorEntityDto trabajadorEntityDto);

    TrabajadorEntityDto toDto(TrabajadorEntity trabajadorEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    TrabajadorEntity partialUpdate(TrabajadorEntityDto trabajadorEntityDto, @MappingTarget TrabajadorEntity trabajadorEntity);
}
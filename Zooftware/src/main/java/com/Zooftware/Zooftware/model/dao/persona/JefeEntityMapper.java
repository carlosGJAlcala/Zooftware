package com.Zooftware.Zooftware.model.dao.persona;

import com.Zooftware.Zooftware.model.dto.persona.JefeEntityDto;
import com.Zooftware.Zooftware.model.entities.persona.JefeEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface JefeEntityMapper {

    JefeEntityMapper mapper = Mappers.getMapper(JefeEntityMapper.class);

    JefeEntity toEntity(JefeEntityDto jefeEntityDto);

    JefeEntityDto toDto(JefeEntity jefeEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    JefeEntity partialUpdate(JefeEntityDto jefeEntityDto, @MappingTarget JefeEntity jefeEntity);
}
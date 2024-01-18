package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.JefeEntityDto;
import com.Zooftware.Zooftware.modelJPA.JefeEntity;
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
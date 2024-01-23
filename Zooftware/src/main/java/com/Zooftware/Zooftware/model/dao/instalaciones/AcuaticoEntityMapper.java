package com.Zooftware.Zooftware.model.dao.instalaciones;

import com.Zooftware.Zooftware.model.dto.instalaciones.AcuaticoEntityDto;
import com.Zooftware.Zooftware.model.entities.instalaciones.AcuaticoEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AcuaticoEntityMapper {
    AcuaticoEntityMapper mapper= Mappers.getMapper(AcuaticoEntityMapper.class);
    AcuaticoEntity toEntity(AcuaticoEntityDto acuaticoEntityDto);

    AcuaticoEntityDto toDto(AcuaticoEntity acuaticoEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    AcuaticoEntity partialUpdate(AcuaticoEntityDto acuaticoEntityDto, @MappingTarget AcuaticoEntity acuaticoEntity);
}
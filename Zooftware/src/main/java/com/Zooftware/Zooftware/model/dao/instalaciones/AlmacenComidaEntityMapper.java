package com.Zooftware.Zooftware.model.dao.instalaciones;

import com.Zooftware.Zooftware.model.dto.instalaciones.AlmacenComidaEntityDto;
import com.Zooftware.Zooftware.model.entities.instalaciones.AlmacenComidaEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AlmacenComidaEntityMapper {

    AlmacenComidaEntityMapper mapper= Mappers.getMapper(AlmacenComidaEntityMapper.class);

    AlmacenComidaEntity toEntity(AlmacenComidaEntityDto almacenComidaEntityDto);

    AlmacenComidaEntityDto toDto(AlmacenComidaEntity almacenComidaEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    AlmacenComidaEntity partialUpdate(AlmacenComidaEntityDto almacenComidaEntityDto, @MappingTarget AlmacenComidaEntity almacenComidaEntity);
}
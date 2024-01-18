package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AlmacenComidaEntityDto;
import com.Zooftware.Zooftware.modelJPA.instalaciones.AlmacenComidaEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AlmacenComidaEntityMapper {
    AlmacenComidaEntityMapper INSTANCE= Mappers.getMapper(AlmacenComidaEntityMapper.class);
    AlmacenComidaEntity toEntity(AlmacenComidaEntityDto almacenComidaEntityDto);

    AlmacenComidaEntityDto toDto(AlmacenComidaEntity almacenComidaEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    AlmacenComidaEntity partialUpdate(AlmacenComidaEntityDto almacenComidaEntityDto, @MappingTarget AlmacenComidaEntity almacenComidaEntity);
}
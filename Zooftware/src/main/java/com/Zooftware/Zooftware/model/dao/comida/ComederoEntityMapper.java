package com.Zooftware.Zooftware.model.dao.comida;

import com.Zooftware.Zooftware.model.dto.comida.ComederoEntityDto;
import com.Zooftware.Zooftware.model.entities.instalaciones.ComederoEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ComederoEntityMapper {
    ComederoEntityMapper mapper= Mappers.getMapper(ComederoEntityMapper.class);
    ComederoEntity toEntity(ComederoEntityDto comederoEntityDto);
    @Mapping(target = "habitat",ignore = true)
    ComederoEntityDto toDto(ComederoEntity comederoEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ComederoEntity partialUpdate(ComederoEntityDto comederoEntityDto, @MappingTarget ComederoEntity comederoEntity);
}
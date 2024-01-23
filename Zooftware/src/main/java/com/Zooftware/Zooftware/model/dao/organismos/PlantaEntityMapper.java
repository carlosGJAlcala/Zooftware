package com.Zooftware.Zooftware.model.dao.organismos;

import com.Zooftware.Zooftware.model.dto.organismo.PlantaEntityDto;
import com.Zooftware.Zooftware.model.entities.organimos.PlantaEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PlantaEntityMapper {
    PlantaEntityMapper mapper= Mappers.getMapper(PlantaEntityMapper.class);
    PlantaEntity toEntity(PlantaEntityDto plantaEntityDto);

    @Mapping(target = "habitat",ignore = true)
    @Mapping(target = "habitatEntity",ignore = true)
    PlantaEntityDto toDto(PlantaEntity plantaEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PlantaEntity partialUpdate(PlantaEntityDto plantaEntityDto, @MappingTarget PlantaEntity plantaEntity);
}
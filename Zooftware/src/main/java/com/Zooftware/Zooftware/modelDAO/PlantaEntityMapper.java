package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.PlantaEntityDto;
import com.Zooftware.Zooftware.modelJPA.PlantaEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PlantaEntityMapper {
    PlantaEntityMapper mapper = Mappers.getMapper(PlantaEntityMapper.class);
    PlantaEntity toEntity(PlantaEntityDto plantaEntityDto);

    PlantaEntityDto toDto(PlantaEntity plantaEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PlantaEntity partialUpdate(PlantaEntityDto plantaEntityDto, @MappingTarget PlantaEntity plantaEntity);
}
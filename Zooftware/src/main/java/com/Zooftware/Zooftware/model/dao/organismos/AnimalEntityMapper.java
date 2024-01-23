package com.Zooftware.Zooftware.model.dao.organismos;

import com.Zooftware.Zooftware.model.dto.organismo.AnimalEntityDto;
import com.Zooftware.Zooftware.model.entities.organimos.AnimalEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnimalEntityMapper {
    AnimalEntityMapper mapper= Mappers.getMapper(AnimalEntityMapper.class);


    AnimalEntity toEntity(AnimalEntityDto animalEntityDto);

    @Mapping(target = "habitat",ignore = true)
    AnimalEntityDto toDto(AnimalEntity animalEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    AnimalEntity partialUpdate(AnimalEntityDto animalEntityDto, @MappingTarget AnimalEntity animalEntity);
}
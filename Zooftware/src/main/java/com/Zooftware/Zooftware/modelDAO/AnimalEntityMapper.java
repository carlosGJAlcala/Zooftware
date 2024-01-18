package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;
import com.Zooftware.Zooftware.modelJPA.organimos.AnimalEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnimalEntityMapper {
    AnimalEntityMapper mapper= Mappers.getMapper(AnimalEntityMapper.class);
    AnimalEntity toEntity(AnimalEntityDto animalEntityDto);

    AnimalEntityDto toDto(AnimalEntity animalEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    AnimalEntity partialUpdate(AnimalEntityDto animalEntityDto, @MappingTarget AnimalEntity animalEntity);
}
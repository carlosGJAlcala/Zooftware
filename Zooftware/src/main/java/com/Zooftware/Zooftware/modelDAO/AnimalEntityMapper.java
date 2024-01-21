package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;
import com.Zooftware.Zooftware.modelJPA.organimos.AnimalEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnimalEntityMapper {
    AnimalEntityMapper mapper= Mappers.getMapper(AnimalEntityMapper.class);

    @Mapping(target = "habitat", ignore = true)
    AnimalEntity toEntity(AnimalEntityDto animalEntityDto);
    @Mapping(target = "habitat", ignore = true)
    AnimalEntityDto toDto(AnimalEntity animalEntity);
    @Mapping(target = "habitat", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    AnimalEntity partialUpdate(AnimalEntityDto animalEntityDto, @MappingTarget AnimalEntity animalEntity);
}
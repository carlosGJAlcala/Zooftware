package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.DimensionAnimalEntityDto;
import com.Zooftware.Zooftware.modelJPA.DimensionAnimalEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DimensionAnimalEntityMapper {

    DimensionAnimalEntityMapper mapper = Mappers.getMapper(DimensionAnimalEntityMapper.class);
    DimensionAnimalEntity toEntity(DimensionAnimalEntityDto dimensionAnimalEntityDto);

    DimensionAnimalEntityDto toDto(DimensionAnimalEntity dimensionAnimalEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    DimensionAnimalEntity partialUpdate(DimensionAnimalEntityDto dimensionAnimalEntityDto, @MappingTarget DimensionAnimalEntity dimensionAnimalEntity);
}
package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.DimensionEntityDto;
import com.Zooftware.Zooftware.modelJPA.DimensionEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DimensionEntityMapper {
    DimensionEntityMapper mapper = Mappers.getMapper(DimensionEntityMapper.class);

    DimensionEntity toEntity(DimensionEntityDto dimensionEntityDto);

    DimensionEntityDto toDto(DimensionEntity dimensionEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    DimensionEntity partialUpdate(DimensionEntityDto dimensionEntityDto, @MappingTarget DimensionEntity dimensionEntity);
}
package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AcuaticoEntityDto;
import com.Zooftware.Zooftware.modelJPA.AcuaticoEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AcuaticoEntityMapper {
    AcuaticoEntityMapper INSTANCE = Mappers.getMapper(AcuaticoEntityMapper.class);
    AcuaticoEntity toEntity(AcuaticoEntityDto acuaticoEntityDto);

    AcuaticoEntityDto toDto(AcuaticoEntity acuaticoEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    AcuaticoEntity partialUpdate(AcuaticoEntityDto acuaticoEntityDto, @MappingTarget AcuaticoEntity acuaticoEntity);
}
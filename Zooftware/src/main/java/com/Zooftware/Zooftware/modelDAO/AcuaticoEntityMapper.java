package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AcuaticoEntityDto;
import com.Zooftware.Zooftware.modelJPA.AcuaticoEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AcuaticoEntityMapper {
    AcuaticoEntity toEntity(AcuaticoEntityDto acuaticoEntityDto);

    AcuaticoEntityDto toDto(AcuaticoEntity acuaticoEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    AcuaticoEntity partialUpdate(AcuaticoEntityDto acuaticoEntityDto, @MappingTarget AcuaticoEntity acuaticoEntity);
}
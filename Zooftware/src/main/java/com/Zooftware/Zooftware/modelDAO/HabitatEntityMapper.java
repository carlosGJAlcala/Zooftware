package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.HabitatEntityDto;
import com.Zooftware.Zooftware.modelJPA.instalaciones.HabitatEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HabitatEntityMapper {
    HabitatEntityMapper mapper = Mappers.getMapper(HabitatEntityMapper.class);
    HabitatEntity toEntity(HabitatEntityDto habitatEntityDto);

    HabitatEntityDto toDto(HabitatEntity habitatEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    HabitatEntity partialUpdate(HabitatEntityDto habitatEntityDto, @MappingTarget HabitatEntity habitatEntity);
}
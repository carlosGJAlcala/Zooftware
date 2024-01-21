package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.HabitatEntityDto;
import com.Zooftware.Zooftware.modelJPA.instalaciones.HabitatEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HabitatEntityMapper {

    HabitatEntityMapper mapper = Mappers.getMapper(HabitatEntityMapper.class);
    @Mapping(target = "animales", ignore = true)
    @Mapping(target = "plantas", ignore = true)
    @Mapping(target = "bebederos", ignore = true)
    @Mapping(target = "comederos", ignore = true)
    HabitatEntity toEntity(HabitatEntityDto habitatEntityDto);
    @Mapping(target = "animales", ignore = true)
    @Mapping(target = "plantas", ignore = true)
    @Mapping(target = "bebederos", ignore = true)
    @Mapping(target = "comederos", ignore = true)
    HabitatEntityDto toDto(HabitatEntity habitatEntity);

    @Mapping(target = "animales", ignore = true)
    @Mapping(target = "plantas", ignore = true)
    @Mapping(target = "bebederos", ignore = true)
    @Mapping(target = "comederos", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    HabitatEntity partialUpdate(HabitatEntityDto habitatEntityDto, @MappingTarget HabitatEntity habitatEntity);
}
package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ComederoEntityDto;
import com.Zooftware.Zooftware.modelJPA.instalaciones.ComederoEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ComederoEntityMapper {
    ComederoEntityMapper mapper= Mappers.getMapper(ComederoEntityMapper.class);

    ComederoEntity toEntity(ComederoEntityDto comederoEntityDto);

    ComederoEntityDto toDto(ComederoEntity comederoEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ComederoEntity partialUpdate(ComederoEntityDto comederoEntityDto, @MappingTarget ComederoEntity comederoEntity);
}
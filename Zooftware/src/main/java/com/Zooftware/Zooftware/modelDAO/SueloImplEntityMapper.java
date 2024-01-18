package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.SueloImplEntityDto;
import com.Zooftware.Zooftware.modelJPA.SueloImplEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SueloImplEntityMapper {
    SueloImplEntityMapper mapper = Mappers.getMapper(SueloImplEntityMapper.class);
    SueloImplEntity toEntity(SueloImplEntityDto sueloImplEntityDto);

    SueloImplEntityDto toDto(SueloImplEntity sueloImplEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    SueloImplEntity partialUpdate(SueloImplEntityDto sueloImplEntityDto, @MappingTarget SueloImplEntity sueloImplEntity);
}
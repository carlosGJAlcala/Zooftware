package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ComidaHerviboraEntityDto;
import com.Zooftware.Zooftware.modelJPA.ComidaOmnivoraEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ComidaOmnivoraEntityMapper {

    ComidaOmnivoraEntityMapper mapper = Mappers.getMapper(ComidaOmnivoraEntityMapper.class);
    ComidaOmnivoraEntity toEntity(ComidaHerviboraEntityDto comidaHerviboraEntityDto);

    ComidaHerviboraEntityDto toDto(ComidaOmnivoraEntity comidaOmnivoraEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ComidaOmnivoraEntity partialUpdate(ComidaHerviboraEntityDto comidaHerviboraEntityDto, @MappingTarget ComidaOmnivoraEntity comidaOmnivoraEntity);
}
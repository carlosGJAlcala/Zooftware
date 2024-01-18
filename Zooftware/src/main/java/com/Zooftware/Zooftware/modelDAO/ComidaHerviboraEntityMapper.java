package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ComidaHerviboraEntityDto;
import com.Zooftware.Zooftware.modelJPA.ComidaHerviboraEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ComidaHerviboraEntityMapper {
    ComidaHerviboraEntityMapper mapper = Mappers.getMapper(ComidaHerviboraEntityMapper.class);
    ComidaHerviboraEntity toEntity(ComidaHerviboraEntityDto comidaHerviboraEntityDto);

    ComidaHerviboraEntityDto toDto(ComidaHerviboraEntity comidaHerviboraEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ComidaHerviboraEntity partialUpdate(ComidaHerviboraEntityDto comidaHerviboraEntityDto, @MappingTarget ComidaHerviboraEntity comidaHerviboraEntity);
}
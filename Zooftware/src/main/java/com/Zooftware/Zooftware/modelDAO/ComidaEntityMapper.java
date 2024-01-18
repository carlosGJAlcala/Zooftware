package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ComidaEntityDto;
import com.Zooftware.Zooftware.modelJPA.comida.ComidaEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ComidaEntityMapper {
    ComidaEntityMapper mapper = Mappers.getMapper(ComidaEntityMapper.class);
    ComidaEntity toEntity(ComidaEntityDto comidaEntityDto);

    ComidaEntityDto toDto(ComidaEntity comidaEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ComidaEntity partialUpdate(ComidaEntityDto comidaEntityDto, @MappingTarget ComidaEntity comidaEntity);
}
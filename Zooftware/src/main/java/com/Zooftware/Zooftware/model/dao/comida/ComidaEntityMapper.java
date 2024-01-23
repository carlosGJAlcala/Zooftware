package com.Zooftware.Zooftware.model.dao.comida;

import com.Zooftware.Zooftware.model.dto.comida.ComidaEntityDto;
import com.Zooftware.Zooftware.model.entities.comida.ComidaEntity;
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
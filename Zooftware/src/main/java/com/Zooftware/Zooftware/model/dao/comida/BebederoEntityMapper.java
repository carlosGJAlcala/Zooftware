package com.Zooftware.Zooftware.model.dao.comida;

import com.Zooftware.Zooftware.model.dto.comida.BebederoEntityDto;
import com.Zooftware.Zooftware.model.entities.instalaciones.BebederoEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BebederoEntityMapper {
    BebederoEntityMapper mapper= Mappers.getMapper(BebederoEntityMapper.class);
    BebederoEntity toEntity(BebederoEntityDto bebederoEntityDto);

    @Mapping(target = "habitat",ignore = true)
    BebederoEntityDto toDto(BebederoEntity bebederoEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    BebederoEntity partialUpdate(BebederoEntityDto bebederoEntityDto, @MappingTarget BebederoEntity bebederoEntity);
}
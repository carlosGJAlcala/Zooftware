package com.Zooftware.Zooftware.model.dao.instalaciones;

import com.Zooftware.Zooftware.model.dto.instalaciones.TerrestreEntityDto;
import com.Zooftware.Zooftware.model.entities.instalaciones.TerrestreEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TerrestreEntityMapper {
    TerrestreEntityMapper mapper = Mappers.getMapper(TerrestreEntityMapper.class);
    TerrestreEntity toEntity(TerrestreEntityDto terrestreEntityDto);

    TerrestreEntityDto toDto(TerrestreEntity terrestreEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    TerrestreEntity partialUpdate(TerrestreEntityDto terrestreEntityDto, @MappingTarget TerrestreEntity terrestreEntity);
}
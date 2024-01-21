package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.BebederoEntityDto;
import com.Zooftware.Zooftware.modelJPA.instalaciones.BebederoEntity;
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
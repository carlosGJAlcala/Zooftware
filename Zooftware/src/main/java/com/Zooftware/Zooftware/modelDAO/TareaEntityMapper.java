package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.TareaEntityDto;
import com.Zooftware.Zooftware.modelJPA.TareaEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TareaEntityMapper {
    TareaEntityMapper mapper = Mappers.getMapper(TareaEntityMapper.class);
    TareaEntity toEntity(TareaEntityDto tareaEntityDto);

    TareaEntityDto toDto(TareaEntity tareaEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    TareaEntity partialUpdate(TareaEntityDto tareaEntityDto, @MappingTarget TareaEntity tareaEntity);
}
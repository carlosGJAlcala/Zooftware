package com.Zooftware.Zooftware.model.dao.instalaciones;

import com.Zooftware.Zooftware.model.dto.instalaciones.AnfibioEntityDto;
import com.Zooftware.Zooftware.model.entities.instalaciones.AnfibioEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnfibioEntityMapper {
    AnfibioEntityMapper mapper= Mappers.getMapper(AnfibioEntityMapper.class);

    AnfibioEntity toEntity(AnfibioEntityDto anfibioEntityDto);

    AnfibioEntityDto toDto(AnfibioEntity anfibioEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    AnfibioEntity partialUpdate(AnfibioEntityDto anfibioEntityDto, @MappingTarget AnfibioEntity anfibioEntity);
}
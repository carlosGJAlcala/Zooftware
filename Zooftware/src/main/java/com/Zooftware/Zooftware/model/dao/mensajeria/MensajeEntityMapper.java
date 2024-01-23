package com.Zooftware.Zooftware.model.dao.mensajeria;

import com.Zooftware.Zooftware.model.dto.mensajeria.MensajeEntityDto;
import com.Zooftware.Zooftware.model.entities.mensajeria.MensajeEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MensajeEntityMapper {
    MensajeEntityMapper mapper = Mappers.getMapper(MensajeEntityMapper.class);
    MensajeEntity toEntity(MensajeEntityDto mensajeEntityDto);

    MensajeEntityDto toDto(MensajeEntity mensajeEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    MensajeEntity partialUpdate(MensajeEntityDto mensajeEntityDto, @MappingTarget MensajeEntity mensajeEntity);
}
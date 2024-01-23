package com.Zooftware.Zooftware.model.dao.persona;

import com.Zooftware.Zooftware.model.dto.persona.ClienteEntityDto;
import com.Zooftware.Zooftware.model.entities.persona.ClienteEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClienteEntityMapper {
    ClienteEntityMapper mapper = Mappers.getMapper(ClienteEntityMapper.class);
    ClienteEntity toEntity(ClienteEntityDto clienteEntityDto);

    ClienteEntityDto toDto(ClienteEntity clienteEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ClienteEntity partialUpdate(ClienteEntityDto clienteEntityDto, @MappingTarget ClienteEntity clienteEntity);
}
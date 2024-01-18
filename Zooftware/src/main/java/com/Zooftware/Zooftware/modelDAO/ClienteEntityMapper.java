package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ClienteEntityDto;
import com.Zooftware.Zooftware.modelJPA.ClienteEntity;
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
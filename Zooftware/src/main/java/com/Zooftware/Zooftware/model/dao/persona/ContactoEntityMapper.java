package com.Zooftware.Zooftware.model.dao.persona;

import com.Zooftware.Zooftware.model.dto.persona.ContactoEntityDto;
import com.Zooftware.Zooftware.model.entities.persona.ContactoEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ContactoEntityMapper {
    ContactoEntityMapper mapper = Mappers.getMapper(ContactoEntityMapper.class);
    ContactoEntity toEntity(ContactoEntityDto contactoEntityDto);

    ContactoEntityDto toDto(ContactoEntity contactoEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ContactoEntity partialUpdate(ContactoEntityDto contactoEntityDto, @MappingTarget ContactoEntity contactoEntity);
}
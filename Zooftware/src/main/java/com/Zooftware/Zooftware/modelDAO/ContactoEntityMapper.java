package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ContactoEntityDto;
import com.Zooftware.Zooftware.modelJPA.ContactoEntity;
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
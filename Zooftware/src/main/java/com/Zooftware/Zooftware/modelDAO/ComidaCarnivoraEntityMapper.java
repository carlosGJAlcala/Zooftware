package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ComidaCarnivoraEntityDto;
import com.Zooftware.Zooftware.modelJPA.ComidaCarnivoraEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ComidaCarnivoraEntityMapper {
    ComidaCarnivoraEntityMapper mapper = Mappers.getMapper(ComidaCarnivoraEntityMapper.class);
    ComidaCarnivoraEntity toEntity(ComidaCarnivoraEntityDto comidaCarnivoraEntityDto);

    ComidaCarnivoraEntityDto toDto(ComidaCarnivoraEntity comidaCarnivoraEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ComidaCarnivoraEntity partialUpdate(ComidaCarnivoraEntityDto comidaCarnivoraEntityDto, @MappingTarget ComidaCarnivoraEntity comidaCarnivoraEntity);
}
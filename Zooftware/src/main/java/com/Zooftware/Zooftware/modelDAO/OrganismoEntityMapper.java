package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.OrganismoEntityDto;
import com.Zooftware.Zooftware.modelJPA.OrganismoEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrganismoEntityMapper {
    OrganismoEntityMapper mapper = Mappers.getMapper(OrganismoEntityMapper.class);
    OrganismoEntity toEntity(OrganismoEntityDto organismoEntityDto);

    OrganismoEntityDto toDto(OrganismoEntity organismoEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    OrganismoEntity partialUpdate(OrganismoEntityDto organismoEntityDto, @MappingTarget OrganismoEntity organismoEntity);
}
package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AlmacenComidaEntityDto;
import com.Zooftware.Zooftware.modelJPA.AlmacenComidaEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AlmacenComidaEntityMapper {
    AlmacenComidaEntity toEntity(AlmacenComidaEntityDto almacenComidaEntityDto);

    AlmacenComidaEntityDto toDto(AlmacenComidaEntity almacenComidaEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    AlmacenComidaEntity partialUpdate(AlmacenComidaEntityDto almacenComidaEntityDto, @MappingTarget AlmacenComidaEntity almacenComidaEntity);
}
package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.TrabajadorEntityDto;
import com.Zooftware.Zooftware.modelJPA.TrabajadorEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface TrabajadorEntityMapperEjemplo {
    TrabajadorEntity toEntity(TrabajadorEntityDto trabajadorEntityDto);

    TrabajadorEntityDto toDto(TrabajadorEntity trabajadorEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    TrabajadorEntity partialUpdate(TrabajadorEntityDto trabajadorEntityDto, @MappingTarget TrabajadorEntity trabajadorEntity);
}
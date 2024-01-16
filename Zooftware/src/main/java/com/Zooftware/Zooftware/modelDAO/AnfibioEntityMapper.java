package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AnfibioEntityDto;
import com.Zooftware.Zooftware.modelJPA.AnfibioEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AnfibioEntityMapper {
    AnfibioEntity toEntity(AnfibioEntityDto anfibioEntityDto);

    AnfibioEntityDto toDto(AnfibioEntity anfibioEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    AnfibioEntity partialUpdate(AnfibioEntityDto anfibioEntityDto, @MappingTarget AnfibioEntity anfibioEntity);
}
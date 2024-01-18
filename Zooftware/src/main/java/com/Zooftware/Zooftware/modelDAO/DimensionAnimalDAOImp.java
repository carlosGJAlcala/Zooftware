package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.DimensionAnimalEntityDto;
import com.Zooftware.Zooftware.modelDTO.DimensionEntityDto;
import com.Zooftware.Zooftware.modelJPA.ComederoEntity;
import com.Zooftware.Zooftware.modelJPA.DimensionAnimalEntity;
import com.Zooftware.Zooftware.modelJPA.DimensionEntity;
import com.Zooftware.Zooftware.repository.ComederoEntityRepository;
import com.Zooftware.Zooftware.repository.DimensionAnimalEntityRepository;
import com.Zooftware.Zooftware.repository.DimensionEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class DimensionAnimalDAOImp implements IDimensionAnimalDAO {

    @Autowired
    DimensionAnimalEntityRepository dimensionAnimalJPA;
    DimensionAnimalEntityMapper dimensionAnimalEntityMapper;

    @Override
    public DimensionAnimalEntityDto buscarPorId(Integer id) {
        Optional<DimensionAnimalEntity> optional = dimensionAnimalJPA.findById(id);
        if (optional.isPresent()) {
            return dimensionAnimalEntityMapper.mapper.toDto(optional.get());
        }
        return null;
    }

    @Override
    public void actualizarDimension(DimensionAnimalEntityDto dimension) {
        dimensionAnimalJPA.deleteById(dimension.getId());
        DimensionAnimalEntity dimensionAnimalEntity=dimensionAnimalEntityMapper.mapper.toEntity(dimension);
        dimensionAnimalJPA.save(dimensionAnimalEntity);
    }

    @Override
    public void guardarDimension(DimensionAnimalEntityDto dimension) {
        DimensionAnimalEntity dimensionAnimalEntity=dimensionAnimalEntityMapper.mapper.toEntity(dimension);
        dimensionAnimalJPA.save(dimensionAnimalEntity);
    }

    @Override
    public void eliminarDimension(Integer id) {
        dimensionAnimalJPA.deleteById(id);
    }
}

package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.DimensionEntityDto;
import com.Zooftware.Zooftware.modelJPA.ClienteEntity;
import com.Zooftware.Zooftware.modelJPA.DimensionEntity;
import com.Zooftware.Zooftware.repository.ClienteEntityRepository;
import com.Zooftware.Zooftware.repository.DimensionEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class DimensionDAOImp implements IDimensionDAO{
    @Autowired
    DimensionEntityRepository dimensionJPA;
    DimensionEntityMapper dimensionEntityMapper;
    @Override
    public DimensionEntityDto buscarPorId(Integer id) {
        Optional<DimensionEntity> optional = dimensionJPA.findById(id);
        if (optional.isPresent()) {
            return dimensionEntityMapper.mapper.toDto(optional.get());
        }
        return null;
    }

    @Override
    public int obtenerAreaPorId(int id) {
        Optional<DimensionEntity> optional = dimensionJPA.findById(id);
        if (optional.isPresent()) {
            DimensionEntityDto dimension = dimensionEntityMapper.mapper.toDto(optional.get());
            return dimension.getArea();
        }
        return 0;
    }

    @Override
    public void actualizarDimension(DimensionEntityDto dimension) {
        dimensionJPA.deleteById(dimension.getId());
        DimensionEntity dimensionEntity=dimensionEntityMapper.mapper.toEntity(dimension);
        dimensionJPA.save(dimensionEntity);
    }

    @Override
    public void guardarDimension(DimensionEntityDto dimension) {
        DimensionEntity dimensionEntity=dimensionEntityMapper.mapper.toEntity(dimension);
        dimensionJPA.save(dimensionEntity);
    }

    @Override
    public void eliminarDimension(Integer id) {
        dimensionJPA.deleteById(id);
    }
}

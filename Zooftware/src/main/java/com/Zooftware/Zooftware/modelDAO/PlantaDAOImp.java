package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.PlantaEntityDto;
import com.Zooftware.Zooftware.modelJPA.ClienteEntity;
import com.Zooftware.Zooftware.modelJPA.PlantaEntity;
import com.Zooftware.Zooftware.repository.OrganismoEntityRepository;
import com.Zooftware.Zooftware.repository.PlantaEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class PlantaDAOImp implements IPlantaDAO{
    @Autowired
    PlantaEntityRepository plantaJPA;
    PlantaEntityMapper plantaEntityMapper;
    @Override
    public PlantaEntityDto buscarPorId(Integer id) {
        Optional<PlantaEntity> optional = plantaJPA.findById(id);
        if (optional.isPresent()) {
            return plantaEntityMapper.mapper.toDto(optional.get());
        }
        return null;
    }

    @Override
    public void actualizarPlanta(PlantaEntityDto planta) {
        plantaJPA.deleteById(planta.getId());
        PlantaEntity plantaEntity=plantaEntityMapper.mapper.toEntity(planta);
        plantaJPA.save(plantaEntity);
    }

    @Override
    public void guardarPlanta(PlantaEntityDto planta) {
        PlantaEntity plantaEntity=plantaEntityMapper.mapper.toEntity(planta);
        plantaJPA.save(plantaEntity);
    }

    @Override
    public void eliminarPlanta(Integer id) {
        plantaJPA.deleteById(id);
    }
}

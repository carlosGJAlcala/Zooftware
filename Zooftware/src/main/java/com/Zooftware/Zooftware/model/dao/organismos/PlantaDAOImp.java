package com.Zooftware.Zooftware.model.dao.organismos;

import com.Zooftware.Zooftware.model.dto.organismo.PlantaEntityDto;
import com.Zooftware.Zooftware.model.entities.organimos.PlantaEntity;
import com.Zooftware.Zooftware.model.repository.PlantaEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
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
    public List<PlantaEntityDto> verPlantasPorHabita(int idHabitat){
        List<PlantaEntity> plantaEntities=  plantaJPA.findByHabitat_Id(idHabitat);
        List<PlantaEntityDto> planta = new ArrayList<>();

        for(PlantaEntity pla: plantaEntities){
            PlantaEntityDto plaDto = buscarPorId(pla.getId());
            planta.add(plaDto);
        }
        return planta;
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

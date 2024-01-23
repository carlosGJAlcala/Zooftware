package com.Zooftware.Zooftware.model.dao.instalaciones;

import com.Zooftware.Zooftware.model.dto.instalaciones.HabitatEntityDto;
import com.Zooftware.Zooftware.model.entities.instalaciones.HabitatEntity;
import com.Zooftware.Zooftware.model.repository.HabitatEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class HabitatDAOImp implements IHabitatDAO{
    @Autowired
    HabitatEntityRepository habitatJPA;
    HabitatEntityMapper habitatEntityMapper;

    @Override
    public HabitatEntityDto buscarPorId(Integer id) {
        Optional<HabitatEntity> optional = habitatJPA.findById(id);
        if (optional.isPresent()) {
            return habitatEntityMapper.mapper.toDto(optional.get());
        }
        return null;
    }

    @Override
    public void actualizarHabitat(HabitatEntityDto habitat) {
        habitatJPA.deleteById(habitat.getId());
        HabitatEntity habitatEntity=habitatEntityMapper.mapper.toEntity(habitat);
        habitatJPA.save(habitatEntity);
    }

    @Override
    public void guardarHabitat(HabitatEntityDto habitat) {
        HabitatEntity habitatEntity=habitatEntityMapper.mapper.toEntity(habitat);
        habitatJPA.save(habitatEntity);
    }

    @Override
    public List<HabitatEntityDto> buscarTodos() {
        List<HabitatEntity> habitats = habitatJPA.findAll();
        List<HabitatEntityDto> habitatsDTO = new ArrayList<>();

        for (HabitatEntity habitat : habitats) {
            HabitatEntityDto animalDto = buscarPorId(habitat.getId());
            habitatsDTO.add(animalDto);
        }
        return habitatsDTO;
    }

    @Override
    public void eliminarHabitat(Integer id) {
        habitatJPA.deleteById(id);
    }
}

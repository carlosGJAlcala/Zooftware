package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.HabitatEntityDto;
import com.Zooftware.Zooftware.modelJPA.ClienteEntity;
import com.Zooftware.Zooftware.modelJPA.HabitatEntity;
import com.Zooftware.Zooftware.repository.ContactoEntityRepository;
import com.Zooftware.Zooftware.repository.HabitatEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
    public void eliminarHabitat(Integer id) {
        habitatJPA.deleteById(id);
    }
}

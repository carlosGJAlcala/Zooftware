package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.TareaEntityDto;
import com.Zooftware.Zooftware.modelJPA.ClienteEntity;
import com.Zooftware.Zooftware.modelJPA.TareaEntity;
import com.Zooftware.Zooftware.repository.OrganismoEntityRepository;
import com.Zooftware.Zooftware.repository.TareaEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class TareaDAOImp implements ITareaDAO{
    @Autowired
    TareaEntityRepository tareaJPA;
    TareaEntityMapper tareaEntityMapper;
    @Override
    public TareaEntityDto buscarPorId(Integer id) {
        Optional<TareaEntity> optional = tareaJPA.findById(id);
        if (optional.isPresent()) {
            return tareaEntityMapper.mapper.toDto(optional.get());
        }
        return null;
    }

    @Override
    public void actualizarTarea(TareaEntityDto tarea) {
        tareaJPA.deleteById(tarea.getId());
        TareaEntity tareaEntity=tareaEntityMapper.mapper.toEntity(tarea);
        tareaJPA.save(tareaEntity);
    }

    @Override
    public void guardarTarea(TareaEntityDto tarea) {
        TareaEntity tareaEntity=tareaEntityMapper.mapper.toEntity(tarea);
        tareaJPA.save(tareaEntity);
    }

    @Override
    public void eliminarTarea(Integer id) {
        tareaJPA.deleteById(id);
    }
}

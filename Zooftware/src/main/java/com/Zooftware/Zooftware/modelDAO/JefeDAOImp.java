package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.JefeEntityDto;
import com.Zooftware.Zooftware.modelJPA.EmpleadoEntity;
import com.Zooftware.Zooftware.modelJPA.JefeEntity;
import com.Zooftware.Zooftware.repository.EmpleadoEntityRepository;
import com.Zooftware.Zooftware.repository.JefeEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class JefeDAOImp implements IJefeDAO{

    @Autowired
    JefeEntityRepository jefeJPA;
    JefeEntityMapper jefeEntityMapper;

    @Override
    public JefeEntityDto buscarPorId(Integer id) {
        Optional<JefeEntity> optional = jefeJPA.findById(id);
        if (optional.isPresent()) {
            return jefeEntityMapper.mapper.toDto(optional.get());
        }
        return null;
    }

    @Override
    public void actualizarJefe(JefeEntityDto jefe) {
        jefeJPA.deleteById(jefe.getId());
        JefeEntity jefeEntity=jefeEntityMapper.mapper.toEntity(jefe);
        jefeJPA.save(jefeEntity);
    }

    @Override
    public void guardarJefe(JefeEntityDto jefe) {
        JefeEntity jefeEntity=jefeEntityMapper.mapper.toEntity(jefe);
        jefeJPA.save(jefeEntity);
    }

    @Override
    public void eliminarJefe(Integer id) {
        jefeJPA.deleteById(id);
    }
}

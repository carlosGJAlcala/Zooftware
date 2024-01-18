package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.SueloImplEntityDto;
import com.Zooftware.Zooftware.modelJPA.ClienteEntity;
import com.Zooftware.Zooftware.modelJPA.SueloImplEntity;
import com.Zooftware.Zooftware.repository.OrganismoEntityRepository;
import com.Zooftware.Zooftware.repository.SueloImplEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class SueloDAOImp implements ISueloDAO{
    @Autowired
    SueloImplEntityRepository sueloJPA;
    SueloImplEntityMapper sueloEntityMapper;
    @Override
    public SueloImplEntityDto buscarPorId(Integer id) {
        Optional<SueloImplEntity> optional = sueloJPA.findById(id);
        if (optional.isPresent()) {
            return sueloEntityMapper.mapper.toDto(optional.get());
        }
        return null;
    }

    @Override
    public void actualizarSuelo(SueloImplEntityDto suelo) {
        sueloJPA.deleteById(suelo.getId());
        SueloImplEntity sueloImplEntity=sueloEntityMapper.mapper.toEntity(suelo);
        sueloJPA.save(sueloImplEntity);
    }

    @Override
    public void guardarSuelo(SueloImplEntityDto suelo) {
        SueloImplEntity sueloImplEntity=sueloEntityMapper.mapper.toEntity(suelo);
        sueloJPA.save(sueloImplEntity);
    }

    @Override
    public void eliminarSuelo(Integer id) {
        sueloJPA.deleteById(id);
    }
}

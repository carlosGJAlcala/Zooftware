package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ComidaOmnivoraEntityDto;
import com.Zooftware.Zooftware.modelJPA.ComidaOmnivoraEntity;
import com.Zooftware.Zooftware.modelJPA.DimensionAnimalEntity;
import com.Zooftware.Zooftware.repository.ComidaOmnivoraEntityRepository;
import com.Zooftware.Zooftware.repository.DimensionAnimalEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ComidaOmnivoraDAOImp implements IComidaOmnivoraDAO{
    @Autowired
    ComidaOmnivoraEntityRepository comidaOmnivoraJPA;
    ComidaOmnivoraEntityMapper comidaOmnivoraEntityMapper;
    @Override
    public ComidaOmnivoraEntityDto buscarPorId(Integer id) {
        Optional<ComidaOmnivoraEntity> optional = comidaOmnivoraJPA.findById(id);
        if (optional.isPresent()) {
            return comidaOmnivoraEntityMapper.mapper.toDto(optional.get());
        }
        return null;
    }

    @Override
    public void actualizarComida(ComidaOmnivoraEntityDto comida) {
        comidaOmnivoraJPA.deleteById(comida.getId());
       ComidaOmnivoraEntity comidaOmnivora=comidaOmnivoraEntityMapper.mapper.toEntity(comida);
        comidaOmnivoraJPA.save(comidaOmnivora);
    }

    @Override
    public void guardarComida(ComidaOmnivoraEntityDto comida) {
        ComidaOmnivoraEntity comidaOmnivora=comidaOmnivoraEntityMapper.mapper.toEntity(comida);
        comidaOmnivoraJPA.save(comidaOmnivora);
    }

    @Override
    public void eliminarComida(Integer id) {
        comidaOmnivoraJPA.deleteById(id);
    }
}

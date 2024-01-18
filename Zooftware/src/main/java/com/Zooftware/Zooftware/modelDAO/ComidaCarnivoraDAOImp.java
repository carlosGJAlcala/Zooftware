package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ComidaCarnivoraEntityDto;
import com.Zooftware.Zooftware.modelJPA.ComidaCarnivoraEntity;
import com.Zooftware.Zooftware.modelJPA.ComidaHerviboraEntity;
import com.Zooftware.Zooftware.modelJPA.DimensionAnimalEntity;
import com.Zooftware.Zooftware.repository.ComidaCarnivoraEntityRepository;
import com.Zooftware.Zooftware.repository.DimensionAnimalEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ComidaCarnivoraDAOImp implements IComidaCarnivoraDAO{
    @Autowired
    ComidaCarnivoraEntityRepository comidaCarnivoraJPA;
    ComidaCarnivoraEntityMapper comidaCarnivoraEntityMapper;
    @Override
    public ComidaCarnivoraEntityDto buscarPorId(Integer id) {
        Optional<ComidaCarnivoraEntity> optional = comidaCarnivoraJPA.findById(id);
        if (optional.isPresent()) {
            return comidaCarnivoraEntityMapper.mapper.toDto(optional.get());
        }
        return null;
    }

    @Override
    public void actualizarComidaCarnivora(ComidaCarnivoraEntityDto comida) {
        comidaCarnivoraJPA.deleteById(comida.getId());
        ComidaCarnivoraEntity comidaCarnivoraEntity=comidaCarnivoraEntityMapper.mapper.toEntity(comida);
        comidaCarnivoraJPA.save(comidaCarnivoraEntity);
    }

    @Override
    public void guardarComidaCarnivora(ComidaCarnivoraEntityDto comida) {
        ComidaCarnivoraEntity comidaCarnivoraEntity=ComidaCarnivoraEntityMapper.mapper.toEntity(comida);
        comidaCarnivoraJPA.save(comidaCarnivoraEntity);
    }

    @Override
    public void eliminarComidaCarnivora(Integer id) {
        comidaCarnivoraJPA.deleteById(id);
    }
}

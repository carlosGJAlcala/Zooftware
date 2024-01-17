package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ComidaHerviboraEntityDto;
import com.Zooftware.Zooftware.modelJPA.ComidaHerviboraEntity;
import com.Zooftware.Zooftware.modelJPA.DimensionAnimalEntity;
import com.Zooftware.Zooftware.repository.ComidaHerviboraEntityRepository;
import com.Zooftware.Zooftware.repository.DimensionAnimalEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ComidaHerviboraDAOImp implements IComidaHerviboraDAO{
    @Autowired
    ComidaHerviboraEntityRepository comidaHerviboraJPA;
    ComidaHerviboraEntityMapper comidaHerviboraEntityMapper;
    @Override
    public ComidaHerviboraEntityDto buscarPorId(Integer id) {
        Optional<ComidaHerviboraEntity> optional = comidaHerviboraJPA.findById(id);
        if (optional.isPresent()) {
            return comidaHerviboraEntityMapper.mapper.toDto(optional.get());
        }
        return null;
    }

    @Override
    public void actualizarComidaHervibora(ComidaHerviboraEntityDto comida) {
        comidaHerviboraJPA.deleteById(comida.getId());
        ComidaHerviboraEntity comidaCarnivoraEntity=comidaHerviboraEntityMapper.mapper.toEntity(comida);
        comidaHerviboraJPA.save(comidaCarnivoraEntity);
    }

    @Override
    public void guardarComidaHervibora(ComidaHerviboraEntityDto comida) {
        ComidaHerviboraEntity comidaCarnivoraEntity=comidaHerviboraEntityMapper.mapper.toEntity(comida);
        comidaHerviboraJPA.save(comidaCarnivoraEntity);
    }

    @Override
    public void eliminarComidaHervibora(Integer id) {
        comidaHerviboraJPA.deleteById(id);
    }
}

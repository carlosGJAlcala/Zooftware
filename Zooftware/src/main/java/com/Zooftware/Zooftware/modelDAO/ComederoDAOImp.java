package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ClienteEntityDto;
import com.Zooftware.Zooftware.modelDTO.ComederoEntityDto;
import com.Zooftware.Zooftware.modelJPA.ClienteEntity;
import com.Zooftware.Zooftware.modelJPA.ComederoEntity;
import com.Zooftware.Zooftware.repository.ClienteEntityRepository;
import com.Zooftware.Zooftware.repository.ComederoEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ComederoDAOImp implements IComederoDAO{
    @Autowired
    ComederoEntityRepository comederoJPA;
    ComederoEntityMapper comederoEntityMapper;

    @Override
    public ComederoEntityDto buscarPorId(Integer id) {
        Optional<ComederoEntity> optional = comederoJPA.findById(id);
        if (optional.isPresent()) {
            return comederoEntityMapper.mapper.toDto(optional.get());
        }
        return null;
    }

    @Override
    public void actualizarComedero(ComederoEntityDto comedero) {
        comederoJPA.deleteById(comedero.getId());
        ComederoEntity clienteEntity=comederoEntityMapper.mapper.toEntity(comedero);
        comederoJPA.save(clienteEntity);
    }

    @Override
    public void guardarComedero(ComederoEntityDto comedero) {
        ComederoEntity comederoEntity=comederoEntityMapper.mapper.toEntity(comedero);
        comederoJPA.save(comederoEntity);
    }

    @Override
    public void eliminarComedero(Integer id) {
        comederoJPA.deleteById(id);
    }
}

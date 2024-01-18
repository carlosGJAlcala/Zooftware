package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.BebederoEntityDto;
import com.Zooftware.Zooftware.modelDTO.ClienteEntityDto;
import com.Zooftware.Zooftware.modelJPA.BebederoEntity;
import com.Zooftware.Zooftware.modelJPA.ClienteEntity;
import com.Zooftware.Zooftware.repository.BebederoEntityRepository;
import com.Zooftware.Zooftware.repository.ClienteEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class BebederoDAOImp implements IBebederoDAO{
    @Autowired
    BebederoEntityRepository bebederoJPA;
    BebederoEntityMapper bebederoEntityMapper;
    @Override
    public BebederoEntityDto buscarPorId(Integer id) {
        Optional<BebederoEntity> optional = bebederoJPA.findById(id);
        if (optional.isPresent()) {
            return bebederoEntityMapper.mapper.toDto(optional.get());
        }
        return null;
    }

    @Override
    public void actualizarBebedero(BebederoEntityDto bebedero) {
        bebederoJPA.deleteById(bebedero.getId());
        BebederoEntity bebederoEntity=bebederoEntityMapper.mapper.toEntity(bebedero);
        bebederoJPA.save(bebederoEntity);
    }

    @Override
    public void guardarBebedero(BebederoEntityDto bebedero) {
        BebederoEntity bebederoEntity=bebederoEntityMapper.mapper.toEntity(bebedero);
        bebederoJPA.save(bebederoEntity);
    }

    @Override
    public void eliminarBebedero(Integer id) {
        bebederoJPA.deleteById(id);
    }
}

package com.Zooftware.Zooftware.model.dao.comida;

import com.Zooftware.Zooftware.model.dto.comida.BebederoEntityDto;
import com.Zooftware.Zooftware.model.entities.instalaciones.BebederoEntity;
import com.Zooftware.Zooftware.model.repository.BebederoEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class BebederoDAOImp implements IBebederoDAO {
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
        BebederoEntity bebederoEntity = bebederoEntityMapper.mapper.toEntity(bebedero);
        bebederoJPA.save(bebederoEntity);
    }

    @Override
    public void guardarBebedero(BebederoEntityDto bebedero) {
        BebederoEntity bebederoEntity = bebederoEntityMapper.mapper.toEntity(bebedero);
        bebederoJPA.save(bebederoEntity);
    }

    @Override
    public void eliminarBebedero(Integer id) {
        bebederoJPA.deleteById(id);
    }

    @Override
    public List<BebederoEntityDto> verBebederos(int habita_id) {

        List<BebederoEntity> bebederoEntities=  bebederoJPA.findByHabitat_Id(habita_id);
        List<BebederoEntityDto> bebederoEntityDtos = new ArrayList<>();

        for(BebederoEntity bebedero: bebederoEntities){
            BebederoEntityDto bebederoDTO = buscarPorId(bebedero.getId());
            bebederoEntityDtos.add(bebederoDTO);
        }
        return bebederoEntityDtos;
    }
}

package com.Zooftware.Zooftware.model.dao.comida;

import com.Zooftware.Zooftware.model.dto.comida.ComederoEntityDto;
import com.Zooftware.Zooftware.model.entities.instalaciones.ComederoEntity;
import com.Zooftware.Zooftware.model.repository.ComederoEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ComederoDAOImp implements IComederoDAO {
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
      //  this.eliminarComedero(comedero.getId());
        this.guardarComedero(comedero);

    }

    @Override
    public void guardarComedero(ComederoEntityDto comedero) {
        ComederoEntity comederoEntity = comederoEntityMapper.mapper.toEntity(comedero);
        comederoJPA.save(comederoEntity);
    }

    @Override
    public void eliminarComedero(Integer id) {
        comederoJPA.deleteById(id);
    }

    @Override
    public List<ComederoEntityDto> verComederos(int habita_id) {

        List<ComederoEntity> comederoEntities=  comederoJPA.findByHabitat_Id(habita_id);
        List<ComederoEntityDto> comederoEntitiesDtos = new ArrayList<>();

        for(ComederoEntity comedero: comederoEntities){
            ComederoEntityDto animalDto = buscarPorId(comedero.getId());
            comederoEntitiesDtos.add(animalDto);
        }
        return comederoEntitiesDtos;



    }
}

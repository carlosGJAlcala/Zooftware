package com.Zooftware.Zooftware.model.dao.instalaciones;

import com.Zooftware.Zooftware.model.dto.instalaciones.TerrestreEntityDto;
import com.Zooftware.Zooftware.model.entities.instalaciones.TerrestreEntity;
import com.Zooftware.Zooftware.model.repository.TerrestreEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public class TerrestreDAOImp implements ITerrestreDAO{
    @Autowired
    TerrestreEntityRepository terrestreJPA;
    TerrestreEntityMapper terrestreEntityMapper;
    @Override
    public TerrestreEntityDto buscarPorId(Integer id) {
        Optional<TerrestreEntity> optional = terrestreJPA.findById(id);
        if (optional.isPresent()) {
            return terrestreEntityMapper.mapper.toDto(optional.get());
        }
        return null;
    }

    @Override
    public void actualizarTerrestre(TerrestreEntityDto terrestre) {
        terrestreJPA.deleteById(terrestre.getId());
        TerrestreEntity terrestreEntity=terrestreEntityMapper.mapper.toEntity(terrestre);
        terrestreJPA.save(terrestreEntity);
    }

    @Override
    public TerrestreEntity guardarTerrestre(TerrestreEntityDto terrestre) {
        TerrestreEntity terrestreEntity=terrestreEntityMapper.mapper.toEntity(terrestre);
        return terrestreJPA.save(terrestreEntity);
    }

    @Override
    public void eliminarTerrestre(Integer id) {
        terrestreJPA.deleteById(id);
    }
}

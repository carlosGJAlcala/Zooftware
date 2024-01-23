package com.Zooftware.Zooftware.model.dao.instalaciones;


import com.Zooftware.Zooftware.model.dto.instalaciones.AnfibioEntityDto;
import com.Zooftware.Zooftware.model.entities.instalaciones.AnfibioEntity;
import com.Zooftware.Zooftware.model.repository.AnfibioEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class AnfibioDAOImpl implements IAnfibioDAO {



    @Autowired
    AnfibioEntityRepository repository;
    @Override
    public AnfibioEntityDto encontrarPorId(Integer id) {

        Optional<AnfibioEntity> optional = repository.findById(id);
        if (optional.isPresent()) {
            AnfibioEntityDto anfibio= AnfibioEntityMapper.mapper.toDto((optional.get()));
            return anfibio;
        }

        return null;
    }

    @Override
    public void actualizar(AnfibioEntityDto anfibio) {
        repository.deleteById(anfibio.getId());
        AnfibioEntity anfibioEntity=AnfibioEntityMapper.mapper.toEntity(anfibio);
        repository.save(anfibioEntity);
    }

    @Override
    public AnfibioEntity guardar(AnfibioEntityDto anfibio) {
        //guardamos habitat anfibio

        AnfibioEntity anfibioEntity=AnfibioEntityMapper.mapper.toEntity(anfibio);
        return repository.save(anfibioEntity);

    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);

    }
}

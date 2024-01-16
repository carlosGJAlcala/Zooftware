package com.Zooftware.Zooftware.modelDAO;


import com.Zooftware.Zooftware.modelDTO.AlmacenComidaEntityDto;
import com.Zooftware.Zooftware.modelDTO.AnfibioEntityDto;
import com.Zooftware.Zooftware.modelJPA.AlmacenComidaEntity;
import com.Zooftware.Zooftware.modelJPA.AnfibioEntity;
import com.Zooftware.Zooftware.repository.AnfibioEntityRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class AnfibioDAOImpl implements IAnfibioDAO {

    private AnfibioEntityMapper mapper= Mappers.getMapper(AnfibioEntityMapper.class);

    @Autowired
    AnfibioEntityRepository repository;
    @Override
    public AnfibioEntityDto encontrarPorId(Integer id) {

        Optional<AnfibioEntity> optional = repository.findById(id);
        if (optional.isPresent()) {
            AnfibioEntityDto anfibio= mapper.toDto((optional.get()));
            return anfibio;
        }

        return null;
    }
}

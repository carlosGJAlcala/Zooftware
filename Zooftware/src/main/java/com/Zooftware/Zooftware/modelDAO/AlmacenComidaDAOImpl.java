package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AcuaticoEntityDto;
import com.Zooftware.Zooftware.modelDTO.AlmacenComidaEntityDto;
import com.Zooftware.Zooftware.modelJPA.AcuaticoEntity;
import com.Zooftware.Zooftware.modelJPA.AlmacenComidaEntity;
import com.Zooftware.Zooftware.repository.AlmacenComidaEntityRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class AlmacenComidaDAOImpl implements IAlmacenComidaDAO{

    @Autowired
    AlmacenComidaEntityRepository repository;
    private AlmacenComidaEntityMapper mapper= Mappers.getMapper(AlmacenComidaEntityMapper.class);

    @Override
    public AlmacenComidaEntityDto encontrarPorId(Integer id) {

        Optional<AlmacenComidaEntity> optional = repository.findById(id);
        if (optional.isPresent()) {
            AlmacenComidaEntityDto almacenDTO= mapper.toDto((optional.get()));
            return almacenDTO;
        }


        return null;
    }
}

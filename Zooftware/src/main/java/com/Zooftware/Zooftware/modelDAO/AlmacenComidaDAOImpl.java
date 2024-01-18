package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AcuaticoEntityDto;
import com.Zooftware.Zooftware.modelDTO.AlmacenComidaEntityDto;
import com.Zooftware.Zooftware.modelJPA.AcuaticoEntity;
import com.Zooftware.Zooftware.modelJPA.AlmacenComidaEntity;
import com.Zooftware.Zooftware.repository.AlmacenComidaEntityRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class AlmacenComidaDAOImpl implements IAlmacenComidaDAO{

    @Autowired
    AlmacenComidaEntityRepository repository;
    @Autowired
    private AlmacenComidaEntityMapper almacenComidaEntityMapper;


    @Override
    public AlmacenComidaEntityDto encontrarPorId(Integer id) {

        Optional<AlmacenComidaEntity> optional = repository.findById(id);
        if (optional.isPresent()) {
            AlmacenComidaEntityDto almacenDTO= AlmacenComidaEntityMapper.INSTANCE.toDto((optional.get()));
            return almacenDTO;
        }


        return null;
    }

    @Override
    public List<AlmacenComidaEntityDto> buscarAlmacenes() {
        List<AlmacenComidaEntity>optional = repository.encontrarAlmacenes();


        return optional.stream().map(almacenComidaEntityMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public void actualizar(AlmacenComidaEntityDto acuario) {

    }

    @Override
    public void guardar(AlmacenComidaEntityDto acuario) {

    }

    @Override
    public void eliminar(AlmacenComidaEntityDto id) {

    }
}

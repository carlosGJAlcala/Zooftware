package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AlmacenComidaEntityDto;
import com.Zooftware.Zooftware.modelJPA.instalaciones.AlmacenComidaEntity;
import com.Zooftware.Zooftware.repository.AlmacenComidaEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class AlmacenComidaDAOImpl implements IAlmacenComidaDAO{

    @Autowired
    AlmacenComidaEntityRepository repository;

    AlmacenComidaEntityMapper almacenComidaEntityMapper;


    @Override
    public AlmacenComidaEntityDto encontrarPorId(Integer id) {

        Optional<AlmacenComidaEntity> optional = repository.findById(id);
        if (optional.isPresent()) {
            AlmacenComidaEntityDto almacenDTO= AlmacenComidaEntityMapper.mapper.toDto((optional.get()));
            return almacenDTO;
        }


        return null;
    }

    @Override
    public List<AlmacenComidaEntityDto> buscarAlmacenes() {
        List<AlmacenComidaEntity>optional = repository.findAll();
        return optional.stream().map(almacenComidaEntityMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public void actualizar(AlmacenComidaEntityDto almacen) {
        repository.deleteById(almacen.getId());
        AlmacenComidaEntity almacenComidaEntity=almacenComidaEntityMapper.mapper.toEntity(almacen);
        repository.save(almacenComidaEntity);
    }

    @Override
    public void guardar(AlmacenComidaEntityDto almacen) {
        AlmacenComidaEntity almacenComidaEntity=almacenComidaEntityMapper.mapper.toEntity(almacen);
        repository.save(almacenComidaEntity);
    }

    @Override
    public void eliminar(int id) {
        repository.deleteById(id);
    }
}

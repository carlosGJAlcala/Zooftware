package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.TrabajadorEntityDto;
import com.Zooftware.Zooftware.modelJPA.persona.TrabajadorEntity;
import com.Zooftware.Zooftware.repository.TrabajadorEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TrabajadorDAOImp implements ITrabajadorDAO{
    @Autowired
    TrabajadorEntityRepository trabajadorjpa;
    TrabajadorEntityMapper trabajadorEntityMapper;

    @Override
    public TrabajadorEntityDto buscarPorId(Integer id) {

        Optional<TrabajadorEntity> optional = trabajadorjpa.findById(id);
        if (optional.isPresent()) {
            return trabajadorEntityMapper.mapper.toDtoEmpleado(optional.get());
        }
        return null;
    }

    @Override
    public List<TrabajadorEntityDto> buscarActivos() {
        List<TrabajadorEntity> listTrabajadoresActivos = trabajadorjpa.findByActivoTrue();
        return listTrabajadoresActivos.stream().map(trabajadorEntityMapper.mapper::toDtoEmpleado).collect(Collectors.toList());
    }

    @Override
    public void actualizarTrabajador(TrabajadorEntityDto trabajador) {
        trabajadorjpa.deleteById(trabajador.getId());
        TrabajadorEntity trabajadorEntity=trabajadorEntityMapper.mapper.toEntity(trabajador);
        trabajadorjpa.save(trabajadorEntity);
    }

    @Override
    public void guardarTrabajador(TrabajadorEntityDto trabajador) {
        TrabajadorEntity trabajadorEntity=trabajadorEntityMapper.mapper.toEntity(trabajador);
        trabajadorjpa.save(trabajadorEntity);
    }

    @Override
    public void eliminarTrabajador(Integer id) {
        trabajadorjpa.deleteById(id);
    }
}

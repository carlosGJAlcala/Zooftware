package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.TrabajadorEntityDto;
import com.Zooftware.Zooftware.modelJPA.AcuaticoEntity;
import com.Zooftware.Zooftware.modelJPA.PersonaEntity;
import com.Zooftware.Zooftware.modelJPA.TrabajadorEntity;
import com.Zooftware.Zooftware.repository.PersonaEntityRepository;
import com.Zooftware.Zooftware.repository.TrabajadorEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Repository
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

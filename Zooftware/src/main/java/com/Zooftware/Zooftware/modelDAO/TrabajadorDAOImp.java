package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.EmpleadoEntityDto;
import com.Zooftware.Zooftware.modelDTO.TrabajadorEntityDto;
import com.Zooftware.Zooftware.modelJPA.persona.EmpleadoEntity;
import com.Zooftware.Zooftware.modelJPA.persona.TrabajadorEntity;
import com.Zooftware.Zooftware.repository.EmpleadoEntityRepository;
import com.Zooftware.Zooftware.repository.TrabajadorEntityRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Repository
public class TrabajadorDAOImp implements ITrabajadorDAO{
//    EmpleadoEntityMapper mapper = Mappers.getMapper(EmpleadoEntityMapper.class);
//    @Autowired
//    TrabajadorEntityRepository trabajadorjpa;
//    @Autowired
//    EmpleadoEntityRepository empleadoEntityRepository;
//
//    TrabajadorEntityMapper trabajadorEntityMapper;

    @Override
    public TrabajadorEntityDto buscarPorId(Integer id) {

//        Optional<TrabajadorEntity> optional = trabajadorjpa.findById(id);
//        if (optional.isPresent()) {
//            return trabajadorEntityMapper.mapper.toDto(optional.get());
//        }
        return null;
    }

    @Override
    public List<TrabajadorEntityDto> buscarActivos() {
//        List<EmpleadoEntity> listTrabajadoresActivos = empleadoEntityRepository.findById(0);
//        return listTrabajadoresActivos.stream().map(trabajadorEntityMapper.mapper::toDto).collect(Collectors.toList());
        return new ArrayList<>();
    }

    @Override
    public void actualizarTrabajador(TrabajadorEntityDto trabajador) {
//        trabajadorjpa.deleteById(trabajador.getId());
//        TrabajadorEntity trabajadorEntity=trabajadorEntityMapper.mapper.toEntity(trabajador);
//        trabajadorjpa.save(trabajadorEntity);
    }

    @Override
    public void guardarTrabajador(TrabajadorEntityDto trabajador) {
//        TrabajadorEntity trabajadorEntity=trabajadorEntityMapper.mapper.toEntity(trabajador);
//        trabajadorjpa.save(trabajadorEntity);
    }

    @Override
    public void eliminarTrabajador(Integer id) {
//        trabajadorjpa.deleteById(id);
    }
}

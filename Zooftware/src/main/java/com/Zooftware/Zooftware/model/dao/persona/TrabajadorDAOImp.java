package com.Zooftware.Zooftware.model.dao.persona;

import com.Zooftware.Zooftware.model.dto.persona.TrabajadorEntityDto;
import com.Zooftware.Zooftware.model.entities.persona.TrabajadorEntity;
import com.Zooftware.Zooftware.model.repository.TrabajadorEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class TrabajadorDAOImp implements ITrabajadorDAO {
//    EmpleadoEntityMapper mapper = Mappers.getMapper(EmpleadoEntityMapper.class);
    @Autowired
    TrabajadorEntityRepository trabajadorjpa;
//    @Autowired
//    EmpleadoEntityRepository empleadoEntityRepository;
//
//    TrabajadorEntityMapper trabajadorEntityMapper;

    @Override
    public TrabajadorEntity buscarPorId(Integer id) {

       Optional<TrabajadorEntity> optional = trabajadorjpa.findById(id);
       if (optional.isPresent()) {
            return optional.get();
        }
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

    @Override
    public List<TrabajadorEntity> buscarPorJefe(int id_jefe) {
        List<TrabajadorEntity> tr= trabajadorjpa.findByJefe_Id(id_jefe);
        tr.isEmpty();
        return tr;
    }
}

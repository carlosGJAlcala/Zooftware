package com.Zooftware.Zooftware.model.dao.persona;

import com.Zooftware.Zooftware.model.dto.persona.EmpleadoEntityDto;
import com.Zooftware.Zooftware.model.entities.persona.EmpleadoEntity;
import com.Zooftware.Zooftware.model.repository.EmpleadoEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public class EmpleadoDAOImp implements IEmpleadoDAO{

    @Autowired
    EmpleadoEntityRepository empleadoJPA;
    EmpleadoEntityMapper empleadoEntityMapper;


    @Override
    public EmpleadoEntityDto buscarPorId(Integer id) {
        Optional<EmpleadoEntity> optional = empleadoJPA.findById(id);
        if (optional.isPresent()) {
            return empleadoEntityMapper.mapper.toDto(optional.get());
        }
        return null;
    }


    @Override
    public void prueba(){

    }
    @Override
    public EmpleadoEntityDto getEmpleadoByUsername(String username) {
        EmpleadoEntity empleadoEntity = empleadoJPA.findByUsername(username);
        return empleadoEntityMapper.mapper.toDto(empleadoEntity);
    }

    @Override
    public void actualizarEmpleado(EmpleadoEntityDto empleado) {
        empleadoJPA.deleteById(empleado.getId());
        EmpleadoEntity empleadoEntity=empleadoEntityMapper.mapper.toEntity(empleado);
        empleadoJPA.save(empleadoEntity);
    }

    @Override
    public void guardarEmpleado(EmpleadoEntityDto empleado) {
        EmpleadoEntity trabajadorEntity=empleadoEntityMapper.mapper.toEntity(empleado);
        empleadoJPA.save(trabajadorEntity);
    }

    @Override
    public void eliminarEmpleado(Integer id) {
        empleadoJPA.deleteById(id);
    }
}

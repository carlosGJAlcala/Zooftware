package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.EmpleadoEntityDto;
import com.Zooftware.Zooftware.modelJPA.EmpleadoEntity;
import com.Zooftware.Zooftware.modelJPA.TrabajadorEntity;
import com.Zooftware.Zooftware.repository.EmpleadoEntityRepository;
import com.Zooftware.Zooftware.repository.TrabajadorEntityRepository;
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

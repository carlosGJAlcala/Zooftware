package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.EmpleadoEntityDto;
import com.Zooftware.Zooftware.modelDTO.JefeEntityDto;
import com.Zooftware.Zooftware.modelDTO.TrabajadorEntityDto;

import java.util.List;

public interface IEmpleadoDAO {
    public EmpleadoEntityDto buscarPorId(Integer id);

    void prueba();

    public EmpleadoEntityDto getEmpleadoByUsername(String username);
    void actualizarEmpleado(EmpleadoEntityDto empleado);
    void guardarEmpleado(EmpleadoEntityDto empleado);
    public void eliminarEmpleado(Integer id);

}

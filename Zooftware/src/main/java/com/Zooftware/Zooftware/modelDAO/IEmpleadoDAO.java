package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.EmpleadoEntityDto;
import com.Zooftware.Zooftware.modelDTO.TrabajadorEntityDto;

import java.util.List;

public interface IEmpleadoDAO {
    public EmpleadoEntityDto buscarPorId(Integer id);
    void actualizarEmpleado(EmpleadoEntityDto empleado);
    void guardarEmpleado(EmpleadoEntityDto empleado);
    public void eliminarEmpleado(Integer id);

}

package com.Zooftware.Zooftware.model.dao.persona;

import com.Zooftware.Zooftware.model.dto.persona.EmpleadoEntityDto;

public interface IEmpleadoDAO {
    public EmpleadoEntityDto buscarPorId(Integer id);

    void prueba();

    public EmpleadoEntityDto getEmpleadoByUsername(String username);
    void actualizarEmpleado(EmpleadoEntityDto empleado);
    void guardarEmpleado(EmpleadoEntityDto empleado);
    public void eliminarEmpleado(Integer id);

}

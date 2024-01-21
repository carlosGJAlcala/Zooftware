package com.Zooftware.Zooftware.patrones.adapter;

import com.Zooftware.Zooftware.modelDTO.*;
import com.Zooftware.Zooftware.modelJPA.enums.Rol;

import java.util.Date;
import java.util.List;

public class EmpleadoJSONToDTO extends EmpleadoEntityDto {

    int contactoId;
    int jefe_id;

    ContactoEntityDto contactoEntityDto;

    public EmpleadoJSONToDTO(EmpleadoJson empleado) {
        super(empleado.id, empleado.apellidos, empleado.dni, empleado.edad, empleado.nombre, empleado.password, Rol.EMPLEADO, empleado.username, null, null, null, true, new Date(), new Date(), empleado.numeroSeguridadSocial, null, null, empleado.salario);
        contactoEntityDto=new ContactoEntityDto(1,empleado.correo,empleado.numeroTlf);
        contactoId=empleado.id;
        jefe_id=empleado.jefe_id;

    }

    public EmpleadoJSONToDTO(int id, String apellidos, String dni, int edad, String nombre, String password, Rol rol, String username, ClienteEntityDto clienteZooId, ContactoEntityDto contactoId, TrabajadorEntityDto trabajadorId, boolean activo, Date fechaFinContrato, Date fechaInicioContrato, long numeroSeguridadSocial, JefeEntityDto jefeEntityDto, List<MensajeEntityDto> mensajes, double salario) {
        super(id, apellidos, dni, edad, nombre, password, rol, username, clienteZooId, contactoId, trabajadorId, activo, fechaFinContrato, fechaInicioContrato, numeroSeguridadSocial, jefeEntityDto, mensajes, salario);
    }

    public int getContactoId() {
        return contactoId;
    }

    public int getJefe_id() {
        return jefe_id;
    }

    @Override
    public ContactoEntityDto getContactoEntityDto() {
        return contactoEntityDto;
    }
}

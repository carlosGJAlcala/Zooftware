package com.Zooftware.Zooftware.patrones.adapter;

import com.Zooftware.Zooftware.modelDTO.*;
import com.Zooftware.Zooftware.modelJPA.enums.Rol;

import java.util.Date;
import java.util.List;

public class EmpleadoJSONToDTO extends EmpleadoEntityDto {

    int contactoId;
    String jefeUsername;


    public EmpleadoJSONToDTO(EmpleadoJson empleado) {
        super(empleado.apellidos, empleado.dni, empleado.edad, empleado.nombre, empleado.password, Rol.EMPLEADO, empleado.username, null, null, null, true, new Date(), new Date(), empleado.numeroSeguridadSocial, null, null, empleado.salario);

        jefeUsername=empleado.getUsernameJefe();

    }

    public EmpleadoJSONToDTO( String apellidos, String dni, int edad, String nombre, String password, Rol rol, String username, ClienteEntityDto clienteZooId, ContactoEntityDto contactoId, TrabajadorEntityDto trabajadorId, boolean activo, Date fechaFinContrato, Date fechaInicioContrato, long numeroSeguridadSocial, JefeEntityDto jefeEntityDto, List<MensajeEntityDto> mensajes, double salario) {
        super( apellidos, dni, edad, nombre, password, rol, username, clienteZooId, contactoId, trabajadorId, activo, fechaFinContrato, fechaInicioContrato, numeroSeguridadSocial, jefeEntityDto, mensajes, salario);
    }

    public int getContactoId() {
        return contactoId;
    }

    public String getJefeUsername() {
        return jefeUsername;
    }


}

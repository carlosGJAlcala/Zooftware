package com.Zooftware.Zooftware.model.dto.persona;

import com.Zooftware.Zooftware.model.dto.mensajeria.MensajeEntityDto;
import com.Zooftware.Zooftware.model.entities.enums.Rol;
import com.Zooftware.Zooftware.model.entities.persona.EmpleadoEntity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * DTO for {@link EmpleadoEntity}
 */
public class EmpleadoEntityDto extends TrabajadorEntityDto implements Serializable {
    public EmpleadoEntityDto(String apellidos, String dni, int edad, String nombre, String password, Rol rol, String username, ClienteEntityDto clienteZooId, ContactoEntityDto contactoId, TrabajadorEntityDto trabajadorId, boolean activo, Date fechaFinContrato, Date fechaInicioContrato, long numeroSeguridadSocial, JefeEntityDto jefeEntityDto, List<MensajeEntityDto> mensajes, double salario) {
        super(apellidos, dni, edad, nombre, password, rol, username, clienteZooId, contactoId, trabajadorId, activo, fechaFinContrato, fechaInicioContrato, numeroSeguridadSocial, jefeEntityDto, mensajes, salario);
    }

    @Override
    public void aniadirSubordinado(TrabajadorEntityDto t) {

    }

    @Override
    public void eliminarSubordinado(TrabajadorEntityDto t) {

    }

    @Override
    public double calcularSalario() {
        return super.getSalario();
    }

}
package com.Zooftware.Zooftware.model.services.patrones.adapter;

import com.Zooftware.Zooftware.model.dto.persona.JefeEntityDto;
import com.Zooftware.Zooftware.model.entities.enums.Rol;

import java.util.Date;

public class JefeJSONToDTO extends JefeEntityDto {

    int contactoId;
    int jefe_id;

    String jefeUsername;
    //ContactoEntityDto contactoEntityDto;


    public JefeJSONToDTO(JefeJson jefe) {
        //(int id, String apellidos, String dni, int edad, String nombre, String password, Rol rol, String username, ClienteEntityDto clienteZooId, ContactoEntityDto contactoId, TrabajadorEntityDto trabajadorId, boolean activo, Date fechaFinContrato, Date fechaInicioContrato, long numeroSeguridadSocial, JefeEntityDto jefeEntityDto, List<MensajeEntityDto> mensajes, double salario, List<TrabajadorEntityDto> subordinados, int contactoId1, int jefe_id, ContactoEntityDto contactoEntityDto) {
        super(jefe.apellidos, jefe.dni, jefe.edad, jefe.nombre, jefe.password, Rol.JEFE, jefe.username, null, null, null, true, jefe.getFechaFinContrato(), new Date(), jefe.numeroSeguridadSocial, null, null, jefe.salario, null);
        //contactoEntityDto = new ContactoEntityDto(jefe.correo, jefe.numeroTlf);
    }


    public int getContactoId() {
        return contactoId;
    }

    public int getJefe_id() {
        return jefe_id;
    }

}

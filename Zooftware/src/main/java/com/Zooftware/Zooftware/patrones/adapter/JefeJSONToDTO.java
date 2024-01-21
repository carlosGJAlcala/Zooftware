package com.Zooftware.Zooftware.patrones.adapter;

import com.Zooftware.Zooftware.modelDTO.*;
import com.Zooftware.Zooftware.modelJPA.enums.Rol;

import java.util.Date;
import java.util.List;

public class JefeJSONToDTO extends JefeEntityDto {

    int contactoId;
    int jefe_id;

    ContactoEntityDto contactoEntityDto;



    public JefeJSONToDTO(JefeJson jefe) {
        //(int id, String apellidos, String dni, int edad, String nombre, String password, Rol rol, String username, ClienteEntityDto clienteZooId, ContactoEntityDto contactoId, TrabajadorEntityDto trabajadorId, boolean activo, Date fechaFinContrato, Date fechaInicioContrato, long numeroSeguridadSocial, JefeEntityDto jefeEntityDto, List<MensajeEntityDto> mensajes, double salario, List<TrabajadorEntityDto> subordinados, int contactoId1, int jefe_id, ContactoEntityDto contactoEntityDto) {
        super(jefe.id, jefe.apellidos, jefe.dni, jefe.edad, jefe.nombre, jefe.password, Rol.JEFE, jefe.username, null, null, null, true, null, new Date(), jefe.numeroSeguridadSocial, null, null, jefe.salario, null);
        contactoEntityDto=new ContactoEntityDto(jefe.correo,jefe.numeroTlf);
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

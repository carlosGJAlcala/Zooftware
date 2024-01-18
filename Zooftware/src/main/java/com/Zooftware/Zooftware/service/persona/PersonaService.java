package com.Zooftware.Zooftware.service.persona;

import com.Zooftware.Zooftware.exceptions.PersonaNotFoundException;

import com.Zooftware.Zooftware.modelDAO.*;
import com.Zooftware.Zooftware.modelDTO.ContactoEntityDto;
import com.Zooftware.Zooftware.modelDTO.EmpleadoEntityDto;
import com.Zooftware.Zooftware.modelDTO.PersonaEntityDto;
import com.Zooftware.Zooftware.modelDTO.TrabajadorEntityDto;
import com.Zooftware.Zooftware.modelJPA.PersonaEntity;
import com.Zooftware.Zooftware.modelJPA.enums.Rol;
import com.Zooftware.Zooftware.repository.PersonaEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    IPersonaDAO iPersonaDAO;
    @Autowired
    ITrabajadorDAO iTrabajadorDAO;
    @Autowired
    IEmpleadoDAO iEmpleadoDAO;

    @Autowired
    IContactoDAO iContactoDAO;



    @Override
    public String tipoPersona(String username) {

        return getPersonaByUsername(username).getRol().toString();
    }

    public void contratarEmpleado(String nombre, String apellidos, String dni, int edad, String username, String password,
                                  String correo, int numeroTLF, long numSeguridadSocial, Timestamp fechaFinContrato, int salario, int jefeId){
//        Para crear al empleado, empezar desde abajo:
//        Primero crear el contacto
        ContactoEntityDto contactoEntityDto = new ContactoEntityDto(correo,numeroTLF);
        //TrabajadorEntityDto trabajadorEntityDto = new EmpleadoEntityDto(10, true, fechaFinContrato, Timestamp.from(Instant.now()), numSeguridadSocial, null, jefeId, 10, salario, "Empleado", 10);
//        Luego crear

        //EmpleadoEntityDto empleadoEntityDto = (EmpleadoEntityDto)trabajadorEntityDto;

        EmpleadoEntityDto empleadoEntityDto =  new EmpleadoEntityDto(0, apellidos, dni, edad, nombre, password, Rol.EMPLEADO, username, null, null, null,
                0, true, fechaFinContrato, Timestamp.from(Instant.now()), numSeguridadSocial, null, jefeId, 10, salario, "Empleado", 10);

//public PersonaEntityDto(int id, String apellidos, String dni, int edad, String nombre, String password, Rol rol, String username, Integer clienteZooId, Integer contactoId, Integer trabajadorId) {
//            this.id = id;
//
//            trabajadorEntityDto   int id, String apellidos, String dni, int edad, String nombre, String password, Rol rol, String username, Integer clienteZooId, Integer contactoId, Integer trabajadorId,
//            int id2, boolean activo, Timestamp fechaFinContrato, Timestamp fechaInicioContrato, long numeroSeguridadSocial, Integer empleadoZooId, Integer jefeId, Integer trabajadorId2, double salario, String puesto) {
//                super(id, apellidos, dni, edad, nombre, password, rol, username, clienteZooId, contactoId, trabajadorId);
//
        TrabajadorEntityDto trabajadorEntityDto = (TrabajadorEntityDto) empleadoEntityDto;
        PersonaEntityDto personaEntityDto = (PersonaEntityDto) trabajadorEntityDto;

        iContactoDAO.guardarContacto(contactoEntityDto);
        int ejemplo = contactoEntityDto.getId();
        iEmpleadoDAO.guardarEmpleado(empleadoEntityDto);
        iTrabajadorDAO.guardarTrabajador(trabajadorEntityDto);
        iPersonaDAO.guardarPersona(personaEntityDto);
    }


    @Override
    public List<PersonaEntity> buscarTodas() {
        return null;
    }

    @Override
    public PersonaEntityDto getPersonaByUsername(String username) {
        return iPersonaDAO.getPersonaByUsername(username);
    }

    @Override
    public boolean existePersona(String username, String password) {
        return iPersonaDAO.existePersona(username,password);
    }

    @Override
    public void modificarRol(Rol rol, String username) {

    }

    @Override
    public List<PersonaEntity> buscarPorRol(Rol rol) {
        return null;
    }

    @Override
    public PersonaEntity buscarPorDni(String dni) {
        return null;
    }

    @Override
    public void borrarPorUsername(String username) {

    }

    @Override
    public void crearPersona(PersonaEntity persona) {

    }
/*
    @Autowired
    private PersonaEntityRepository personaRepository;

    public String tipoPersona(String username){
        return getPersonaByUsername(username).ge;
    }

    @Override
    public List<Persona> buscarTodas() {
        return null;
    }

    public Persona getPersonaByUsername(String username){
        return personaRepository.findPersonaByUsername(username).orElseThrow(() -> new PersonaNotFoundException("Persona con username: " + username + " no existe"));
    }
    public boolean existePersona(String user, String password){
        try{

            return getPersonaByUsername(user).getPassword().equals(password);
        }
        catch(PersonaNotFoundException e){
            return false;
        }
    }

    @Override
    public void modificarRol(Rol rol,String username) {
        personaRepository.updateRolByUsername(rol,username);
    }

    @Override
    public List<Persona> buscarPorRol(Rol rol) {
        return personaRepository.findByRol(rol);
    }

    @Override
    public Persona buscarPorDni(String dni) {
        return personaRepository.findByDni(dni);
    }

    @Override
    public void borrarPorUsername(String username) {
        personaRepository.deleteByUsername(username);

    }

    @Override
    public void crearPersona(Persona persona) {
        personaRepository.save(persona);
    }

*/
}

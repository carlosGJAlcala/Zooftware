package com.Zooftware.Zooftware.service.persona;

import com.Zooftware.Zooftware.modelDAO.IPersonaDAO;
import com.Zooftware.Zooftware.modelDTO.PersonaEntityDto;
import com.Zooftware.Zooftware.modelJPA.persona.PersonaEntity;
import com.Zooftware.Zooftware.modelJPA.enums.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    IPersonaDAO iPersonaDAO;

    @Override
    public String tipoPersona(String username) {

        return getPersonaByUsername(username).getRol().toString();
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

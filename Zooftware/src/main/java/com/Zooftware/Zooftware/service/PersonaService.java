package com.Zooftware.Zooftware.service;

import com.Zooftware.Zooftware.exceptions.PersonaNotFoundException;
import com.Zooftware.Zooftware.exceptions.ValidacionException;
import com.Zooftware.Zooftware.model.persona.Persona;
import com.Zooftware.Zooftware.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public String tipoPersona(String username){
        return getPersonaByUsername(username).getRol().toString();
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

}

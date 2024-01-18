package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AcuaticoEntityDto;
import com.Zooftware.Zooftware.modelDTO.PersonaEntityDto;
import com.Zooftware.Zooftware.modelJPA.ClienteEntity;
import com.Zooftware.Zooftware.modelJPA.PersonaEntity;
import com.Zooftware.Zooftware.repository.PersonaEntityRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class PersonaDAOImp implements IPersonaDAO{

    @Autowired
    PersonaEntityRepository personajpa;
    PersonaEntityMapper persona;


    public PersonaEntityDto getPersonaByUsername(String username){
        Optional<PersonaEntity> optional = personajpa.findPersonaByUsername(username);
        if (optional.isPresent()) {
            return persona.mapper.toDto(optional.get());
        }
        return null;
    }

    public boolean existePersona(String username, String password){
        return personajpa.existsByUsernameLikeIgnoreCaseAndPasswordLike(username,password);
    }

    public String getTipoPersona(String username){
        PersonaEntityDto personaEntityDto =  getPersonaByUsername(username);
        return personaEntityDto.getRol().toString();
    }

    @Override
    public void actualizarPersona(PersonaEntityDto personaEntityDto) {
        personajpa.deleteById(personaEntityDto.getId());
        PersonaEntity personaEntity=persona.mapper.toEntity(personaEntityDto);
        personajpa.save(personaEntity);
    }

    @Override
    public void guardarPersona(PersonaEntityDto personaEntityDto) {
        PersonaEntity personaEntity=persona.mapper.toEntity(personaEntityDto);
        personajpa.save(personaEntity);
    }

    @Override
    public void eliminarPersona(Integer id) {
        personajpa.deleteById(id);
    }

}

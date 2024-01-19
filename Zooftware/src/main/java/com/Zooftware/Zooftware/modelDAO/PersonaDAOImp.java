package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.PersonaEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.TipoPersona;
import com.Zooftware.Zooftware.repository.ClienteEntityRepository;
import com.Zooftware.Zooftware.repository.PersonaEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class PersonaDAOImp implements IPersonaDAO{

    @Autowired
    PersonaEntityRepository personajpa;


    ClienteEntityMapper clienteEntityMapper;
    PersonaEntityMapper persona;


    public PersonaEntityDto getPersonaByUsername(String username){
//        Optional<ClienteEntity> optional = clienteEntityRepository.findByUsername(username);
//        if (optional.isPresent()) {
//           return Person
//        }
        return null;
    }

    public boolean existePersona(String username, String password){

        return personajpa.existsByUsernameLikeIgnoreCaseAndPasswordLike(username,password);
    }

    public String getTipoPersona(String username){
//        PersonaEntityDto personaEntityDto =  getPersonaByUsername(username);
//        return personaEntityDto.getRol().toString();
        return "";
    }

    @Override
    public void actualizarPersona(PersonaEntityDto personaEntityDto) {

    }

    @Override
    public String findPasswordById(int password){
        return personajpa.findPasswordById(password);
    }

    @Override
    public void guardarPersona(PersonaEntityDto personaEntityDto) {

    }

    @Override
    public void eliminarPersona(Integer id) {

    }

    public TipoPersona getTipoEmpleadoByUsername(String username){
        Optional<TipoPersona> optional = personajpa.findTipoPersonaByUsername(username);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }


}

package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.PersonaEntityDto;

public interface IPersonaDAO {
     PersonaEntityDto getPersonaByUsername(String username);
     boolean existePersona(String username, String password);
     String getTipoPersona(String username);

}

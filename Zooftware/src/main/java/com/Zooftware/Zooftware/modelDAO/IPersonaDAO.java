package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.OrganismoEntityDto;
import com.Zooftware.Zooftware.modelDTO.PersonaEntityDto;

public interface IPersonaDAO {
     PersonaEntityDto getPersonaByUsername(String username);
     boolean existePersona(String username, String password);
     String getTipoPersona(String username);
     void actualizarPersona(PersonaEntityDto personaEntityDto);
     void guardarPersona(PersonaEntityDto personaEntityDto);
     public void eliminarPersona(Integer id);

}

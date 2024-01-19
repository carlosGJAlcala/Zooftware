package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.PersonaEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.TipoPersona;

public interface IPersonaDAO {
     PersonaEntityDto getPersonaByUsername(String username);
     boolean existePersona(String username, String password);
     String getTipoPersona(String username);
     void actualizarPersona(PersonaEntityDto personaEntityDto);

     String findPasswordById(int password);

     void guardarPersona(PersonaEntityDto personaEntityDto);
     public void eliminarPersona(Integer id);
     public TipoPersona getTipoEmpleadoByUsername(String username);
}

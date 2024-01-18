package com.Zooftware.Zooftware.service.persona;

import com.Zooftware.Zooftware.modelDTO.PersonaEntityDto;
import com.Zooftware.Zooftware.modelJPA.PersonaEntity;
import com.Zooftware.Zooftware.modelJPA.enums.Rol;

import java.sql.Timestamp;
import java.util.List;

public interface IPersonaService {
    public String tipoPersona(String username);
    public List<PersonaEntity> buscarTodas();

    PersonaEntityDto getPersonaByUsername(String username);
    public boolean existePersona(String username, String password);

    public void modificarRol(Rol rol, String username);

    public List<PersonaEntity> buscarPorRol(Rol rol);

    public PersonaEntity buscarPorDni(String dni);

    public void  borrarPorUsername(String username);

    public void crearPersona(PersonaEntity persona);

    public void contratarEmpleado(String nombre, String apellidos, String dni, int edad, String username, String password,
                                  String correo, int numeroTLF, long numSeguridadSocial, Timestamp fechaFinContrato, int salario, int jefeId);

}

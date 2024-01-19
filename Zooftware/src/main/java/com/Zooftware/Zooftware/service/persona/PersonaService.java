package com.Zooftware.Zooftware.service.persona;

import com.Zooftware.Zooftware.modelDAO.IClienteDAO;
import com.Zooftware.Zooftware.modelDAO.IEmpleadoDAO;
import com.Zooftware.Zooftware.modelDAO.IJefeDAO;
import com.Zooftware.Zooftware.modelDAO.IPersonaDAO;
import com.Zooftware.Zooftware.modelDTO.ClienteEntityDto;
import com.Zooftware.Zooftware.modelDTO.EmpleadoEntityDto;
import com.Zooftware.Zooftware.modelDTO.JefeEntityDto;
import com.Zooftware.Zooftware.modelJPA.persona.PersonaEntity;
import com.Zooftware.Zooftware.modelJPA.enums.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class PersonaService implements IPersonaService {


    @Autowired
    IPersonaDAO iPersonaDAO;
    @Autowired
    IClienteDAO iClienteDAO;
    @Autowired
    IJefeDAO iJefeDAO;
    @Autowired
    IEmpleadoDAO iEmpleadoDAO;




    @Override
    public String tipoPersona(String username) {

//        return getPersonaByUsername(username).getRol().toString();

        return "";
    }

    @Override
    public List<PersonaEntity> buscarTodas() {
        return null;
    }


    @Override
    public ClienteEntityDto getClienteByUsername(String username){
        return iClienteDAO.getClienteByUsername(username);
    }

    @Override
    public JefeEntityDto getJefeByUsername(String username){
        return iJefeDAO.getJefeByUsername(username);
    }

    @Override
    public EmpleadoEntityDto getEmpleadoByUsername(String username){
        return iEmpleadoDAO.getEmpleadoByUsername(username);
    }


    @Override
    public Rol getTipoEmpleadoPorUsername(String username){
        JefeEntityDto jefe = iJefeDAO.getJefeByUsername(username);
        EmpleadoEntityDto empleado = iEmpleadoDAO.getEmpleadoByUsername(username);
        ClienteEntityDto cliente = iClienteDAO.getClienteByUsername(username);
        if(jefe != null)
            return jefe.getRol();
        if(empleado != null)
            return empleado.getRol();
        if(cliente != null)
            return cliente.getRol();
        return null;
    }

    //*************************************//
    @Override
    public boolean existePersona(String username, String password) {
        //Obtener password por id del cliente
        JefeEntityDto jefe = iJefeDAO.getJefeByUsername(username);
        EmpleadoEntityDto empleado = iEmpleadoDAO.getEmpleadoByUsername(username);
        ClienteEntityDto cliente = iClienteDAO.getClienteByUsername(username);
        if(jefe != null)
            return jefe.getPassword().equals(password);
        if(empleado != null)
            return empleado.getPassword().equals(password);
        if(cliente != null)
            return cliente.getPassword().equals(password);
        return false;
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


    //*************************************//
    @Override
    public void contratarEmpleado(String nombre, String apellidos, String dni, int edad, String username, String password, String correo, int numeroTLF, long numSeguridadSocial, Timestamp fechaFinContrato, int salario, int jefeId) {

    }

}

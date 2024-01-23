package com.Zooftware.Zooftware.model.services.persona;

import com.Zooftware.Zooftware.model.dao.comida.IClienteDAO;
import com.Zooftware.Zooftware.model.dao.instalaciones.IHabitatDAO;
import com.Zooftware.Zooftware.model.dao.persona.IEmpleadoDAO;
import com.Zooftware.Zooftware.model.dao.persona.IJefeDAO;
import com.Zooftware.Zooftware.model.dao.persona.IPersonaDAO;
import com.Zooftware.Zooftware.model.dto.persona.ClienteEntityDto;
import com.Zooftware.Zooftware.model.dto.comida.ComederoEntityDto;
import com.Zooftware.Zooftware.model.dto.persona.EmpleadoEntityDto;
import com.Zooftware.Zooftware.model.dto.persona.JefeEntityDto;
import com.Zooftware.Zooftware.model.entities.persona.PersonaEntity;
import com.Zooftware.Zooftware.model.entities.enums.Rol;
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

    @Autowired
    IHabitatDAO iHabitatDAO;

    @Override
    public List<ComederoEntityDto> getComederosPorIdHabitat(int id){
        return iHabitatDAO.buscarPorId(id).getComederos();
    }



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

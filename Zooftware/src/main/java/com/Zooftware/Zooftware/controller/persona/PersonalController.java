package com.Zooftware.Zooftware.controller.persona;

import com.Zooftware.Zooftware.model.dto.persona.PersonaEntityDto;
import com.Zooftware.Zooftware.model.services.patrones.adapter.EmpleadoJson;
import com.Zooftware.Zooftware.model.services.patrones.adapter.JefeJson;
import com.Zooftware.Zooftware.model.services.patrones.proxy.IAccionesJefe;
import com.Zooftware.Zooftware.model.services.persona.IPersonaService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Timestamp;
import java.time.LocalDate;

@Controller
@RequestMapping("/personal")
public class PersonalController {
    @Autowired
    IPersonaService personaService;


    @GetMapping("/mostrar")
    public ModelAndView mostrarLogin(){
        ModelAndView modelAndView = new ModelAndView("gestionPersonal");
        return modelAndView;
    }

    @GetMapping("/mostrarContratarEmpleado")
    public ModelAndView mostrarContratarEmpleado(){
        ModelAndView modelAndView = new ModelAndView("contratarEmpleado");
        return modelAndView;
    }

    @GetMapping("/mostrarContratarJefe")
    public ModelAndView mostrarContratarJefe(){
        ModelAndView modelAndView = new ModelAndView("contratarJefe");
        return modelAndView;
    }


    @GetMapping("/mostrarTablaEmpleados")
    public ModelAndView mostrarModificacionEmpleado(){
        ModelAndView modelAndView = new ModelAndView("tablaEmpleados");
        return modelAndView;
    }

    @GetMapping("/mostrarSueldosTotales")
    public ModelAndView mostrarSueldosTotales(){
        ModelAndView modelAndView = new ModelAndView("sueldosTotales");
        return modelAndView;
    }

    @PostMapping("/contratarEmpleado")
    public void contratarEmpleado(@RequestParam(name = "nombre") String nombre, @RequestParam(name = "apellidos") String apellidos, @RequestParam(name = "dni") String dni,
                                          @RequestParam(name = "edad") int edad,  @RequestParam(name = "username") String username,  @RequestParam(name = "password") String password,
                                          @RequestParam(name = "correo") String correo,  @RequestParam(name = "numeroTLF") int numeroTLF,  @RequestParam (name = "fechaFinContrato") LocalDate fechaFinContrato,
                                          @RequestParam(name = "numSeguridadSocial") long numSeguridadSocial, @RequestParam(name = "salario") int salario, HttpSession session){
        PersonaEntityDto personaEntityDto = (PersonaEntityDto)session.getAttribute("user");
        personaService.contratarEmpleado(nombre, apellidos, dni, edad, username, password,correo,numeroTLF,numSeguridadSocial, Timestamp.valueOf(fechaFinContrato.atStartOfDay()),salario, personaEntityDto.getId());
    }




    @ExceptionHandler(Exception.class)
    public ModelAndView excepcion(Exception exception){
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("mensajeError",exception.getMessage());
        return modelAndView;
    }
    @GetMapping("/trabajador/verTotalSueldos")
    public ResponseEntity<?> verTotalSueldos(HttpSession session) {
        IAccionesJefe proxyJefe = (IAccionesJefe)  session.getAttribute("proxy");
        return ResponseEntity.ok(proxyJefe.verTotalSueldos(((PersonaEntityDto) session.getAttribute("user")).getId()));
    }

    public void despedirEmpleado(int empleado_id) {

    }

    @PostMapping(value = "/empleado/contratar", produces = MediaType.TEXT_PLAIN_VALUE)
    public void contratarEmpleado(@RequestBody EmpleadoJson empleadoNuevo, HttpSession session) {
        PersonaEntityDto persona = (PersonaEntityDto) session.getAttribute("user");
        IAccionesJefe proxyJefe = (IAccionesJefe)  session.getAttribute("proxy");
        empleadoNuevo.setIdJefe(persona.getId());
        proxyJefe.contratarEmpleado(empleadoNuevo);

    }

    @PostMapping(value = "/jefe/contratar", produces = MediaType.TEXT_PLAIN_VALUE)
    public void contratarJefe(@RequestBody JefeJson jefeNuevo, HttpSession session) {
        IAccionesJefe proxyJefe = (IAccionesJefe)  session.getAttribute("proxy");
        PersonaEntityDto persona = (PersonaEntityDto) session.getAttribute("user");
        jefeNuevo.setIdJefe(persona.getId());
        proxyJefe.contratarJefe(jefeNuevo);

    }



}

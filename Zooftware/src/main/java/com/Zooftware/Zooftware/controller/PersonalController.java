package com.Zooftware.Zooftware.controller;

import com.Zooftware.Zooftware.modelDTO.JefeEntityDto;
import com.Zooftware.Zooftware.modelDTO.PersonaEntityDto;
import com.Zooftware.Zooftware.service.persona.IPersonaService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

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



}

package com.Zooftware.Zooftware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/instalacion")
public class InstalacionesController {

    @GetMapping("/mostrar")
    public ModelAndView mostrarLogin(){
        ModelAndView modelAndView = new ModelAndView("gestionInstalacion");
        return modelAndView;
    }

    @GetMapping("/mostrarTablaInstalacionesJefe")
    public ModelAndView mostrarTablaInstalaciones(){
        ModelAndView modelAndView = new ModelAndView("tablaInstalacionJefe");
        return modelAndView;
    }

    @GetMapping("/mostrarTablaInstalacionesEmpleado")
    public ModelAndView mostrarTablaInstalacionesEmpleado(){
        ModelAndView modelAndView = new ModelAndView("tablaInstalacionEmpleado");
        return modelAndView;
    }

    @GetMapping("/mostrarTablaInstalacionesCliente")
    public ModelAndView mostrarTablaInstalacionesCliente(){
        ModelAndView modelAndView = new ModelAndView("tablaInstalacionCliente");
        return modelAndView;
    }




    @ExceptionHandler(Exception.class)
    public ModelAndView excepcion(Exception exception){
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("mensajeError",exception.getMessage());
        return modelAndView;
    }










}

package com.Zooftware.Zooftware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/animal")
public class AnimalController {



    @GetMapping("/mostrarTablaAnimalJefe")
    public ModelAndView mostrarLogin(){
        ModelAndView modelAndView = new ModelAndView("tablaAnimalJefe");
        return modelAndView;
    }

    @GetMapping("/mostrarTablaAnimalEmpleado")
    public ModelAndView mostrarTablaAnimalEmpleado(){
        ModelAndView modelAndView = new ModelAndView("tablaAnimalEmpleado");
        return modelAndView;
    }

    @GetMapping("/mostrarTablaAnimalCliente")
    public ModelAndView mostrarTablaAnimalCliente(){
        ModelAndView modelAndView = new ModelAndView("tablaAnimalCliente");
        return modelAndView;
    }



    @ExceptionHandler(Exception.class)
    public ModelAndView excepcion(Exception exception){
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("mensajeError",exception.getMessage());
        return modelAndView;
    }



}

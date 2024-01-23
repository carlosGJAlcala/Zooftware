package com.Zooftware.Zooftware.controller.mensajeria;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mensaje")
public class MensajeController {



    @GetMapping("/mostrarGestionMensajeJefe")
    public ModelAndView mostrarGestionMensajeJefe(){
        ModelAndView modelAndView = new ModelAndView("gestionMensajeJefe");
        return modelAndView;
    }

    @GetMapping("/mostrarGestionMensajeEmpleado")
    public ModelAndView mostrarGestionMensajeEmpleado(){
        ModelAndView modelAndView = new ModelAndView("gestionMensajeEmpleado");
        return modelAndView;
    }



    @ExceptionHandler(Exception.class)
    public ModelAndView excepcion(Exception exception){
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("mensajeError",exception.getMessage());
        return modelAndView;
    }




}

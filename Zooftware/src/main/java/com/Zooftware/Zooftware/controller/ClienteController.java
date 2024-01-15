package com.Zooftware.Zooftware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClienteController {






    @ExceptionHandler(Exception.class)
    public ModelAndView excepcion(Exception exception){
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("mensajeError",exception.getMessage());
        return modelAndView;
    }

}

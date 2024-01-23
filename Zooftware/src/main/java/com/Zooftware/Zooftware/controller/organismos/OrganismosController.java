package com.Zooftware.Zooftware.controller.organismos;

import com.Zooftware.Zooftware.model.entities.enums.TipoHabitat;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/organismo")
public class OrganismosController {


    @GetMapping("/mostrar")
    public ModelAndView mostrarLogin(HttpSession session){
        ModelAndView modelAndView = new ModelAndView("gestionOrganismo");
        return modelAndView;
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView excepcion(Exception exception){
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("mensajeError",exception.getMessage());
        return modelAndView;
    }




}

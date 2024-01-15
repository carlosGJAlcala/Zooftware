package com.Zooftware.Zooftware.controller;

import com.Zooftware.Zooftware.exceptions.ValidacionException;
import com.Zooftware.Zooftware.repository.PersonaRepository;
import com.Zooftware.Zooftware.service.PersonaService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private PersonaService personaService;


    @GetMapping("/mostrar")
    public ModelAndView mostrarLogin(){
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }
    @GetMapping("/validarInicioSesion")
    public String validarInicioSesion(@RequestParam(name = "user") String user, @RequestParam(name = "password") String password, HttpSession session){
        if(personaService.existePersona(user,password)){
            session.setAttribute("user",personaService.getPersonaByUsername(user));
            switch (personaService.tipoPersona(user)){
                case "JEFE":
                    return "redirect:/jefe/home/mostrar";
                case "EMPLEADO":
                    return "redirect:/empleado/home/mostrar";
                case "CLIENTE":
                    return "redirect:/cliente/home/mostrar";
                default:
                    throw new ValidacionException();
            }
        }else{
            throw new ValidacionException();
        }
    }


    @ExceptionHandler(Exception.class)
    public ModelAndView excepcion(Exception exception){
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("mensajeError",exception.getMessage());
        return modelAndView;
    }


}

package com.Zooftware.Zooftware.controller;

import com.Zooftware.Zooftware.exceptions.ValidacionException;
import com.Zooftware.Zooftware.modelJPA.enums.Rol;
import com.Zooftware.Zooftware.modelJPA.enums.TipoEmpleado;
import com.Zooftware.Zooftware.service.persona.IPersonaService;
import com.Zooftware.Zooftware.service.persona.PersonaService;
import jakarta.servlet.http.HttpSession;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    PersonaService personaService;


    private static Log log = LogFactory.getLog(LoginController.class);

    @GetMapping("/mostrar")
    public ModelAndView mostrarLogin(){
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }
    @GetMapping("/validarInicioSesion")
    public String validarInicioSesion(@RequestParam(name = "user") String username, @RequestParam(name = "password") String password, HttpSession session){
        if(personaService.existePersona(username,password)){
            Rol rol = personaService.getTipoEmpleadoPorUsername(username);

            switch (rol.toString()){
                case "JEFE":
                    session.setAttribute("user",personaService.getJefeByUsername(username));
                    return "redirect:/jefe/home/mostrar";
                case "EMPLEADO":
                    session.setAttribute("user",personaService.getEmpleadoByUsername(username));
                    return "redirect:/empleado/home/mostrar";
                case "CLIENTE":
                    session.setAttribute("user",personaService.getClienteByUsername(username));
                    return "redirect:/cliente/home/mostrar";
                default:
                    throw new ValidacionException();
            }
        }else{
            throw new ValidacionException();
        }
    }

    @GetMapping("/cerrarSesion")
    public String cerrarSesion(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/login/mostrar";
    }
    @ExceptionHandler(Exception.class)
    public ModelAndView excepcion(Exception exception){
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("mensajeError",exception.getMessage());
        log.info("SE HA REGISTRADO UNA EXCEPCIÓN EN LA APLICACIÓN: "+exception.getMessage());
        return modelAndView;
    }

}

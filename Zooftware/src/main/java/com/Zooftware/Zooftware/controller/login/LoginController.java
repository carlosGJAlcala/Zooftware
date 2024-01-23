package com.Zooftware.Zooftware.controller.login;

import com.Zooftware.Zooftware.model.entities.enums.Rol;
import com.Zooftware.Zooftware.model.entities.enums.TipoPersona;
import com.Zooftware.Zooftware.model.services.patrones.adapter.LoginJson;
import com.Zooftware.Zooftware.model.services.patrones.factoryMethod.FactoryMethodProxy;
import com.Zooftware.Zooftware.model.services.patrones.proxy.IAccionesCliente;
import com.Zooftware.Zooftware.model.services.patrones.proxy.IAccionesEmpleado;
import com.Zooftware.Zooftware.model.services.patrones.proxy.IAccionesJefe;
import com.Zooftware.Zooftware.model.services.persona.PersonaService;
import jakarta.servlet.http.HttpSession;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")

public class LoginController {
    @Autowired

    private PersonaService personaService;
    @Autowired
    FactoryMethodProxy factoryMethodProxy;
    TipoPersona tipo;
    private static Log log = LogFactory.getLog(LoginController.class);

    @GetMapping("/mostrar")
    public ModelAndView mostrarLogin() {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }


    @GetMapping("/cerrarSesion")
    public String cerrarSesion(HttpSession session) {
        session.removeAttribute("user");
        return "redirect:/login/mostrar";
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView excepcion(Exception exception) {
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("mensajeError", exception.getMessage());
        log.info("SE HA REGISTRADO UNA EXCEPCIÓN EN LA APLICACIÓN: " + exception.getMessage());
        return modelAndView;
    }

    @PostMapping("/validarInicioSesion")
    public ResponseEntity<String> validarInicioSesion(@RequestBody LoginJson user, HttpSession session) {

        String redirectUrl;
        if (personaService.existePersona(user.getUsername(), user.getPassword())) {
            Rol rol = personaService.getTipoEmpleadoPorUsername(user.getUsername());
            switch (rol.toString()) {
                case "JEFE":
                    tipo = TipoPersona.JEFE;
                    IAccionesJefe accionesJefe = (IAccionesJefe) factoryMethodProxy.devolverProxy(TipoPersona.JEFE);
                    session.setAttribute("proxy", accionesJefe);
                    session.setAttribute("user", personaService.getJefeByUsername(user.getUsername()));
                    redirectUrl = "/jefe/home/mostrar";
                    break;
                case "EMPLEADO":
                    tipo = TipoPersona.EMPLEADO;
                    IAccionesEmpleado accionesEmpleado = (IAccionesEmpleado) factoryMethodProxy.devolverProxy(TipoPersona.EMPLEADO);
                    session.setAttribute("proxy", accionesEmpleado);
                    session.setAttribute("user", personaService.getEmpleadoByUsername(user.getUsername()));
                    redirectUrl = "/empleado/home/mostrar";
                    break;
                case "CLIENTE":
                    tipo = TipoPersona.CLIENTE;
                    IAccionesCliente accionesCliente = (IAccionesCliente) factoryMethodProxy.devolverProxy(TipoPersona.CLIENTE);
                    session.setAttribute("proxy", accionesCliente);
                    session.setAttribute("user", personaService.getClienteByUsername(user.getUsername()));
                    redirectUrl = "/cliente/home/mostrar";
                    break;
                default:
                    return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Acceso Denegado");
            }
            return ResponseEntity.ok(redirectUrl);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuario o contraseña incorrectos");
        }
    }




}

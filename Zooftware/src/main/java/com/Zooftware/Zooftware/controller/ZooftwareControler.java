package com.Zooftware.Zooftware.controller;

import com.Zooftware.Zooftware.exceptions.ValidacionException;
import com.Zooftware.Zooftware.modelDTO.*;
import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;
import com.Zooftware.Zooftware.modelJPA.enums.Rol;
import com.Zooftware.Zooftware.modelJPA.enums.TipoHabitat;
import com.Zooftware.Zooftware.modelJPA.enums.TipoPersona;
import com.Zooftware.Zooftware.patrones.facade.Zooftware;
import com.Zooftware.Zooftware.patrones.factoryMethod.FactoryMethodProxy;
import com.Zooftware.Zooftware.patrones.proxy.IAccionesCliente;
import com.Zooftware.Zooftware.patrones.proxy.IAccionesEmpleado;
import com.Zooftware.Zooftware.patrones.proxy.IAccionesJefe;
import com.Zooftware.Zooftware.patrones.proxy.ProxyEmpleado;
import com.Zooftware.Zooftware.service.persona.PersonaService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.awt.*;
import java.lang.reflect.Proxy;
import java.util.List;

@Controller
@RequestMapping("/zooftware")
public class ZooftwareControler  {
    @Autowired
    private PersonaService personaService;

    @Autowired
    FactoryMethodProxy factoryMethodProxy;
    TipoPersona tipo;

    Zooftware zoo;

//    @GetMapping("/validarInicioSesion")
//    public String validarInicioSesion(@RequestParam(name = "user") String user, @RequestParam(name = "password") String password, HttpSession session){
//        if(personaService.existePersona(user,password)){
//            session.setAttribute("user",personaService.getPersonaByUsername(user));
//            switch (personaService.tipoPersona(user)){
//                case "JEFE":
//                    tipo =TipoPersona.JEFE;
//                    zoo=factoryMethodProxy.devolverProxy(tipo);
//                    return "redirect:/jefe/home/mostrar";
//                case "EMPLEADO":
//                    tipo =TipoPersona.EMPLEADO;
//                    zoo=factoryMethodProxy.devolverProxy(tipo);
//                    return "redirect:/empleado/home/mostrar";
//                case "CLIENTE":
//                    tipo =TipoPersona.CLIENTE;
//                    zoo=factoryMethodProxy.devolverProxy(tipo);
//                    return "redirect:/cliente/home/mostrar";
//                default:
//                    throw new ValidacionException();
//            }
//        }else{
//            throw new ValidacionException();
//        }
//    }

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
                    tipo =TipoPersona.JEFE;
                    zoo=factoryMethodProxy.devolverProxy(tipo);
                    return "redirect:/jefe/home/mostrar";
                case "EMPLEADO":
                    tipo =TipoPersona.EMPLEADO;
                    session.setAttribute("user",personaService.getEmpleadoByUsername(username));
//                    zoo=factoryMethodProxy.devolverProxy(tipo);

//                    IAccionesEmpleado accionesEmpleado= (IAccionesEmpleado) Proxy.newProxyInstance(IAccionesEmpleado.class.getClassLoader(),Zooftware.class.getInterfaces(),new ProxyEmpleado(new Zooftware()));
//                    accionesEmpleado.darComerAnimal(2,4);
//
//                    IAccionesCliente clienteAcc = (IAccionesCliente) accionesEmpleado;
//
//                    clienteAcc.toString();
//

                    return "redirect:/empleado/home/mostrar";
                case "CLIENTE":
                    tipo =TipoPersona.CLIENTE;
                    session.setAttribute("user",personaService.getClienteByUsername(username));
                    zoo=factoryMethodProxy.devolverProxy(tipo);
                    return "redirect:/cliente/home/mostrar";
                default:
                    throw new ValidacionException();
            }
        }else{
            throw new ValidacionException();
        }
    }

    @GetMapping("/animal")
    public List<AnimalEntityDto> verAnimales() {
        return zoo.verAnimales();
    }
    @GetMapping("/habitas")
    public List<HabitatEntityDto> verInstalaciones() {
        return zoo.verInstalaciones();
    }

    @PostMapping(value = "/mensaje" ,produces = MediaType.TEXT_PLAIN_VALUE)
    public void enviarMensaje(@RequestBody  MensajeEntityDto mensaje) {
        zoo.enviarMensaje(mensaje);


    }
//falta implementar el dao de trabajador
    @GetMapping("/mensaje/{trabajadorId}")
    public List<MensajeEntityDto> consultarMensajesPorTrabajador(@PathVariable("trabajadorId") String trabajadorId) {
        return zoo.consultarMensajes(trabajadorId);
    }
    @GetMapping("/animal/{id_anima}")
    public EstadoAnimal ComprobarEstadoAnimal(@PathVariable("id_animal") int id) {
        return zoo.ComprobarEstadoAnimal(id);
    }

    @PostMapping(value = "/animal" ,produces = MediaType.TEXT_PLAIN_VALUE)
    public void ModificarEstadoAnimal(@RequestBody  AnimalEntityDto animal) {
        zoo.ModificarEstadoAnimal(animal);
    }
    @GetMapping("/animal/ejercitarAnimal/{id_anima}")
    public void ejercitarAnimal(@PathVariable("id_animal") int id) {
    zoo.ejercitarAnimal(id,10);
    }
    @GetMapping("/animal/dormirAnimal/{id_anima}")
    public void dormirAnimal(@PathVariable("id_animal") int id) {
    zoo.dormirAnimal(id,10);
    }
    @GetMapping("/animal/darComerAnimal/{id_anima}")
    public void darComerAnimal(@PathVariable("id_animal") int id) {
    zoo.darComerAnimal(id,10);
    }
    @GetMapping("/habita/comedero/rellenar/{habita_id}")
    public void rellenarComederos(@PathVariable("habita_id")int habita_id) {
        zoo.rellenarComederos(habita_id);

    }

    @GetMapping("/habita/bebedero/rellenar/{habita_id}")
    public void rellenarBebederos(@PathVariable("habita_id") int habita_id) {
        zoo.rellenarBebederos(habita_id);
    }
    @GetMapping("/habita/bebedero/{habita_id}")
    public List<BebederoEntityDto> verBebederos(@PathVariable("habita_id") int habita_id) {
        return zoo.verBebederos(habita_id);
    }
    @GetMapping("/habita/comedero/{habita_id}")

    public List<ComederoEntityDto> verComederos(@PathVariable("habita_id") int habita_id) {
        return zoo.verComederos(habita_id);
    }

    @PostMapping(value = "/habita/comedero/modifcar/" ,produces = MediaType.TEXT_PLAIN_VALUE)
    public void modificarEstadoComedero(@RequestBody ComederoEntityDto comedero,@RequestBody  int cantidad) {
        zoo.modificarEstadoComedero(comedero,cantidad);
    }

    @PostMapping(value = "/habita/bebedero/modifcar/" ,produces = MediaType.TEXT_PLAIN_VALUE)
    public void modificarEstadoBebedero(@RequestBody BebederoEntityDto bebedero,@RequestBody  int cantidad) {
        zoo.modificarEstadoBebedero(bebedero,cantidad);
    }



    public void comprarAnimal(AnimalEntityDto animalEntityDto, HabitatEntityDto habita) {

    }

    public void crearhabita(TipoHabitat tipo) {

    }

    public void eliminarHabita(int habita_id) {

    }

    public double verTotalSueldos(int empleado_id) {
        return 0;
    }

    public void despedirEmpleado(int empleado_id) {

    }

    public void contratarEmpleado(TrabajadorEntityDto empleadoNuevo, TipoPersona tipo) {

    }

    public void modificarEmpleado(int empleado_id, TipoPersona tipo) {

    }
}

package com.Zooftware.Zooftware.controller;

import com.Zooftware.Zooftware.exceptions.ValidacionException;
import com.Zooftware.Zooftware.modelDTO.*;
import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;
import com.Zooftware.Zooftware.modelJPA.enums.Rol;
import com.Zooftware.Zooftware.modelJPA.enums.TipoHabitat;
import com.Zooftware.Zooftware.modelJPA.enums.TipoPersona;
import com.Zooftware.Zooftware.patrones.adapter.*;
import com.Zooftware.Zooftware.patrones.facade.Zooftware;
import com.Zooftware.Zooftware.patrones.factoryMethod.FactoryMethodProxy;
import com.Zooftware.Zooftware.patrones.factoryMethod.FactoryMethodProxyConcreto;
import com.Zooftware.Zooftware.patrones.proxy.*;
import com.Zooftware.Zooftware.service.persona.PersonaService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.awt.*;
import java.lang.reflect.Proxy;
import java.util.List;



@RestController
public class ZooftwareControler  {

    @Autowired
    private PersonaService personaService;
    @Autowired
    FactoryMethodProxyConcreto factoryMethodProxyConcreto;

    @Autowired
    FactoryMethodProxy factoryMethodProxy;
    TipoPersona tipo;
    @Autowired
    IAccionesJefe zoo;

    @GetMapping("/mostrar")
    public ModelAndView mostrarLogin(){
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }
    @GetMapping("/cargar")
    public void cargar(@RequestParam(name = "tipoHabitat") String tipoHabitat, HttpSession session){
        //zoo=(IAccionesJefe) Proxy.newProxyInstance(IAccionesJefe.class.getClassLoader(),Zooftware.class.getInterfaces(),new ProxyJefe(new Zooftware()));

        IAccionesJefe accionesJefe = (IAccionesJefe) factoryMethodProxy.devolverProxy(TipoPersona.JEFE);

        IAccionesEmpleado accionesEmpleado = (IAccionesEmpleado)  factoryMethodProxy.devolverProxy(TipoPersona.EMPLEADO);

        IAccionesCliente accionesCliente = (IAccionesCliente) factoryMethodProxy.devolverProxy(TipoPersona.CLIENTE);

//        zoo.cargar();

        //zoo.crearhabita(TipoHabitat.valueOf(tipoHabitat));


        session.setAttribute("proxy",(IAccionesJefe) accionesCliente);


    }


    @PostMapping("/validarInicioSesion")
    public ResponseEntity<String> validarInicioSesion(@RequestBody LoginJson user, HttpSession session){

        String redirectUrl;
        if(personaService.existePersona(user.getUsername(),user.getPassword())){
            Rol rol = personaService.getTipoEmpleadoPorUsername(user.getUsername());
            switch (rol.toString()){
                case "JEFE":
                    tipo =TipoPersona.JEFE;
                    IAccionesJefe accionesJefe = (IAccionesJefe) factoryMethodProxy.devolverProxy(TipoPersona.JEFE);
                    session.setAttribute("proxy", accionesJefe);
                    session.setAttribute("user", personaService.getJefeByUsername(user.getUsername()));
                    redirectUrl="/jefe/home/mostrar";
                    break;
                case "EMPLEADO":
                    tipo =TipoPersona.EMPLEADO;
                    IAccionesEmpleado accionesEmpleado = (IAccionesEmpleado) factoryMethodProxy.devolverProxy(TipoPersona.EMPLEADO);
                    session.setAttribute("proxy",accionesEmpleado);
                    session.setAttribute("user", personaService.getEmpleadoByUsername(user.getUsername()));
                    redirectUrl="/empleado/home/mostrar";
                    break;
                case "CLIENTE":
                    tipo =TipoPersona.CLIENTE;
                    IAccionesCliente accionesCliente = (IAccionesCliente) factoryMethodProxy.devolverProxy(TipoPersona.CLIENTE);
                    session.setAttribute("proxy", accionesCliente);
                    session.setAttribute("user", personaService.getClienteByUsername(user.getUsername()));
                    redirectUrl = "/cliente/home/mostrar";
                    break;
                default:
                    return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Acceso Denegado");
            }
            return ResponseEntity.ok(redirectUrl);
        }else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuario o contraseña incorrectos");
        }

    }

    @GetMapping("/animales")
    public List<AnimalEntityDto> verAnimales() {
        return zoo.verAnimales();
    }

//funciona
    @PostMapping(value = "/animal" ,produces = MediaType.TEXT_PLAIN_VALUE)
    public void comprarAnimal(@RequestBody AnimalJson animalJson) {
        zoo.comprarAnimal(animalJson);

    }
    //funciona
    @GetMapping("/animal/{id}")
    public AnimalEntityDto VerAnimal(@PathVariable("id") int id_animal) {
        return zoo.VerAnimal(id_animal);
    }



    @GetMapping("/habitas")
    public List<HabitatEntityDto> verInstalaciones() {
        return zoo.verInstalaciones();
    }

    @PostMapping(value = "/mensaje" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public void enviarMensaje(@RequestBody  MensajeEntityDto mensaje) {
        zoo.enviarMensaje(mensaje);


    }
//falta implementar el dao de trabajador
    @GetMapping("/mensaje/{trabajadorId}")
    public List<MensajeEntityDto> consultarMensajesPorTrabajador(@PathVariable("trabajadorId") String trabajadorId) {
        return zoo.consultarMensajes(trabajadorId);
    }
    //funciona
    @GetMapping("/animal/comprobarEstado/{id}")
    public EstadoAnimal ComprobarEstadoAnimal(@PathVariable("id") int id_animal) {
        return zoo.ComprobarEstadoAnimal(id_animal);
    }

    @PostMapping(value = "/animal/comprobarEstado" ,produces = MediaType.TEXT_PLAIN_VALUE)
    public void ModificarEstadoAnimal(@RequestBody  AnimalEntityDto animal) {
        zoo.ModificarEstadoAnimal(animal);
    }
    @GetMapping("/animal/ejercitarAnimal/{id}")
    public void ejercitarAnimal(@PathVariable("id") int id) {
    zoo.ejercitarAnimal(id,10);
    }
    @GetMapping("/animal/dormirAnimal/{id}")
    public void dormirAnimal(@PathVariable("id") int id) {
    zoo.dormirAnimal(id,10);
    }
    @GetMapping("/animal/darComerAnimal/{id}")
    public void darComerAnimal(@PathVariable("id") int id) {
    zoo.darComerAnimal(id,10);
    }
    @PostMapping("/rellenarComederos")
    public boolean rellenarComederos(@RequestParam("idHabitat")int id, HttpSession session) {
        //zoo.rellenarComederos(id);
        PersonaEntityDto persona = (PersonaEntityDto) session.getAttribute("user");


        IAccionesJefe test= (IAccionesJefe) session.getAttribute("proxy");

        test.crearhabita(TipoHabitat.ANFIBIO);

        return true;
    }
    @GetMapping("/habita/bebederos/rellenar/{habita_id}")
    public boolean rellenarBebederos(@PathVariable("habita_id")int id) {
        zoo.rellenarComederos(id);
        return true;
    }

    @GetMapping("/habita/bebedero/{habita_id}")
    public List<BebederoEntityDto> verBebederos(@PathVariable("habita_id") int habita_id) {
        return zoo.verBebederos(habita_id);
    }
    @GetMapping("/habita/comedero/{habita_id}")

    public List<ComederoEntityDto> verComederos(@PathVariable("habita_id") int habita_id) {
        return zoo.verComederos(habita_id);
    }

    @PostMapping(value = "/habita/comedero/modifcar" ,produces = MediaType.TEXT_PLAIN_VALUE)
    public void modificarEstadoComedero(@RequestBody ComederoEntityDto comedero,@RequestBody  int cantidad) {
        zoo.modificarEstadoComedero(comedero,cantidad);
    }

    @PostMapping(value = "/habita/bebedero/modifcar" ,produces = MediaType.TEXT_PLAIN_VALUE)
    public void modificarEstadoBebedero(@RequestBody BebederoJson bebedero) {
        zoo.modificarEstadoBebedero(bebedero);
    }


    public void crearhabita(TipoHabitat tipo) {
        zoo.crearhabita(TipoHabitat.ANFIBIO);
    }

    public void eliminarHabita(int habita_id) {

    }

    public double verTotalSueldos(int empleado_id) {
        return 0;
    }

    public void despedirEmpleado(int empleado_id) {

    }
    @PostMapping(value = "/empleado/contratar" ,produces = MediaType.TEXT_PLAIN_VALUE)
    public void contratarEmpleado(@RequestBody EmpleadoJson empleadoNuevo) {
        zoo.contratarEmpleado(empleadoNuevo);

    }
    @PostMapping(value = "/jefe/contratar" ,produces = MediaType.TEXT_PLAIN_VALUE)

    public void contratarJefe(@RequestBody JefeJson jefeNuevo) {
        zoo.contratarJefe(jefeNuevo);

    }
    public void modificarEmpleado(int empleado_id, TipoPersona tipo) {

    }
}

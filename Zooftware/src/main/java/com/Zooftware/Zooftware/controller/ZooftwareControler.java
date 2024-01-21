package com.Zooftware.Zooftware.controller;

import com.Zooftware.Zooftware.modelDTO.*;
import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;
import com.Zooftware.Zooftware.modelJPA.enums.Rol;
import com.Zooftware.Zooftware.modelJPA.enums.TipoHabitat;
import com.Zooftware.Zooftware.modelJPA.enums.TipoPersona;
import com.Zooftware.Zooftware.modelJPA.instalaciones.BebederoEntity;
import com.Zooftware.Zooftware.modelJPA.instalaciones.ComederoEntity;
import com.Zooftware.Zooftware.modelJPA.organimos.AnimalEntity;
import com.Zooftware.Zooftware.patrones.adapter.*;
import com.Zooftware.Zooftware.patrones.adapter.AnimalJson;
import com.Zooftware.Zooftware.patrones.adapter.BebederoJson;
import com.Zooftware.Zooftware.patrones.adapter.EmpleadoJson;
import com.Zooftware.Zooftware.patrones.adapter.JefeJson;
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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
public class ZooftwareControler {

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
    public ModelAndView mostrarLogin() {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @GetMapping("/cargar")
    public void cargar(@RequestParam(name = "tipoHabitat") String tipoHabitat, HttpSession session) {
        //zoo=(IAccionesJefe) Proxy.newProxyInstance(IAccionesJefe.class.getClassLoader(),Zooftware.class.getInterfaces(),new ProxyJefe(new Zooftware()));

        IAccionesJefe accionesJefe = (IAccionesJefe) factoryMethodProxy.devolverProxy(TipoPersona.JEFE);

        IAccionesEmpleado accionesEmpleado = (IAccionesEmpleado) factoryMethodProxy.devolverProxy(TipoPersona.EMPLEADO);

        IAccionesCliente accionesCliente = (IAccionesCliente) factoryMethodProxy.devolverProxy(TipoPersona.CLIENTE);

//        zoo.cargar();

        //zoo.crearhabita(TipoHabitat.valueOf(tipoHabitat));


        session.setAttribute("proxy", (IAccionesJefe) accionesCliente);


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

    @GetMapping("/allAnimales")
    public ModelAndView verAnimales() {
        List<AnimalEntityDto> animales = zoo.verAnimales();
        ModelAndView modelAndView = new ModelAndView("tablaAnimalJefe");

        modelAndView.addObject("animales", animales);

        return modelAndView;
    }

//funciona
    @PostMapping(value = "/comprarAnimal" ,produces = MediaType.TEXT_PLAIN_VALUE)
    public void comprarAnimal(@RequestBody AnimalJson animalJson) {
        zoo.comprarAnimal(animalJson);

    }

    @PostMapping(value = "/animal/comprobarEstado", produces = MediaType.TEXT_PLAIN_VALUE)
    public void ModificarEstadoAnimal(@RequestBody AnimalEntityDto animal) {
        zoo.ModificarEstadoAnimal(animal);
    }

    @GetMapping("/animal/ejercitarAnimal/{id}")
    public ResponseEntity<String> ejercitarAnimal(@PathVariable int id) {


        try {
            // Aquí va la lógica para dar de comer al animal
            zoo.ejercitarAnimal(id,10);

            // Retorna un mensaje de éxito
            return ResponseEntity.ok("Acción completada con éxito");
        } catch (Exception e) {
            // Manejo de excepciones, retorna un código de error
            return ResponseEntity.status(500).body("Error al realizar la acción");
        }
    }
    @GetMapping("/animal/dormirAnimal/{id}")
    public ResponseEntity<String> dormirAnimal(@PathVariable int id) {
        try {
            // Aquí va la lógica para dar de comer al animal
            zoo.dormirAnimal(id,10);

            // Retorna un mensaje de éxito
            return ResponseEntity.ok("Acción completada con éxito");
        } catch (Exception e) {
            // Manejo de excepciones, retorna un código de error
            return ResponseEntity.status(500).body("Error al realizar la acción");
        }
    }
    @GetMapping("/animal/darComerAnimal/{id}")
    public ResponseEntity<String> darComerAnimal(@PathVariable int id) {
        try {
            // Aquí va la lógica para dar de comer al animal
            zoo.darComerAnimal(id,10);

            // Retorna un mensaje de éxito
            return ResponseEntity.ok("Acción completada con éxito");
        } catch (Exception e) {
            // Manejo de excepciones, retorna un código de error
            return ResponseEntity.status(500).body("Error al realizar la acción");
        }

     }
/*    @PostMapping("/rellenarComederos")
    public boolean rellenarComederos(@RequestParam("idHabitat")int id, HttpSession session) {
        //zoo.rellenarComederos(id);
        PersonaEntityDto persona = (PersonaEntityDto) session.getAttribute("user");


        IAccionesJefe test= (IAccionesJefe) session.getAttribute("proxy");

        test.crearHabitat(TipoHabitat.ANFIBIO);

        return true;
    }*/

    @GetMapping("/habitat/comederos/rellenar/{id}")
    public boolean rellenarComederos(@PathVariable("id") int id) {
        zoo.rellenarComederos(id);
        return true;
    }

    @GetMapping("/habitat/bebederos/rellenar/{habita_id}")
    public boolean rellenarBebederos(@PathVariable("habita_id") int id) {
        zoo.rellenarBebederos(id);
        return true;
    }


    @GetMapping("/habitat/bebedero/{habita_id}")
    public List<BebederoEntityDto> verBebederos(@PathVariable("habita_id") int habita_id) {
        return zoo.verBebederos(habita_id);
    }

    @GetMapping("/bebedero/{id}")
    public BebederoEntityDto verBebedero(@PathVariable("id") int id) {
        return zoo.verBebedero(id);
    }

    @GetMapping("/comedero/{id}")
    public BebederoEntityDto verComedero(@PathVariable("id") int id) {
        return zoo.verBebedero(id);
    }

    @GetMapping("/habitat/comedero/{habita_id}")

    public List<ComederoEntityDto> verComederos(@PathVariable("habita_id") int habita_id) {
        return zoo.verComederos(habita_id);
    }


    @GetMapping("/habitat/crear/{tipo}")
    public void crearhabitat(@PathVariable TipoHabitat tipo) {
        zoo.crearHabitat(tipo);
    }

    public void eliminarHabitat(int habita_id) {

    }

    @GetMapping("/trabajador/verTotalSueldos")
    public ResponseEntity<?> verTotalSueldos(HttpSession session) {
        return ResponseEntity.ok(zoo.verTotalSueldos(((PersonaEntityDto) session.getAttribute("user")).getId()));
    }

    public void despedirEmpleado(int empleado_id) {

    }

    @PostMapping(value = "/empleado/contratar", produces = MediaType.TEXT_PLAIN_VALUE)
    public void contratarEmpleado(@RequestBody EmpleadoJson empleadoNuevo, HttpSession session) {
        PersonaEntityDto persona = (PersonaEntityDto) session.getAttribute("user");
        empleadoNuevo.setIdJefe(persona.getId());
        zoo.contratarEmpleado(empleadoNuevo);

    }

    @PostMapping(value = "/jefe/contratar", produces = MediaType.TEXT_PLAIN_VALUE)

    public void contratarJefe(@RequestBody JefeJson jefeNuevo) {
        zoo.contratarJefe(jefeNuevo);

    }

    //funciona
//no se usasn

    @GetMapping("/habitat/animal/{id}")
    public List<AnimalEntityDto> veAnimalPorHabita(@PathVariable("id") int id) {
        return zoo.verAnimalesPorHabita(id);
    }

    @GetMapping("/habitats")
    public List<HabitatEntityDto> verInstalaciones() {
        return zoo.verInstalaciones();
    }

    @PostMapping(value = "/mensaje", produces = MediaType.APPLICATION_JSON_VALUE)
    public void enviarMensaje(@RequestBody MensajeEntityDto mensaje) {
        zoo.enviarMensaje(mensaje);


    }

    @GetMapping("/mensaje/{trabajadorId}")
    public List<MensajeEntityDto> consultarMensajesPorTrabajador(@PathVariable("trabajadorId") String trabajadorId) {
        return zoo.consultarMensajes(trabajadorId);
    }

    @PostMapping(value = "/habitat/comedero/modifcar", produces = MediaType.TEXT_PLAIN_VALUE)
    public void modificarEstadoComedero(@RequestBody ComederoEntityDto comedero, @RequestBody int cantidad) {
        zoo.modificarEstadoComedero(comedero, cantidad);
    }

    @PostMapping(value = "/habitat/bebedero/modifcar", produces = MediaType.TEXT_PLAIN_VALUE)
    public void modificarEstadoBebedero(@RequestBody BebederoJson bebedero) {
        zoo.modificarEstadoBebedero(bebedero);
    }
//no se usasn


}

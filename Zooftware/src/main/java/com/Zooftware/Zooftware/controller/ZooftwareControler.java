package com.Zooftware.Zooftware.controller;

import com.Zooftware.Zooftware.modelDTO.*;
import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;
import com.Zooftware.Zooftware.modelJPA.enums.Rol;
import com.Zooftware.Zooftware.modelJPA.enums.TipoHabitat;
import com.Zooftware.Zooftware.modelJPA.enums.TipoPersona;
import com.Zooftware.Zooftware.modelJPA.instalaciones.BebederoEntity;
import com.Zooftware.Zooftware.modelJPA.instalaciones.ComederoEntity;
import com.Zooftware.Zooftware.modelJPA.instalaciones.HabitatEntity;
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

//        IAccionesJefe accionesJefe = (IAccionesJefe) factoryMethodProxy.devolverProxy(TipoPersona.JEFE);
//
//        IAccionesEmpleado accionesEmpleado = (IAccionesEmpleado) factoryMethodProxy.devolverProxy(TipoPersona.EMPLEADO);
//
//        IAccionesCliente accionesCliente = (IAccionesCliente) factoryMethodProxy.devolverProxy(TipoPersona.CLIENTE);

//        zoo.cargar();

        //zoo.crearhabita(TipoHabitat.valueOf(tipoHabitat));

//
//        session.setAttribute("proxy", (IAccionesJefe) accionesCliente);


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

    @GetMapping("/allAnimalesJefe")
    public ModelAndView verAnimalesJefe(HttpSession session) {
        IAccionesJefe proxyJefe = (IAccionesJefe)  session.getAttribute("proxy");
        List<AnimalEntityDto> animales = proxyJefe.verAnimales();
        ModelAndView modelAndView = new ModelAndView("tablaAnimalJefe");
        modelAndView.addObject("animales", animales);
        return modelAndView;
    }

    @GetMapping("/allAnimalesEmpleado")
    public ModelAndView verAnimalesEmpleado(HttpSession session) {
        IAccionesEmpleado proxyJefe = (IAccionesEmpleado)  session.getAttribute("proxy");
        List<AnimalEntityDto> animales = proxyJefe.verAnimales();
        ModelAndView modelAndView = new ModelAndView("tablaAnimalEmpleado");
        modelAndView.addObject("animales", animales);
        return modelAndView;
    }

    @GetMapping("/allAnimalesCliente")
    public ModelAndView verAnimalesCliente(HttpSession session) {
        IAccionesCliente proxyJefe = (IAccionesCliente)  session.getAttribute("proxy");
        List<AnimalEntityDto> animales = proxyJefe.verAnimales();
        ModelAndView modelAndView = new ModelAndView("tablaAnimalCliente");
        modelAndView.addObject("animales", animales);
        return modelAndView;
    }



//funciona
    @PostMapping(value = "/comprarAnimal" ,produces = MediaType.TEXT_PLAIN_VALUE)
    public void comprarAnimal(@RequestBody AnimalJson animalJson, HttpSession session) {
        IAccionesJefe proxyJefe = (IAccionesJefe)  session.getAttribute("proxy");
        proxyJefe.comprarAnimal(animalJson);

    }

    //***
    @PostMapping(value = "/animal/comprobarEstado", produces = MediaType.TEXT_PLAIN_VALUE)
    public void ModificarEstadoAnimal(@RequestBody AnimalEntityDto animal) {
        zoo.ModificarEstadoAnimal(animal);
    }

    @GetMapping("/animal/ejercitarAnimalJefe/{id}")
    public ResponseEntity<String> ejercitarAnimalJefe(@PathVariable int id, HttpSession session) {
        try {
            IAccionesJefe proxyJefe = (IAccionesJefe)  session.getAttribute("proxy");
            // Aquí va la lógica para dar de comer al animal
            proxyJefe.ejercitarAnimal(id,10);

            // Retorna un mensaje de éxito
            return ResponseEntity.ok("Acción completada con éxito");
        } catch (Exception e) {
            // Manejo de excepciones, retorna un código de error
            return ResponseEntity.status(500).body("Error al realizar la acción");
        }
    }

    @GetMapping("/animal/ejercitarAnimalEmpleado/{id}")
    public ResponseEntity<String> ejercitarAnimalEmpleado(@PathVariable int id, HttpSession session) {
        try {
            IAccionesEmpleado proxyEmpleado = (IAccionesEmpleado)  session.getAttribute("proxy");
            // Aquí va la lógica para dar de comer al animal
            proxyEmpleado.ejercitarAnimal(id,10);

            // Retorna un mensaje de éxito
            return ResponseEntity.ok("Acción completada con éxito");
        } catch (Exception e) {
            // Manejo de excepciones, retorna un código de error
            return ResponseEntity.status(500).body("Error al realizar la acción");
        }
    }


    @GetMapping("/animal/dormirAnimalJefe/{id}")
    public ResponseEntity<String> dormirAnimalJefe(@PathVariable int id, HttpSession session) {
        try {
            IAccionesJefe proxyJefe = (IAccionesJefe)  session.getAttribute("proxy");

            // Aquí va la lógica para dar de comer al animal
            proxyJefe.dormirAnimal(id,10);

            // Retorna un mensaje de éxito
            return ResponseEntity.ok("Acción completada con éxito");
        } catch (Exception e) {
            // Manejo de excepciones, retorna un código de error
            return ResponseEntity.status(500).body("Error al realizar la acción");
        }
    }
    @GetMapping("/animal/dormirAnimalEmpleado/{id}")
    public ResponseEntity<String> dormirAnimalEmpleado(@PathVariable int id, HttpSession session) {
        try {
            IAccionesEmpleado proxyEmpleado = (IAccionesEmpleado)  session.getAttribute("proxy");

            // Aquí va la lógica para dar de comer al animal
            proxyEmpleado.dormirAnimal(id,10);

            // Retorna un mensaje de éxito
            return ResponseEntity.ok("Acción completada con éxito");
        } catch (Exception e) {
            // Manejo de excepciones, retorna un código de error
            return ResponseEntity.status(500).body("Error al realizar la acción");
        }
    }


    @GetMapping("/animal/darComerAnimalEmpleado/{id}")
    public ResponseEntity<String> darComerAnimalEmpleado(@PathVariable int id, HttpSession session) {
        try {
            IAccionesEmpleado proxyEmpleado = (IAccionesEmpleado)  session.getAttribute("proxy");

            // Aquí va la lógica para dar de comer al animal
            proxyEmpleado.darComerAnimal(id,10);

            // Retorna un mensaje de éxito
            return ResponseEntity.ok("Acción completada con éxito");
        } catch (Exception e) {
            // Manejo de excepciones, retorna un código de error
            return ResponseEntity.status(500).body("Error al realizar la acción");
        }

     }

    @GetMapping("/animal/darComerAnimalJefe/{id}")
    public ResponseEntity<String> darComerAnimalJefe(@PathVariable int id, HttpSession session) {
        try {
            IAccionesJefe proxyJefe = (IAccionesJefe)  session.getAttribute("proxy");

            // Aquí va la lógica para dar de comer al animal
            proxyJefe.darComerAnimal(id,10);

            // Retorna un mensaje de éxito
            return ResponseEntity.ok("Acción completada con éxito");
        } catch (Exception e) {
            // Manejo de excepciones, retorna un código de error
            return ResponseEntity.status(500).body("Error al realizar la acción");
        }

    }

    @GetMapping("/habitat/comederos/rellenarJefe/{id}")
    public boolean rellenarComederosJefe(@PathVariable("id") int id, HttpSession session) {
        IAccionesJefe proxyJefe = (IAccionesJefe)  session.getAttribute("proxy");
        proxyJefe.rellenarComederos(id);
        return true;
    }

    @GetMapping("/habitat/comederos/rellenarEmpleado/{id}")
    public boolean rellenarComederosEmpleado(@PathVariable("id") int id, HttpSession session) {
        IAccionesEmpleado proxyEmpleado = (IAccionesEmpleado)  session.getAttribute("proxy");
        proxyEmpleado.rellenarComederos(id);
        return true;
    }

    @GetMapping("/habitat/bebederos/rellenarJefe/{habita_id}")
    public boolean rellenarBebederosJefe(@PathVariable("habita_id") int id, HttpSession session) {
        IAccionesJefe proxyJefe= (IAccionesJefe)  session.getAttribute("proxy");
        proxyJefe.rellenarBebederos(id);
        return true;
    }

    @GetMapping("/habitat/bebederos/rellenarEmpleado/{habita_id}")
    public boolean rellenarBebederosEmpleado(@PathVariable("habita_id") int id, HttpSession session) {
        IAccionesEmpleado proxyEmpleado= (IAccionesEmpleado)  session.getAttribute("proxy");
        proxyEmpleado.rellenarBebederos(id);
        return true;
    }


    @GetMapping("/habitat/bebederoJefe/{habita_id}")
    public ModelAndView verBebederosJefe(@PathVariable int habita_id, HttpSession session) {
        IAccionesJefe proxyJefe= (IAccionesJefe)  session.getAttribute("proxy");
        List<BebederoEntityDto> bebederos = proxyJefe.verBebederos(habita_id);
        ModelAndView modelAndView = new ModelAndView("verBebederosHabitat");
        modelAndView.addObject("bebederos", bebederos);
        return modelAndView;
    }
    @GetMapping("/habitat/bebederoEmpleado/{habita_id}")
    public ModelAndView verBebederosEmpleado(@PathVariable int habita_id, HttpSession session) {
        IAccionesEmpleado proxyEmpleado= (IAccionesEmpleado)  session.getAttribute("proxy");
        List<BebederoEntityDto> bebederos = proxyEmpleado.verBebederos(habita_id);
        ModelAndView modelAndView = new ModelAndView("verBebederosHabitat");
        modelAndView.addObject("bebederos", bebederos);
        return modelAndView;
    }
    @GetMapping("/habitat/bebederoCliente/{habita_id}")
    public ModelAndView verBebederosCliente(@PathVariable int habita_id, HttpSession session) {
        IAccionesCliente proxyCliente= (IAccionesCliente)  session.getAttribute("proxy");
        List<BebederoEntityDto> bebederos = zoo.verBebederos(habita_id);
        ModelAndView modelAndView = new ModelAndView("verBebederosHabitat");
        modelAndView.addObject("bebederos", bebederos);
        return modelAndView;
    }

    @GetMapping("/bebedero/{id}")
    public BebederoEntityDto verBebedero(@PathVariable("id") int id) {
        return zoo.verBebedero(id);
    }

    @GetMapping("/comedero/{id}")
    public BebederoEntityDto verComedero(@PathVariable("id") int id) {
        return zoo.verBebedero(id);
    }

    @GetMapping("/habitat/comederoJefe/{habita_id}")
    public ModelAndView verComederosJefe(@PathVariable int habita_id, HttpSession session) {
        IAccionesJefe proxyJefe= (IAccionesJefe)  session.getAttribute("proxy");
        List<ComederoEntityDto> comederos = proxyJefe.verComederos(habita_id);
        ModelAndView modelAndView = new ModelAndView("verComederosHabitat");
        modelAndView.addObject("comederos", comederos);
        return modelAndView;
    }
    @GetMapping("/habitat/comederoEmpleado/{habita_id}")
    public ModelAndView verComederosEmpleado(@PathVariable int habita_id, HttpSession session) {
        IAccionesEmpleado proxyEmpleado= (IAccionesEmpleado)  session.getAttribute("proxy");
        List<ComederoEntityDto> comederos = proxyEmpleado.verComederos(habita_id);
        ModelAndView modelAndView = new ModelAndView("verComederosHabitat");
        modelAndView.addObject("comederos", comederos);
        return modelAndView;
    }
    @GetMapping("/habitat/comederoCliente/{habita_id}")
    public ModelAndView verComederosCliente(@PathVariable int habita_id, HttpSession session) {
        IAccionesCliente proxyCliente= (IAccionesCliente)  session.getAttribute("proxy");
        List<ComederoEntityDto> comederos = proxyCliente.verComederos(habita_id);
        ModelAndView modelAndView = new ModelAndView("verComederosHabitat");
        modelAndView.addObject("comederos", comederos);
        return modelAndView;
    }


    @GetMapping("/habitat/crear")
    public void crearhabitat(@RequestParam(name = "tipoHabitat") TipoHabitat tipo, HttpSession session) {
        IAccionesJefe proxyJefe = (IAccionesJefe)  session.getAttribute("proxy");
        proxyJefe.crearHabitat(tipo);
    }

    public void eliminarHabitat(int habita_id) {
    }

    @GetMapping("/trabajador/verTotalSueldos")
    public ResponseEntity<?> verTotalSueldos(HttpSession session) {
        IAccionesJefe proxyJefe = (IAccionesJefe)  session.getAttribute("proxy");
        return ResponseEntity.ok(proxyJefe.verTotalSueldos(((PersonaEntityDto) session.getAttribute("user")).getId()));
    }

    public void despedirEmpleado(int empleado_id) {

    }

    @PostMapping(value = "/empleado/contratar", produces = MediaType.TEXT_PLAIN_VALUE)
    public void contratarEmpleado(@RequestBody EmpleadoJson empleadoNuevo, HttpSession session) {
        PersonaEntityDto persona = (PersonaEntityDto) session.getAttribute("user");
        IAccionesJefe proxyJefe = (IAccionesJefe)  session.getAttribute("proxy");
        empleadoNuevo.setIdJefe(persona.getId());
        proxyJefe.contratarEmpleado(empleadoNuevo);

    }

    @PostMapping(value = "/jefe/contratar", produces = MediaType.TEXT_PLAIN_VALUE)
    public void contratarJefe(@RequestBody JefeJson jefeNuevo, HttpSession session) {
        IAccionesJefe proxyJefe = (IAccionesJefe)  session.getAttribute("proxy");
        PersonaEntityDto persona = (PersonaEntityDto) session.getAttribute("user");
        jefeNuevo.setIdJefe(persona.getId());
        proxyJefe.contratarJefe(jefeNuevo);

    }

    //funciona
//no se usasn

    @GetMapping("/habitat/animalJefe/{id}")
    public ModelAndView veAnimalPorHabitaJefe(@PathVariable int id, HttpSession session) {
        IAccionesJefe proxyJefe = (IAccionesJefe)  session.getAttribute("proxy");
        List<AnimalEntityDto> animalesHabitat = proxyJefe.verAnimalesPorHabita(id);
        ModelAndView modelAndView = new ModelAndView("verAnimalesHabitat");
        modelAndView.addObject("animalesHabitat", animalesHabitat);
        return modelAndView;
    }
    @GetMapping("/habitat/animalEmpleado/{id}")
    public ModelAndView veAnimalPorHabitaEmpleado(@PathVariable int id, HttpSession session) {
        IAccionesEmpleado proxyEmpleado = (IAccionesEmpleado)  session.getAttribute("proxy");
        List<AnimalEntityDto> animalesHabitat = proxyEmpleado.verAnimalesPorHabita(id);
        ModelAndView modelAndView = new ModelAndView("verAnimalesHabitat");
        modelAndView.addObject("animalesHabitat", animalesHabitat);
        return modelAndView;
    }
    @GetMapping("/habitat/animalCliente/{id}")
    public ModelAndView veAnimalPorHabitaCliente(@PathVariable int id, HttpSession session) {
        IAccionesCliente proxyCliente = (IAccionesCliente)  session.getAttribute("proxy");
        List<AnimalEntityDto> animalesHabitat = proxyCliente.verAnimalesPorHabita(id);
        ModelAndView modelAndView = new ModelAndView("verAnimalesHabitat");
        modelAndView.addObject("animalesHabitat", animalesHabitat);
        return modelAndView;
    }

    @GetMapping("/habitat/plantaJefe/{id}")
    public ModelAndView verPlantasPorHabitatJefe(@PathVariable int id, HttpSession session) {
        IAccionesJefe proxyJefe = (IAccionesJefe)  session.getAttribute("proxy");
        List<PlantaEntityDto> plantasHabitat = proxyJefe.verPlantasPorHabita(id);
        ModelAndView modelAndView = new ModelAndView("verPlantasHabitat");
        modelAndView.addObject("plantasHabitat", plantasHabitat);
        return modelAndView;
    }
    @GetMapping("/habitat/plantaEmpleado/{id}")
    public ModelAndView verPlantasPorHabitatEmpleado(@PathVariable int id, HttpSession session) {
        IAccionesEmpleado proxyEmpleado = (IAccionesEmpleado)  session.getAttribute("proxy");
        List<PlantaEntityDto> plantasHabitat = proxyEmpleado.verPlantasPorHabita(id);
        ModelAndView modelAndView = new ModelAndView("verPlantasHabitat");
        modelAndView.addObject("plantasHabitat", plantasHabitat);
        return modelAndView;
    }

    @GetMapping("/habitat/plantaCliente/{id}")
    public ModelAndView verPlantasPorHabitatCliente(@PathVariable int id, HttpSession session) {
        IAccionesCliente proxyCliente= (IAccionesCliente)  session.getAttribute("proxy");
        List<PlantaEntityDto> plantasHabitat = proxyCliente.verPlantasPorHabita(id);
        ModelAndView modelAndView = new ModelAndView("verPlantasHabitat");
        modelAndView.addObject("plantasHabitat", plantasHabitat);
        return modelAndView;
    }


    @GetMapping("/habitatsJefe")
    public ModelAndView verInstalacionesJefe(HttpSession session) {
        IAccionesJefe proxyJefe = (IAccionesJefe)  session.getAttribute("proxy");
        List<HabitatEntityDto> habitats = proxyJefe.verInstalaciones();
        ModelAndView modelAndView = new ModelAndView("tablaInstalacionJefe");
        modelAndView.addObject("habitats", habitats);
        return modelAndView;
    }
    @GetMapping("/habitatsEmpleado")
    public ModelAndView verInstalacionesEmpleado(HttpSession session) {
        IAccionesEmpleado proxyEmpleado = (IAccionesEmpleado)  session.getAttribute("proxy");
        List<HabitatEntityDto> habitats = proxyEmpleado.verInstalaciones();
        ModelAndView modelAndView = new ModelAndView("tablaInstalacionEmpleado");
        modelAndView.addObject("habitats", habitats);
        return modelAndView;
    }
    @GetMapping("/habitatsCliente")
    public ModelAndView verInstalacionesCliente(HttpSession session) {
        IAccionesCliente proxyCliente = (IAccionesCliente)  session.getAttribute("proxy");
        List<HabitatEntityDto> habitats = proxyCliente.verInstalaciones();
        ModelAndView modelAndView = new ModelAndView("tablaInstalacionCliente");
        modelAndView.addObject("habitats", habitats);
        return modelAndView;
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

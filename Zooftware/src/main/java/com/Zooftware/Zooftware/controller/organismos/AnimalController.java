package com.Zooftware.Zooftware.controller.organismos;

import com.Zooftware.Zooftware.model.dto.organismo.AnimalEntityDto;
import com.Zooftware.Zooftware.model.services.patrones.adapter.AnimalJson;
import com.Zooftware.Zooftware.model.services.patrones.proxy.IAccionesCliente;
import com.Zooftware.Zooftware.model.services.patrones.proxy.IAccionesEmpleado;
import com.Zooftware.Zooftware.model.services.patrones.proxy.IAccionesJefe;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/animal")
public class AnimalController {



    @GetMapping("/mostrarTablaAnimalJefe")
    public ModelAndView mostrarLogin(){
        ModelAndView modelAndView = new ModelAndView("tablaAnimalJefe");
        return modelAndView;
    }

    @GetMapping("/mostrarTablaAnimalEmpleado")
    public ModelAndView mostrarTablaAnimalEmpleado(){
        ModelAndView modelAndView = new ModelAndView("tablaAnimalEmpleado");

        return modelAndView;
    }

    @GetMapping("/mostrarTablaAnimalCliente")
    public ModelAndView mostrarTablaAnimalCliente(){
        ModelAndView modelAndView = new ModelAndView("tablaAnimalCliente");
        return modelAndView;
    }

    @GetMapping("/mostrarCompraAnimal")
    public ModelAndView mostrarCompraAnimal(){
        ModelAndView modelAndView = new ModelAndView("comprarAnimal");
        return modelAndView;
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView excepcion(Exception exception){
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("mensajeError",exception.getMessage());
        return modelAndView;
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
    @PostMapping(value = "/comprarAnimal" ,produces = MediaType.TEXT_PLAIN_VALUE)
    public void comprarAnimal(@RequestBody AnimalJson animalJson, HttpSession session) {
        IAccionesJefe proxyJefe = (IAccionesJefe)  session.getAttribute("proxy");
        proxyJefe.comprarAnimal(animalJson);

    }
    @PostMapping(value = "/animal/comprobarEstado", produces = MediaType.TEXT_PLAIN_VALUE)
    public void ModificarEstadoAnimal(@RequestBody AnimalEntityDto animal,HttpSession session) {
        IAccionesJefe proxyJefe = (IAccionesJefe)  session.getAttribute("proxy");
        proxyJefe.ModificarEstadoAnimal(animal);
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

}

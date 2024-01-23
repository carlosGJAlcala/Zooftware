package com.Zooftware.Zooftware.controller.instalaciones;

import com.Zooftware.Zooftware.model.dto.comida.BebederoEntityDto;
import com.Zooftware.Zooftware.model.dto.comida.ComederoEntityDto;
import com.Zooftware.Zooftware.model.dto.instalaciones.HabitatEntityDto;
import com.Zooftware.Zooftware.model.dto.organismo.AnimalEntityDto;
import com.Zooftware.Zooftware.model.dto.organismo.PlantaEntityDto;
import com.Zooftware.Zooftware.model.entities.enums.TipoHabitat;
import com.Zooftware.Zooftware.model.services.patrones.proxy.IAccionesCliente;
import com.Zooftware.Zooftware.model.services.patrones.proxy.IAccionesEmpleado;
import com.Zooftware.Zooftware.model.services.patrones.proxy.IAccionesJefe;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/instalacion")
public class InstalacionesController {

    @Autowired
    IAccionesJefe zoo;

    @GetMapping("/mostrar")
    public ModelAndView mostrarLogin() {
        ModelAndView modelAndView = new ModelAndView("gestionInstalacion");
        return modelAndView;
    }

    @GetMapping("/mostrarTablaInstalacionesJefe")
    public ModelAndView mostrarTablaInstalaciones() {
        ModelAndView modelAndView = new ModelAndView("tablaInstalacionJefe");
        return modelAndView;
    }

    @GetMapping("/mostrarTablaInstalacionesEmpleado")
    public ModelAndView mostrarTablaInstalacionesEmpleado() {
        ModelAndView modelAndView = new ModelAndView("tablaInstalacionEmpleado");
        return modelAndView;
    }

    @GetMapping("/mostrarTablaInstalacionesCliente")
    public ModelAndView mostrarTablaInstalacionesCliente() {
        ModelAndView modelAndView = new ModelAndView("tablaInstalacionCliente");
        return modelAndView;
    }


    @ExceptionHandler(Exception.class)
    public ModelAndView excepcion(Exception exception) {
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("mensajeError", exception.getMessage());
        return modelAndView;
    }


    @GetMapping("/habitat/comederos/rellenarJefe/{id}")
    public ModelAndView rellenarComederosJefe(@PathVariable("id") int id, HttpSession session) {
        ModelAndView model = new ModelAndView("tablaInstalacionJefe");
        IAccionesJefe proxyJefe = (IAccionesJefe) session.getAttribute("proxy");
        proxyJefe.rellenarComederos(id);
        return model;
    }

    @GetMapping("/habitat/comederos/rellenarEmpleado/{id}")
    public ModelAndView rellenarComederosEmpleado(@PathVariable("id") int id, HttpSession session) {
        ModelAndView model = new ModelAndView("tablaInstalacionJefe");
        IAccionesEmpleado proxyEmpleado = (IAccionesEmpleado) session.getAttribute("proxy");
        proxyEmpleado.rellenarComederos(id);
        return model;
    }

    @GetMapping("/habitat/bebederos/rellenarJefe/{habita_id}")
    public ModelAndView rellenarBebederosJefe(@PathVariable("habita_id") int id, HttpSession session) {
        ModelAndView model = new ModelAndView("tablaInstalacionJefe");
        IAccionesJefe proxyJefe = (IAccionesJefe) session.getAttribute("proxy");
        proxyJefe.rellenarBebederos(id);
        return model;
    }

    @GetMapping("/habitat/bebederos/rellenarEmpleado/{habita_id}")
    public boolean rellenarBebederosEmpleado(@PathVariable("habita_id") int id, HttpSession session) {
        IAccionesEmpleado proxyEmpleado = (IAccionesEmpleado) session.getAttribute("proxy");
        proxyEmpleado.rellenarBebederos(id);
        return true;
    }


    @GetMapping("/habitat/bebederoJefe/{habita_id}")
    public ModelAndView verBebederosJefe(@PathVariable int habita_id, HttpSession session) {
        IAccionesJefe proxyJefe = (IAccionesJefe) session.getAttribute("proxy");
        List<BebederoEntityDto> bebederos = proxyJefe.verBebederos(habita_id);
        ModelAndView modelAndView = new ModelAndView("verBebederosHabitat");
        modelAndView.addObject("bebederos", bebederos);
        return modelAndView;
    }

    @GetMapping("/habitat/bebederoEmpleado/{habita_id}")
    public ModelAndView verBebederosEmpleado(@PathVariable int habita_id, HttpSession session) {
        IAccionesEmpleado proxyEmpleado = (IAccionesEmpleado) session.getAttribute("proxy");
        List<BebederoEntityDto> bebederos = proxyEmpleado.verBebederos(habita_id);
        ModelAndView modelAndView = new ModelAndView("verBebederosHabitat");
        modelAndView.addObject("bebederos", bebederos);
        return modelAndView;
    }

    @GetMapping("/habitat/bebederoCliente/{habita_id}")
    public ModelAndView verBebederosCliente(@PathVariable int habita_id, HttpSession session) {
        IAccionesCliente proxyCliente = (IAccionesCliente) session.getAttribute("proxy");
        List<BebederoEntityDto> bebederos = zoo.verBebederos(habita_id);
        ModelAndView modelAndView = new ModelAndView("verBebederosHabitat");
        modelAndView.addObject("bebederos", bebederos);
        return modelAndView;
    }

    @GetMapping("/habitat/comederoJefe/{habita_id}")
    public ModelAndView verComederosJefe(@PathVariable int habita_id, HttpSession session) {
        IAccionesJefe proxyJefe = (IAccionesJefe) session.getAttribute("proxy");
        List<ComederoEntityDto> comederos = proxyJefe.verComederos(habita_id);
        ModelAndView modelAndView = new ModelAndView("verComederosHabitat");
        modelAndView.addObject("comederos", comederos);
        return modelAndView;
    }

    @GetMapping("/habitat/comederoEmpleado/{habita_id}")
    public ModelAndView verComederosEmpleado(@PathVariable int habita_id, HttpSession session) {
        IAccionesEmpleado proxyEmpleado = (IAccionesEmpleado) session.getAttribute("proxy");
        List<ComederoEntityDto> comederos = proxyEmpleado.verComederos(habita_id);
        ModelAndView modelAndView = new ModelAndView("verComederosHabitat");
        modelAndView.addObject("comederos", comederos);
        return modelAndView;
    }

    @GetMapping("/habitat/comederoCliente/{habita_id}")
    public ModelAndView verComederosCliente(@PathVariable int habita_id, HttpSession session) {
        IAccionesCliente proxyCliente = (IAccionesCliente) session.getAttribute("proxy");
        List<ComederoEntityDto> comederos = proxyCliente.verComederos(habita_id);
        ModelAndView modelAndView = new ModelAndView("verComederosHabitat");
        modelAndView.addObject("comederos", comederos);
        return modelAndView;
    }

    @GetMapping("/habitat/crear")
    public void crearhabitat(@RequestParam(name = "tipoHabitat") TipoHabitat tipo, HttpSession session) {
        IAccionesJefe proxyJefe = (IAccionesJefe) session.getAttribute("proxy");
        proxyJefe.crearHabitat(tipo);
    }

    @GetMapping("/habitat/animalJefe/{id}")
    public ModelAndView veAnimalPorHabitaJefe(@PathVariable int id, HttpSession session) {
        IAccionesJefe proxyJefe = (IAccionesJefe) session.getAttribute("proxy");
        List<AnimalEntityDto> animalesHabitat = proxyJefe.verAnimalesPorHabita(id);
        ModelAndView modelAndView = new ModelAndView("verAnimalesHabitat");
        modelAndView.addObject("animalesHabitat", animalesHabitat);
        return modelAndView;
    }

    @GetMapping("/habitat/animalEmpleado/{id}")
    public ModelAndView veAnimalPorHabitaEmpleado(@PathVariable int id, HttpSession session) {
        IAccionesEmpleado proxyEmpleado = (IAccionesEmpleado) session.getAttribute("proxy");
        List<AnimalEntityDto> animalesHabitat = proxyEmpleado.verAnimalesPorHabita(id);
        ModelAndView modelAndView = new ModelAndView("verAnimalesHabitat");
        modelAndView.addObject("animalesHabitat", animalesHabitat);
        return modelAndView;
    }

    @GetMapping("/habitat/animalCliente/{id}")
    public ModelAndView veAnimalPorHabitaCliente(@PathVariable int id, HttpSession session) {
        IAccionesCliente proxyCliente = (IAccionesCliente) session.getAttribute("proxy");
        List<AnimalEntityDto> animalesHabitat = proxyCliente.verAnimalesPorHabita(id);
        ModelAndView modelAndView = new ModelAndView("verAnimalesHabitat");
        modelAndView.addObject("animalesHabitat", animalesHabitat);
        return modelAndView;
    }

    @GetMapping("/habitat/plantaJefe/{id}")
    public ModelAndView verPlantasPorHabitatJefe(@PathVariable int id, HttpSession session) {
        IAccionesJefe proxyJefe = (IAccionesJefe) session.getAttribute("proxy");
        List<PlantaEntityDto> plantasHabitat = proxyJefe.verPlantasPorHabita(id);
        ModelAndView modelAndView = new ModelAndView("verPlantasHabitat");
        modelAndView.addObject("plantasHabitat", plantasHabitat);
        return modelAndView;
    }

    @GetMapping("/habitat/plantaEmpleado/{id}")
    public ModelAndView verPlantasPorHabitatEmpleado(@PathVariable int id, HttpSession session) {
        IAccionesEmpleado proxyEmpleado = (IAccionesEmpleado) session.getAttribute("proxy");
        List<PlantaEntityDto> plantasHabitat = proxyEmpleado.verPlantasPorHabita(id);
        ModelAndView modelAndView = new ModelAndView("verPlantasHabitat");
        modelAndView.addObject("plantasHabitat", plantasHabitat);
        return modelAndView;
    }

    @GetMapping("/habitat/plantaCliente/{id}")
    public ModelAndView verPlantasPorHabitatCliente(@PathVariable int id, HttpSession session) {
        IAccionesCliente proxyCliente = (IAccionesCliente) session.getAttribute("proxy");
        List<PlantaEntityDto> plantasHabitat = proxyCliente.verPlantasPorHabita(id);
        ModelAndView modelAndView = new ModelAndView("verPlantasHabitat");
        modelAndView.addObject("plantasHabitat", plantasHabitat);
        return modelAndView;
    }


    @GetMapping("/habitatsJefe")
    public ModelAndView verInstalacionesJefe(HttpSession session) {
        IAccionesJefe proxyJefe = (IAccionesJefe) session.getAttribute("proxy");
        List<HabitatEntityDto> habitats = proxyJefe.verInstalaciones();
        ModelAndView modelAndView = new ModelAndView("tablaInstalacionJefe");
        modelAndView.addObject("habitats", habitats);
        return modelAndView;
    }

    @GetMapping("/habitatsEmpleado")
    public ModelAndView verInstalacionesEmpleado(HttpSession session) {
        IAccionesEmpleado proxyEmpleado = (IAccionesEmpleado) session.getAttribute("proxy");
        List<HabitatEntityDto> habitats = proxyEmpleado.verInstalaciones();
        ModelAndView modelAndView = new ModelAndView("tablaInstalacionEmpleado");
        modelAndView.addObject("habitats", habitats);
        return modelAndView;
    }

    @GetMapping("/habitatsCliente")
    public ModelAndView verInstalacionesCliente(HttpSession session) {
        IAccionesCliente proxyCliente = (IAccionesCliente) session.getAttribute("proxy");
        List<HabitatEntityDto> habitats = proxyCliente.verInstalaciones();
        ModelAndView modelAndView = new ModelAndView("tablaInstalacionCliente");
        modelAndView.addObject("habitats", habitats);
        return modelAndView;
    }


}

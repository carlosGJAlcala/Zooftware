package com.Zooftware.Zooftware.patrones.facade;


import com.Zooftware.Zooftware.modelDAO.*;
import com.Zooftware.Zooftware.modelDTO.*;
import com.Zooftware.Zooftware.modelJPA.enums.*;
import com.Zooftware.Zooftware.modelJPA.instalaciones.BebederoEntity;
import com.Zooftware.Zooftware.modelJPA.instalaciones.ComederoEntity;
import com.Zooftware.Zooftware.modelJPA.organimos.AnimalEntity;
import com.Zooftware.Zooftware.modelJPA.persona.ContactoEntity;
import com.Zooftware.Zooftware.modelJPA.persona.EmpleadoEntity;
import com.Zooftware.Zooftware.modelJPA.persona.TrabajadorEntity;
import com.Zooftware.Zooftware.patrones.AbstractFactory.InstalacionFactory;
import com.Zooftware.Zooftware.patrones.adapter.*;
import com.Zooftware.Zooftware.patrones.mediator.MediadorConcreto;
import com.Zooftware.Zooftware.patrones.mediator.Mediator;
import com.Zooftware.Zooftware.patrones.proxy.IAccionesJefe;
import com.Zooftware.Zooftware.patrones.state.Animal;
import com.Zooftware.Zooftware.patrones.strategy.Alimentar;
import com.Zooftware.Zooftware.patrones.strategy.Contexto;
import com.Zooftware.Zooftware.patrones.strategy.Estrategia;
import com.Zooftware.Zooftware.patrones.strategy.RellenarBebederos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:10
 */
@Service
public class Zooftware implements IAccionesJefe {
    @Autowired
    IAnimalDAO animalDAO;


    @Autowired
    IHabitatDAO habitatDAO;
    @Autowired
    ITrabajadorDAO trabajadorDAO;
    @Autowired
    IEmpleadoDAO empleadoDAO;
    @Autowired
    IJefeDAO jefeDAO;
    @Autowired
    IBebederoDAO bebederoDAO;
    @Autowired
    IComederoDAO comederoDAO;
    @Autowired
    IMensajeDAO mensajeDAO;
    @Autowired
    IContactoDAO contactoDAO;
    @Autowired
    IComidaDAO comidaDAO;


    Contexto contextotarea;
    Estrategia estrategia;

    @Autowired
    IAcuaticoDAO habitaAcuatio;
    @Autowired

    ITerrestreDAO terrestreDAO;
    @Autowired

    IAnfibioDAO anfibioDAO;


    @Autowired
    InstalacionFactory fabricadeHabitas;
    Mediator mediator;

    @Autowired
    InstalacionFactory fabricaHabitas;
    List<TrabajadorEntityDto> trabajadores;
    List<Animal> animales;
    List<HabitatEntityDto> habitatEntityDtos;

    private int id_habita;


    public Zooftware() {
        //fabricaHabitas=new instalacionFactoryConcreta();
        mediator = new MediadorConcreto();
        contextotarea = new Contexto();
        //fabricadeHabitas= new instalacionFactoryConcreta();

    }

    @Override
    public void cargar() {
	/*	fabricadeHabitas.crearHabitaAnfibio();
		fabricadeHabitas.crerAcuarioAguaSalada();
		fabricadeHabitas.crerAcuarioAguaDulce();*/
        fabricadeHabitas.crearHabitaTerrestre();
        //AnimalEntityDto animalprueba= new AnimalEntityDto("Leon",EstadoAnimal.FELIZ, TipoAnimal.TERRESTRE,1,4,50,50,50,50);
/*
fabricadeHabitas.crearHabitaAnfibio();
		fabricadeHabitas.crearHabitaAnfibio();
		fabricadeHabitas.crerAcuarioAguaDulce();*/

        fabricadeHabitas.crearHabitaAnfibio();
    }

    @Override
    public void crearAlmacen(){
        fabricadeHabitas.crearAlmacen();
    }


    @Override
    public List<AnimalEntityDto> verAnimales() {
        return animalDAO.verAnimales();
    }

    @Override
    public List<HabitatEntityDto> verInstalaciones() {
        return null;
    }


    @Override
    public void enviarMensaje(MensajeEntityDto mensaje) {
        mediator.enviar(mensaje, mensaje.getDestinario());
        mensajeDAO.guardarMensaje(mensaje);

    }


    @Override
    public List<MensajeEntityDto> consultarMensajes(String trabajadorId) {
        return null;
    }

    @Override
    public EstadoAnimal ComprobarEstadoAnimal(int id) {
        return animalDAO.buscarPorId(id).getEstadoAnimal();

    }

    @Override
    public void ModificarEstadoAnimal(AnimalEntityDto animal) {
        animalDAO.actualizarAnimal(animal);

    }

    @Override
    public void ejercitarAnimal(int id, int cantidad) {
        Animal animal = new AnimalDTOToAnimalState(animalDAO.buscarPorId(id));
        animal.hacerEjercicio(cantidad);
        animalDAO.actualizarAnimalEstado(animal);

    }

    @Override
    public void dormirAnimal(int id, int cantidad) {
        Animal animal = new AnimalDTOToAnimalState(animalDAO.buscarPorId(id));
        animal.dormir(cantidad);
        animalDAO.actualizarAnimalEstado(animal);
    }

    @Override
    public void darComerAnimal(int id, int cantidad) {
		Animal animal = new AnimalDTOToAnimalState(animalDAO.buscarPorId(id));

        animal.darComida(cantidad);
        animalDAO.actualizarAnimalEstado(animal);

    }

    @Override
    public void rellenarComederos(int habita_id) {
        HabitatEntityDto habita = habitatDAO.buscarPorId(habita_id);
        ComidaEntityDto comida;
        estrategia = new Alimentar();
        List<ComederoEntityDto> comederoEntityDtos = comederoDAO.verComederos(habita_id);
        List<ComederoEntityDto> comederosRellenos = (List<ComederoEntityDto>) estrategia.ejecutar(comederoEntityDtos);
        for (ComederoEntityDto comederoEntityDto : comederosRellenos) {
            comederoEntityDto.setHabitat(habita);
            comederoEntityDto.setCantidad(100);
            comida= comederoEntityDto.getComida();
            comida.setComederoEntity(comederoEntityDto);
            comederoEntityDto.setComida(comidaDAO.actualizarComida(comida));
            comederoDAO.actualizarComedero(comederoEntityDto);
        }

    }
    @Override
    public void rellenarBebederos(int habita_id) {
        estrategia = new RellenarBebederos();
        List<BebederoEntityDto> bebederoEntityDtos = bebederoDAO.verBebederos(habita_id);
        List<BebederoEntityDto> bebederosRellenos = (List<BebederoEntityDto>) estrategia.ejecutar(bebederoEntityDtos);
        bebederosRellenos.stream().forEach(bebederoEntityDto -> bebederoDAO.actualizarBebedero(bebederoEntityDto));

    }

    @Override
    public List<BebederoEntityDto> verBebederos(int habita_id) {


        return bebederoDAO.verBebederos(habita_id);
    }

    @Override
    public BebederoEntityDto verBebedero(int id) {

        return bebederoDAO.buscarPorId(id);
    }


    @Override
    public List<ComederoEntityDto> verComederos(int habita_id) {


        List<ComederoEntityDto> comederos = comederoDAO.verComederos(habita_id);
        return comederos;


    }

    @Override
    public void modificarEstadoComedero(ComederoEntityDto comedero, int cantidad) {
        comederoDAO.actualizarComedero(comedero);
    }

    @Override
    public void modificarEstadoBebedero(BebederoJson bebedero) {
        BebederoJsonToDTO bebederoJsonToDTO = new BebederoJsonToDTO(bebedero);
        bebederoDAO.actualizarBebedero(bebederoJsonToDTO);

    }

    @Override
    public void comprarAnimal(AnimalJson animalJson) {
        AnimalJsonToDTo animal = new AnimalJsonToDTo(animalJson);
        int id_habita = animal.getId_habita();
        TipoAnimal tipo = animal.getTipo();

//
//        switch (tipo) {
//            case ANFIBIO:
//                AnfibioEntityDto habita = (AnfibioEntityDto) habitatDAO.buscarPorId(id_habita);
//                animal.setHabitat(habita);
//                break;
//            case ACUATICO:
//                AcuaticoEntityDto habita1 = (AcuaticoEntityDto) habitatDAO.buscarPorId(id_habita);
//                animal.setHabitat(habita1);
//                break;
//            case TERRESTRE:
//                TerrestreEntityDto habita2 =(TerrestreEntityDto) habitatDAO.buscarPorId(id_habita);
//                animal.setHabitat(habita2);
//                break;
//        }
        HabitatEntityDto habita = habitatDAO.buscarPorId(id_habita);
        animal.setHabitat(habita);

        animalDAO.guardarAnimal(animal);


    }

    @Override
    public void crearHabitat(TipoHabitat tipo) {
        switch (tipo) {
            case ANFIBIO:
                fabricadeHabitas.crearHabitaAnfibio();
                break;
            case ACTUATICO_DULCE:
                fabricadeHabitas.crerAcuarioAguaDulce();

                break;
            case ACTUATICO_SALADO:
                fabricadeHabitas.crerAcuarioAguaSalada();

                break;
            case TERRESTRE:
                fabricadeHabitas.crearHabitaTerrestre();

                break;

        }


    }

    @Override
    public void eliminarHabita(int habita_id) {

        habitatDAO.eliminarHabitat(habita_id);

    }

//    @Override
//    public double verTotalSueldos(int empleado_id) {
//
//        TrabajadorEntityDto trabajadorEntityDto = calcularEmpleado(empleado_id);
//        if (trabajadorEntityDto instanceof JefeEntityDto) {
//            JefeEntityDto jefeEntityDto = (JefeEntityDto) trabajadorEntityDto;
//            List<TrabajadorEntity> trabajadores = trabajadorDAO.buscarPorJefe(empleado_id);
//            List<TrabajadorEntityDto> trabajadorEntityDtos = trabajadores.stream().map(trabajador -> this.calcularEmpleado(trabajador.getId())).collect(Collectors.toList());
//            jefeEntityDto.setSubordinados(trabajadorEntityDtos);
//        }
//
//        return trabajadorEntityDto.calcularSalario();
//
//    }

    public TrabajadorEntityDto calcularEmpleado(int empleado_id) {
        TrabajadorEntity trabajador = trabajadorDAO.buscarPorId(empleado_id);
        TrabajadorEntityDto trabajadorEntityDto;
        Rol rol = trabajador.getRol();
        switch (rol) {
            case EMPLEADO:
                return empleadoDAO.buscarPorId(empleado_id);
            case JEFE:
                return jefeDAO.buscarPorId(empleado_id);
            default:
                break;
        }
        return null;
    }


    private double obtenerSueldoSubordinados(int idJefe){
        List<TrabajadorEntity> tr = trabajadorDAO.buscarPorJefe(idJefe);
        double sueldoTotalSubordinados = 0;
        for(TrabajadorEntity tra: tr){
            if (tra.getRol().equals(Rol.EMPLEADO))
                sueldoTotalSubordinados += tra.getSalario();
        }

        return sueldoTotalSubordinados;
    }

    @Override
    public double verTotalSueldos(int empleadoId) {
        return calcularSalarioEmpleado(empleadoId);
    }

    private double calcularSalarioEmpleado(int Id) {
        TrabajadorEntityDto jefeAlto = jefeDAO.buscarPorId(Id);
        double salarioTotal = jefeAlto.getSalario();
        List<TrabajadorEntity> tr = trabajadorDAO.buscarPorJefe(Id);
        List<TrabajadorEntity> aux = new ArrayList<>();
        if(tr != null && !tr.isEmpty()){
            for(TrabajadorEntity tra: tr){
                if (tra instanceof EmpleadoEntity) {
                    salarioTotal += tra.getSalario();
                    aux.add(tra);
                }
            }
            for(TrabajadorEntity auxTrab : aux)
                tr.remove(auxTrab);
        }
        //Jefes
        if(tr != null && !tr.isEmpty())
            for(TrabajadorEntity tra: tr)
                salarioTotal += calcularSalarioEmpleado(tra.getId());
        return salarioTotal;
    }





    @Override
    public void despedirEmpleado(int empleado_id) {

        trabajadorDAO.eliminarTrabajador(empleado_id);

    }

    @Override
    public void contratarEmpleado(EmpleadoJson empleadoNuevo) {
        EmpleadoJSONToDTO empleado = new EmpleadoJSONToDTO(empleadoNuevo);

        empleado.setJefe(jefeDAO.getJefeById(empleadoNuevo.getIdJefe()));


        ContactoEntityDto contacto = new ContactoEntityDto(empleadoNuevo.getCorreo(), empleadoNuevo.getNumeroTlf());
        ContactoEntity contactoEntity = contactoDAO.guardarContacto(contacto);
        contacto = contactoDAO.buscarPorId(contactoEntity.getId());

        empleado.setContacto(contacto);

        empleadoDAO.guardarEmpleado(empleado);
    }

    @Override
    public void contratarJefe(JefeJson jefe) {
        JefeEntityDto jefeDto = new JefeJSONToDTO(jefe);
        contactoDAO.guardarContacto(jefeDto.getContacto());
        jefeDAO.guardarJefe(jefeDto);


    }

    @Override
    public void modificarEmpleado(int empleado_id, TipoPersona tipo) {


    }

    @Override
    public AnimalEntityDto VerAnimal(int id_animal) {
        return animalDAO.buscarPorId(id_animal);
    }

    @Override
    public List<AnimalEntityDto> verAnimalesPorHabita(int id_habita) {
        return animalDAO.verAnimalesPorHabita(id_habita);
    }


}//end Zooftware
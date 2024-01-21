package com.Zooftware.Zooftware.patrones.facade;


import com.Zooftware.Zooftware.modelDAO.*;
import com.Zooftware.Zooftware.modelDTO.*;
import com.Zooftware.Zooftware.modelJPA.enums.*;
import com.Zooftware.Zooftware.patrones.AbstractFactory.InstalacionFactory;
import com.Zooftware.Zooftware.patrones.adapter.*;
import com.Zooftware.Zooftware.patrones.mediator.MediadorConcreto;
import com.Zooftware.Zooftware.patrones.mediator.Mediator;
import com.Zooftware.Zooftware.patrones.proxy.IAccionesCliente;
import com.Zooftware.Zooftware.patrones.proxy.IAccionesEmpleado;
import com.Zooftware.Zooftware.patrones.proxy.IAccionesJefe;
import com.Zooftware.Zooftware.patrones.state.Animal;
import com.Zooftware.Zooftware.patrones.strategy.Contexto;
import com.Zooftware.Zooftware.patrones.strategy.Estrategia;
import com.Zooftware.Zooftware.patrones.strategy.RellenarBebederos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


	Contexto contextotarea;
	@Autowired
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

    }

    @Override
    public void dormirAnimal(int id, int cantidad) {
        Animal animal = new AnimalDTOToAnimalState(animalDAO.buscarPorId(id));
        animal.dormir(cantidad);
    }

    @Override
    public void darComerAnimal(int id, int cantidad) {
		Animal animal = new AnimalDTOToAnimalState(animalDAO.buscarPorId(id));
        animal.darComida(cantidad);

    }

    @Override
    public void rellenarComederos(int habita_id) {
        estrategia.ejecutar(habitatDAO.buscarPorId(habita_id));
    }

    @Override
    public void rellenarBebederos(int habita_id) {
        estrategia = new RellenarBebederos();
        estrategia.ejecutar(habitatDAO.buscarPorId(habita_id));
    }

    @Override
    public List<BebederoEntityDto> verBebederos(int habita_id) {
        return habitatDAO.buscarPorId(habita_id).getBebederos();
    }

    @Override
    public List<ComederoEntityDto> verComederos(int habita_id) {
        return habitatDAO.buscarPorId(habita_id).getComederos();
    }

    @Override
    public void modificarEstadoComedero(ComederoEntityDto comedero, int cantidad) {
        comederoDAO.actualizarComedero(comedero);
    }

    @Override
    public void modificarEstadoBebedero(BebederoJson bebedero) {
        BebederoJsonToDTO bebederoJsonToDTO= new BebederoJsonToDTO(bebedero);
        bebederoDAO.actualizarBebedero(bebederoJsonToDTO);

    }

    @Override
    public void comprarAnimal(AnimalJson animalJson) {
        AnimalJsonToDTo animal = new AnimalJsonToDTo(animalJson);
        int id_habita = animal.getId_habita();
        TipoAnimal tipo = animal.getTipo();


        switch (tipo) {
            case ANFIBIO:
                AnfibioEntityDto habita = anfibioDAO.encontrarPorId(id_habita);
                animal.setHabitat(habita);
                break;
            case ACUATICO:
                AcuaticoEntityDto habita1 = habitaAcuatio.buscarPorId(id_habita);
                animal.setHabitat(habita1);
                break;
            case TERRESTRE:
                TerrestreEntityDto habita2 = terrestreDAO.buscarPorId(id_habita);
                animal.setHabitat(habita2);
                break;

        }

        animalDAO.guardarAnimal(animal);


    }

	@Override
	public void crearhabita(TipoHabitat tipo) {

//	HabitatEntityDto habita;
	switch (tipo){
		case ANFIBIO :
			fabricadeHabitas.crearHabitaAnfibio();
			//habitatEntityDtos.add(habita);
			//habitatDAO.guardarHabitat(habita);
			break;
		case ACTUATICO_DULCE :
			fabricadeHabitas.crerAcuarioAguaDulce();
			//habitatEntityDtos.add(habita);
//			habitatDAO.guardarHabitat(habita);
			break;
		case ACTUATICO_SALADO :
			fabricadeHabitas.crerAcuarioAguaSalada();
			//habitatEntityDtos.add(habita);
//			habitatDAO.guardarHabitat(habita);
			break;
		case TERRESTRE:
			fabricadeHabitas.crearHabitaTerrestre();
			//habitatEntityDtos.add(habita);
//			habitatDAO.guardarHabitat(habita);
			break;

	}



	}

    @Override
    public void eliminarHabita(int habita_id) {

        habitatDAO.eliminarHabitat(habita_id);

    }

    @Override
    public double verTotalSueldos(int empleado_id) {
        TrabajadorEntityDto trabajador = trabajadorDAO.buscarPorId(empleado_id);

        return trabajador.getSalarios();

    }

    @Override
    public void despedirEmpleado(int empleado_id) {

        trabajadorDAO.eliminarTrabajador(empleado_id);

    }

    @Override
    public void contratarEmpleado(EmpleadoJson empleadoNuevo) {
        EmpleadoJSONToDTO empleado = new EmpleadoJSONToDTO(empleadoNuevo);
        contactoDAO.guardarContacto(empleado.getContactoEntityDto());
        empleadoDAO.guardarEmpleado(empleado);


    }
    @Override
    public void contratarJefe(JefeJson jefe) {
        JefeEntityDto jefeDto = new JefeJSONToDTO(jefe);
        contactoDAO.guardarContacto(jefeDto.getContactoEntityDto());
        jefeDAO.guardarJefe(jefeDto);


    }

    @Override
    public void modificarEmpleado(int empleado_id, TipoPersona tipo) {


    }

    @Override
    public AnimalEntityDto VerAnimal(int id_animal) {
        return animalDAO.buscarPorId(id_animal);
    }


}//end Zooftware
package com.Zooftware.Zooftware.service;


import com.Zooftware.Zooftware.modelDTO.*;
import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;
import com.Zooftware.Zooftware.modelJPA.enums.TipoEmpleado;
import com.Zooftware.Zooftware.modelJPA.enums.TipoHabitat;
import com.Zooftware.Zooftware.patrones.proxy.IAccionesJefe;

import java.util.List;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:10
 */
public class Zooftware implements IAccionesJefe {


	@Override
	public void verAnimales() {

	}

	@Override
	public void verInstalaciones() {

	}

	@Override
	public void enviarMensaje(MensajeEntityDto mensaje) {

	}

	@Override
	public void LeerMensaje(MensajeEntityDto mensaje) {

	}

	@Override
	public void consultarMensajes(TrabajadorEntityDto trabajador) {

	}

	@Override
	public EstadoAnimal ComprobarEstadoAnimal(int id) {
		return null;
	}

	@Override
	public void ModificarEstadoAnimal(int id, int salud, int comida, int suenio) {

	}

	@Override
	public void ejercitarAnimal(int id, int cantidad) {

	}

	@Override
	public void dormirAnimal(int id, int cantidad) {

	}

	@Override
	public void darComerAnimal(int id, int cantidad) {

	}

	@Override
	public void rellenarComederos(int habita_id) {

	}

	@Override
	public void rellenarBebederos(int habita_id) {

	}

	@Override
	public List<BebederoEntityDto> verBebederos(int habita_id) {
		return null;
	}

	@Override
	public List<ComederoEntityDto> verComederos(int habita_id) {
		return null;
	}

	@Override
	public void modificarEstadoComedero(int cantidad) {

	}

	@Override
	public void modificarEstadoBebedero(int cantidad) {

	}

	@Override
	public void comprarAnimal(AnimalEntityDto animalEntityDto, HabitatEntityDto habita) {

	}

	@Override
	public void crearhabita(TipoHabitat tipo) {

	}

	@Override
	public void eliminarHabita(int habita_id) {

	}

	@Override
	public Integer verTotalSueldos(int empleado_id) {
		return null;
	}

	@Override
	public void despedirEmpleado(int empleado_id) {

	}

	@Override
	public void contratarEmpleado(TrabajadorEntityDto empleadoNuevo, TipoEmpleado tipo) {

	}

	@Override
	public void modificarEmpleado(int empleado_id, TipoEmpleado tipo) {

	}
}//end Zooftware
package com.Zooftware.Zooftware.patrones.proxy;


import com.Zooftware.Zooftware.modelDTO.BebederoEntityDto;
import com.Zooftware.Zooftware.modelDTO.ComederoEntityDto;
import com.Zooftware.Zooftware.modelDTO.MensajeEntityDto;
import com.Zooftware.Zooftware.modelDTO.TrabajadorEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;

import java.util.List;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:12
 */
public class ProxyEmpleado  implements IAccionesEmpleado {


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
}//end ProxyEmpleado
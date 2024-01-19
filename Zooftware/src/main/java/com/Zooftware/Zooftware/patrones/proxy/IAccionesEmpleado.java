package com.Zooftware.Zooftware.patrones.proxy;


import com.Zooftware.Zooftware.modelDTO.*;
import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;

import java.util.List;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:12
 */
public interface IAccionesEmpleado extends IAccionesCliente {

	public void enviarMensaje(MensajeEntityDto mensaje);
	public void LeerMensaje(MensajeEntityDto mensaje);


	public void consultarMensajes(TrabajadorEntityDto trabajador);

	public EstadoAnimal ComprobarEstadoAnimal(int id );

	public void ModificarEstadoAnimal(int id, int salud, int comida, int suenio);

	public void ejercitarAnimal(int id ,int cantidad);
	public void dormirAnimal(int id ,int cantidad);
	public void darComerAnimal(int id ,int cantidad);


	public void rellenarComederos(int habita_id);
	public void rellenarBebederos(int habita_id);
	public List<BebederoEntityDto> verBebederos(int habita_id);
	public List<ComederoEntityDto> verComederos(int habita_id);

	public void modificarEstadoComedero(int cantidad);
	public void modificarEstadoBebedero(int cantidad);




}
package com.Zooftware.Zooftware.patrones.proxy;


import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;
import com.Zooftware.Zooftware.modelDTO.HabitatEntityDto;
import com.Zooftware.Zooftware.modelDTO.TrabajadorEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.TipoPersona;
import com.Zooftware.Zooftware.modelJPA.enums.TipoHabitat;
import com.Zooftware.Zooftware.patrones.adapter.AnimalJson;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:12
 */
public interface IAccionesJefe extends IAccionesEmpleado {


	public void comprarAnimal(AnimalJson animalEntityDto);


	public void crearhabita(TipoHabitat tipo);

	public void eliminarHabita(int habita_id);

	public double verTotalSueldos(int empleado_id);
	public void despedirEmpleado(int empleado_id);

	public void contratarEmpleado(TrabajadorEntityDto empleadoNuevo, TipoPersona tipo);
	public void modificarEmpleado(int empleado_id, TipoPersona tipo);

	void cargar();

}
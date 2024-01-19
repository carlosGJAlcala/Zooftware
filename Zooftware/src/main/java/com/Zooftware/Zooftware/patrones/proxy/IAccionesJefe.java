package com.Zooftware.Zooftware.patrones.proxy;


import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;
import com.Zooftware.Zooftware.modelDTO.EmpleadoEntityDto;
import com.Zooftware.Zooftware.modelDTO.HabitatEntityDto;
import com.Zooftware.Zooftware.modelDTO.TrabajadorEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.TipoEmpleado;
import com.Zooftware.Zooftware.modelJPA.enums.TipoHabitat;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:12
 */
public interface IAccionesJefe extends IAccionesEmpleado {


	public void comprarAnimal(AnimalEntityDto animalEntityDto, HabitatEntityDto habita);


	public void crearhabita(TipoHabitat tipo);

	public void eliminarHabita(int habita_id);

	public Integer verTotalSueldos(int empleado_id);
	public void despedirEmpleado(int empleado_id);

	public void contratarEmpleado(TrabajadorEntityDto empleadoNuevo, TipoEmpleado tipo);
	public void modificarEmpleado(int empleado_id, TipoEmpleado tipo);
}
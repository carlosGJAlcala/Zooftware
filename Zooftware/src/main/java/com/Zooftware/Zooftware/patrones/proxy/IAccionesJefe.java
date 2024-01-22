package com.Zooftware.Zooftware.patrones.proxy;


import com.Zooftware.Zooftware.modelDTO.BebederoEntityDto;
import com.Zooftware.Zooftware.modelDTO.PlantaEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.TipoPersona;
import com.Zooftware.Zooftware.modelJPA.enums.TipoHabitat;
import com.Zooftware.Zooftware.modelJPA.instalaciones.BebederoEntity;
import com.Zooftware.Zooftware.patrones.adapter.AnimalJson;
import com.Zooftware.Zooftware.patrones.adapter.EmpleadoJson;
import com.Zooftware.Zooftware.patrones.adapter.JefeJson;

import java.util.List;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:12
 */
public interface IAccionesJefe extends IAccionesEmpleado {


	void crearAlmacen();

	public void comprarAnimal(AnimalJson animalEntityDto);


	public void crearHabitat(TipoHabitat tipo);

	public void eliminarHabita(int habita_id);

	public double verTotalSueldos(int empleado_id);
	public void despedirEmpleado(int empleado_id);

	void contratarEmpleado(EmpleadoJson empleadoNuevo);
	void contratarJefe(JefeJson jefe);
	public void modificarEmpleado(int empleado_id, TipoPersona tipo);

	void cargar();

	BebederoEntityDto verBebedero(int habitaId);

	List<PlantaEntityDto> verPlantasPorHabita(int id_habita);
}
package com.Zooftware.Zooftware.model.instalaciones;


import com.Zooftware.Zooftware.model.interfaces.*;
import com.Zooftware.Zooftware.model.personas.Trabajador;

import java.util.List;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:01
 */
public  abstract class InstalacionAbs implements IInstalacion {

	private List<Trabajador> Trabajadores;
	private IDimesionHabita dimesion;

	private List<IRecipiente> recipientes;

	private String nombre;

	private String descripcion;

	abstract public String descripcion();
	@Override
	 public String getDescripcion() {
		return this.descripcion();
	}

	@Override
	public void anadirEmpleado(ITrabajador trabajador) {

	}
}//end InstalacionAbs
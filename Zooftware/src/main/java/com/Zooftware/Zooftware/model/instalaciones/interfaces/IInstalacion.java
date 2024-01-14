package com.Zooftware.Zooftware.model.instalaciones.interfaces;


import com.Zooftware.Zooftware.model.persona.interfaces.ITrabajador;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:00
 */
public interface IInstalacion {

	public String getDescripcion();

	public void anadirEmpleado(ITrabajador trabajador);

}
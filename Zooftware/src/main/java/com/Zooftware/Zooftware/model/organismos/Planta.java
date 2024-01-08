package com.Zooftware.Zooftware.model.organismos;


import com.Zooftware.Zooftware.model.interfaces.IDimesion;
import com.Zooftware.Zooftware.model.interfaces.ISuelo;
import com.Zooftware.Zooftware.model.organismos.OrganismoAbs;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:49:59
 */
public class Planta extends OrganismoAbs {

	private ISuelo suelo;

	public Planta(int edad, int id, String nombreEspecie, IDimesion tamanio, ISuelo suelo) {
		super(edad, id, nombreEspecie, tamanio);
		this.suelo = suelo;
	}

	public Planta(int edad, int id, String nombreEspecie, ISuelo suelo) {
		super(edad, id, nombreEspecie);
		this.suelo = suelo;
	}
}//end Planta
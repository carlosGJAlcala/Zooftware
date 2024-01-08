package com.Zooftware.Zooftware.model.organismos;


import com.Zooftware.Zooftware.model.interfaces.IDimensionAnimal;
import com.Zooftware.Zooftware.model.interfaces.IDimesion;
import com.Zooftware.Zooftware.model.interfaces.IOrganismo;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:49:58
 */
public abstract class  OrganismoAbs implements IOrganismo {

	private int Edad;
	private int Id;
	private String NombreEspecie;
	private IDimesion Tamanio;

	public OrganismoAbs(int edad, int id, String nombreEspecie, IDimesion tamanio) {
		Edad = edad;
		Id = id;
		NombreEspecie = nombreEspecie;
		Tamanio = tamanio;
	}
	public OrganismoAbs(int edad, int id, String nombreEspecie) {
		Edad = edad;
		Id = id;
		NombreEspecie = nombreEspecie;
	}
}//end OrganismoAbs
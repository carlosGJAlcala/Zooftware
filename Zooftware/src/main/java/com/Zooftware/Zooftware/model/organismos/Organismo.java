package com.Zooftware.Zooftware.model.organismos;


import com.Zooftware.Zooftware.model.interfaces.IDimesion;
import com.Zooftware.Zooftware.model.interfaces.IOrganismo;
import jakarta.persistence.*;

import javax.print.attribute.standard.MediaSize;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:49:58
 */

@Entity
@Table(name = "organismo")
public class Organismo implements IOrganismo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private int Edad;

	private String NombreEspecie;
	private IDimesion Tamanio;
	@OneToOne
	@JoinColumn(name = "animal_id")
	private Animal animal;
	@OneToOne
	@JoinColumn(name = "planta_id")
	private Planta planta;

	@OneToOne
	@JoinColumn(name = "dimensionAnimalImpl_id")
	private DimensionAnimalImpl dimensionAnimal;
	public Organismo(int edad, int id, String nombreEspecie, IDimesion tamanio) {
		Edad = edad;
		Id = id;
		NombreEspecie = nombreEspecie;
		Tamanio = tamanio;
	}
	public Organismo(int edad, int id, String nombreEspecie) {
		Edad = edad;
		Id = id;
		NombreEspecie = nombreEspecie;
	}
}//end OrganismoAbs
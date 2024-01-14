package com.Zooftware.Zooftware.model.organismos;


import com.Zooftware.Zooftware.model.interfaces.IDimesion;
import com.Zooftware.Zooftware.model.organismos.interfaces.IOrganismo;
import jakarta.persistence.*;

import java.io.Serializable;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:49:58
 */

@Entity
@Table(name = "organismo")
@Inheritance(strategy = InheritanceType.JOINED)
public class Organismo implements IOrganismo, Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int Edad;

	private String NombreEspecie;
	//private IDimesion Tamanio;
	@OneToOne
	@JoinColumn(name = "animal_id")
	private Animal animal;
	@OneToOne
	@JoinColumn(name = "planta_id")
	private Planta planta;

	@OneToOne
	@JoinColumn(name = "dimensionAnimalImpl_id")
	private DimensionAnimalImpl dimensionAnimal;
//	public Organismo(int edad, int id, String nombreEspecie) {
//		Edad = edad;
//		id = id;
//		NombreEspecie = nombreEspecie;
//		//Tamanio = tamanio;
//	}
	public Organismo(){}
	public Organismo(int edad, int id, String nombreEspecie) {
		Edad = edad;
		id = id;
		NombreEspecie = nombreEspecie;
	}
}//end OrganismoAbs
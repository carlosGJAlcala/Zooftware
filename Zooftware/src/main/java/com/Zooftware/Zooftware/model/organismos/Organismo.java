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
	@JoinColumn(name = "dimensionAnimal_id")
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

	public Organismo(int id, int edad, String nombreEspecie, Animal animal, Planta planta, DimensionAnimalImpl dimensionAnimal) {
		this.id = id;
		Edad = edad;
		NombreEspecie = nombreEspecie;
		this.animal = animal;
		this.planta = planta;
		this.dimensionAnimal = dimensionAnimal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getNombreEspecie() {
		return NombreEspecie;
	}

	public void setNombreEspecie(String nombreEspecie) {
		NombreEspecie = nombreEspecie;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Planta getPlanta() {
		return planta;
	}

	public void setPlanta(Planta planta) {
		this.planta = planta;
	}

	public DimensionAnimalImpl getDimensionAnimal() {
		return dimensionAnimal;
	}

	public void setDimensionAnimal(DimensionAnimalImpl dimensionAnimal) {
		this.dimensionAnimal = dimensionAnimal;
	}
}//end OrganismoAbs
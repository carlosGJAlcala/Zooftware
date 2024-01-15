package com.Zooftware.Zooftware.model.organismos;


import com.Zooftware.Zooftware.model.comida.Comida;
import com.Zooftware.Zooftware.model.comida.interfaces.IAlimentacion;
import com.Zooftware.Zooftware.model.interfaces.IDimesion;
import com.Zooftware.Zooftware.model.organismos.enums.EstadoAnimal;
import com.Zooftware.Zooftware.model.organismos.enums.TipoAnimal;
import com.Zooftware.Zooftware.model.organismos.interfaces.IEstadoAnimal;
import jakarta.persistence.*;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:49:58
 */
@Entity
@Table(name = "animal")
public class Animal extends Organismo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	@JoinColumn(name = "comida_id")
	private Comida comida;
	private int Hambre;
	private String Nombre;
	private int NumExtremidades;
	private int Salud;
	private int Sed;
	private int Suenio;
	@Enumerated(EnumType.STRING)
	private TipoAnimal tipo;

	@Enumerated(EnumType.STRING)
	public EstadoAnimal estadoAnimal;

//	public Animal(int edad, int id, String nombreEspecie, IDimesion tamanio, Comida comida, EstadoAnimal estadoAnimal, int hambre, String nombre, int numExtremidades, int salud, int sed, int suenio, TipoAnimal tipo) {
//		super(edad, id, nombreEspecie, tamanio);
//		comida = comida;
//		estadoAnimal = estadoAnimal;
//		Hambre = hambre;
//		Nombre = nombre;
//		NumExtremidades = numExtremidades;
//		Salud = salud;
//		Sed = sed;
//		Suenio = suenio;
//		this.id=id;
//		this.tipo = tipo;
//	}

	public Animal(){}

	public Animal(int id, Comida comida, int hambre, String nombre, int numExtremidades, int salud, int sed, int suenio, TipoAnimal tipo, EstadoAnimal estadoAnimal) {
		this.id = id;
		this.comida = comida;
		Hambre = hambre;
		Nombre = nombre;
		NumExtremidades = numExtremidades;
		Salud = salud;
		Sed = sed;
		Suenio = suenio;
		this.tipo = tipo;
		this.estadoAnimal = estadoAnimal;
	}

	public Animal(int edad, int id, String nombreEspecie, int id1, Comida comida, int hambre, String nombre, int numExtremidades, int salud, int sed, int suenio, TipoAnimal tipo, EstadoAnimal estadoAnimal) {
		super(edad, id, nombreEspecie);
		this.id = id1;
		this.comida = comida;
		Hambre = hambre;
		Nombre = nombre;
		NumExtremidades = numExtremidades;
		Salud = salud;
		Sed = sed;
		Suenio = suenio;
		this.tipo = tipo;
		this.estadoAnimal = estadoAnimal;
	}

	public Animal(int id, int edad, String nombreEspecie, Animal animal, Planta planta, DimensionAnimalImpl dimensionAnimal, int id1, Comida comida, int hambre, String nombre, int numExtremidades, int salud, int sed, int suenio, TipoAnimal tipo, EstadoAnimal estadoAnimal) {
		super(id, edad, nombreEspecie, animal, planta, dimensionAnimal);
		this.id = id1;
		this.comida = comida;
		Hambre = hambre;
		Nombre = nombre;
		NumExtremidades = numExtremidades;
		Salud = salud;
		Sed = sed;
		Suenio = suenio;
		this.tipo = tipo;
		this.estadoAnimal = estadoAnimal;
	}

	public IAlimentacion getComida() {
		return comida;
	}

	public void setComida(Comida comida) {
		comida = comida;
	}

	public EstadoAnimal getEstadoAnimal() {
		return estadoAnimal;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	public void setEstadoAnimal(EstadoAnimal estadoAnimal) {
		estadoAnimal = estadoAnimal;
	}

	public int getHambre() {
		return Hambre;
	}

	public void setHambre(int hambre) {
		Hambre = hambre;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getNumExtremidades() {
		return NumExtremidades;
	}

	public void setNumExtremidades(int numExtremidades) {
		NumExtremidades = numExtremidades;
	}

	public int getSalud() {
		return Salud;
	}

	public void setSalud(int salud) {
		Salud = salud;
	}

	public int getSed() {
		return Sed;
	}

	public void setSed(int sed) {
		Sed = sed;
	}

	public int getSuenio() {
		return Suenio;
	}

	public void setSuenio(int suenio) {
		Suenio = suenio;
	}

	public TipoAnimal getTipo() {
		return tipo;
	}

	public void setTipo(TipoAnimal tipo) {
		this.tipo = tipo;
	}

	public EstadoAnimal get_estadoAnimal() {
		return estadoAnimal;
	}

	public void set_estadoAnimal(EstadoAnimal estadoAnimal) {
		this.estadoAnimal = estadoAnimal;
	}
}//end Animal
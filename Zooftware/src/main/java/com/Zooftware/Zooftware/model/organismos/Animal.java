package com.Zooftware.Zooftware.model.organismos;


import com.Zooftware.Zooftware.model.interfaces.IAlimentacion;
import com.Zooftware.Zooftware.model.interfaces.IDimesion;
import com.Zooftware.Zooftware.model.interfaces.IEstadoAnimal;
import jakarta.persistence.*;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:49:58
 */
@Entity
@Table(name = "animal")
public class Animal extends Organismo {
	public enum TipoAnimal
	{
		MAMIFERO,ANFIBIO,REPTIL,AVE,PEZ,ANTROPODO,ANELIDOS,MOLUSCO,PORIFERO
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private IAlimentacion Alimentacion;
	private IEstadoAnimal EstadoAnimal;
	private int Hambre;
	private String Nombre;
	private int NumExtremidades;
	private int Salud;
	private int Sed;
	private int Suenio;




	private TipoAnimal tipo;
	public IEstadoAnimal m_IEstadoAnimal;

	public Animal(int edad, int id, String nombreEspecie, IDimesion tamanio, IAlimentacion alimentacion, IEstadoAnimal estadoAnimal, int hambre, String nombre, int numExtremidades, int salud, int sed, int suenio, TipoAnimal tipo) {
		super(edad, id, nombreEspecie, tamanio);
		Alimentacion = alimentacion;
		EstadoAnimal = estadoAnimal;
		Hambre = hambre;
		Nombre = nombre;
		NumExtremidades = numExtremidades;
		Salud = salud;
		Sed = sed;
		Suenio = suenio;
		this.id=id;
		this.tipo = tipo;
	}

	public Animal(int edad, int id, String nombreEspecie, IAlimentacion alimentacion, IEstadoAnimal estadoAnimal, int hambre, String nombre, int numExtremidades, int salud, int sed, int suenio, TipoAnimal tipo, IEstadoAnimal m_IEstadoAnimal) {
		super(edad, id, nombreEspecie);
		Alimentacion = alimentacion;
		EstadoAnimal = estadoAnimal;
		Hambre = hambre;
		Nombre = nombre;
		NumExtremidades = numExtremidades;
		Salud = salud;
		Sed = sed;
		Suenio = suenio;
		this.tipo = tipo;
		this.id=id;
		this.m_IEstadoAnimal = m_IEstadoAnimal;
	}

	public IAlimentacion getAlimentacion() {
		return Alimentacion;
	}

	public void setAlimentacion(IAlimentacion alimentacion) {
		Alimentacion = alimentacion;
	}

	public IEstadoAnimal getEstadoAnimal() {
		return EstadoAnimal;
	}

	public void setEstadoAnimal(IEstadoAnimal estadoAnimal) {
		EstadoAnimal = estadoAnimal;
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

	public IEstadoAnimal getM_IEstadoAnimal() {
		return m_IEstadoAnimal;
	}

	public void setM_IEstadoAnimal(IEstadoAnimal m_IEstadoAnimal) {
		this.m_IEstadoAnimal = m_IEstadoAnimal;
	}
}//end Animal
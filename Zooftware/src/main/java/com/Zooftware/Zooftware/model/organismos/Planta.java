package com.Zooftware.Zooftware.model.organismos;


import com.Zooftware.Zooftware.model.interfaces.IDimesion;
import jakarta.persistence.*;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:49:59
 */
@Entity
@Table(name = "planta")
public class Planta extends Organismo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	@JoinColumn(name = "suelo_id")
	private SueloImpl suelo;

//	public Planta(int edad, int id, String nombreEspecie, IDimesion tamanio, SueloImpl suelo) {
//		super(edad, id, nombreEspecie, tamanio);
//		this.suelo = suelo;
//	}

	public Planta(){

	}

	public Planta(int id, SueloImpl suelo) {
		this.id = id;
		this.suelo = suelo;
	}

	public Planta(int edad, int id, String nombreEspecie, int id1, SueloImpl suelo) {
		super(edad, id, nombreEspecie);
		this.id = id1;
		this.suelo = suelo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SueloImpl getSuelo() {
		return suelo;
	}

	public void setSuelo(SueloImpl suelo) {
		this.suelo = suelo;
	}
}//end Planta
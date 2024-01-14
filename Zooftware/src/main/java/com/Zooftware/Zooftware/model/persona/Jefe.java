package com.Zooftware.Zooftware.model.persona;


import jakarta.persistence.*;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:03
 */
@Entity
@Table(name = "jefe")
public class Jefe extends Trabajador {

	//Pendiente añadir mas atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	//ejemplo composite

	@OneToMany
	@JoinColumn(name = "trabajador_id")
	private Trabajador subordinado;

	//Para el patron composite
	@OneToOne
	@JoinColumn(name = "trabajador_id")
	public Trabajador m_Trabajador;

	public Jefe(){
	}



	public void setNombre(){

	}

}//end Jefe
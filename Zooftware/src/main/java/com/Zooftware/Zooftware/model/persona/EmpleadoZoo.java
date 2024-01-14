package com.Zooftware.Zooftware.model.persona;


import jakarta.persistence.*;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:03
 */
@Entity
@Table(name = "empleado")
public class EmpleadoZoo extends Trabajador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	//Pendiente añadir mas atributos

	public EmpleadoZoo(){
	}

}//end EmpleadoZoo
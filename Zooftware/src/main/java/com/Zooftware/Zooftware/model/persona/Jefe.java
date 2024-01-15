package com.Zooftware.Zooftware.model.persona;


import com.Zooftware.Zooftware.model.mensajeria.MensajeImpl;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

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
	private List<Trabajador> subordinado;

	//Para el patron composite
//	@OneToOne
//	@JoinColumn(name = "trabajador_id")
//	public Trabajador m_Trabajador;

	public Jefe(){
	}

	public Jefe(int id, List<Trabajador> subordinado) {
		this.id = id;
		this.subordinado = subordinado;
	}

	public Jefe(long numeroSeguridadSocial, boolean activo, Date fechaInicioContrato, Date fechaFinContrato, List<MensajeImpl> mensaje, EmpleadoZoo empleadoZoo, Jefe jefe, int id, List<Trabajador> subordinado) {
		super(numeroSeguridadSocial, activo, fechaInicioContrato, fechaFinContrato, mensaje, empleadoZoo, jefe);
		this.id = id;
		this.subordinado = subordinado;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	public List<Trabajador> getSubordinado() {
		return subordinado;
	}

	public void setSubordinado(List<Trabajador> subordinado) {
		this.subordinado = subordinado;
	}


	public void setNombre(){

	}

}//end Jefe
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
@Table(name = "empleado")
public class EmpleadoZoo extends Trabajador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	//Pendiente añadir mas atributos

	public EmpleadoZoo(){
	}

	public EmpleadoZoo(int id) {
		this.id = id;
	}

	public EmpleadoZoo(long numeroSeguridadSocial, boolean activo, Date fechaInicioContrato, Date fechaFinContrato, List<MensajeImpl> mensaje, EmpleadoZoo empleadoZoo, Jefe jefe, int id) {
		super(numeroSeguridadSocial, activo, fechaInicioContrato, fechaFinContrato, mensaje, empleadoZoo, jefe);
		this.id = id;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}
}//end EmpleadoZoo
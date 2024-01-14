package com.Zooftware.Zooftware.model.persona;


import com.Zooftware.Zooftware.model.interfaces.IDescripcion;
import com.Zooftware.Zooftware.model.interfaces.ITrabajador;
import com.Zooftware.Zooftware.model.mensajeria.MensajeImpl;
import jakarta.persistence.*;

import java.util.Date;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:07
 */

@Entity
@Table(name = "trabajador")
public class Trabajador implements ITrabajador, IDescripcion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	//Añadir caracteristicas propias de los trabajadores:
//	numero seguridad social
//	fecha inicio contrato
//	fecha fin contrato
//	fecha Borrado
//	Activo
//
	private long numeroSeguridadSocial;
	private boolean activo;
	private Date fechaInicioContrato;
	private Date fechaFinContrato;
	@OneToMany
	@JoinColumn(name = "mensaje_id")
	private MensajeImpl mensaje;
	@OneToOne
	@JoinColumn(name = "empleadoZoo_id")
	private EmpleadoZoo empleadoZoo;
	@OneToOne
	@JoinColumn(name = "jefe_id")
	private Jefe jefe;
	public Trabajador() {
	}

	public Trabajador(long numeroSeguridadSocial, boolean activo, Date fechaInicioContrato, Date fechaFinContrato, MensajeImpl mensaje, EmpleadoZoo empleadoZoo, Jefe jefe) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
		this.activo = activo;
		this.fechaInicioContrato = fechaInicioContrato;
		this.fechaFinContrato = fechaFinContrato;
		this.mensaje = mensaje;
		this.empleadoZoo = empleadoZoo;
		this.jefe = jefe;
	}

	public long getNumeroSeguridadSocial() {
		return numeroSeguridadSocial;
	}

	public void setNumeroSeguridadSocial(long numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Date getFechaInicioContrato() {
		return fechaInicioContrato;
	}

	public void setFechaInicioContrato(Date fechaInicioContrato) {
		this.fechaInicioContrato = fechaInicioContrato;
	}

	public Date getFechaFinContrato() {
		return fechaFinContrato;
	}

	public void setFechaFinContrato(Date fechaFinContrato) {
		this.fechaFinContrato = fechaFinContrato;
	}

	public MensajeImpl getMensaje() {
		return mensaje;
	}

	public void setMensaje(MensajeImpl mensaje) {
		this.mensaje = mensaje;
	}

	public EmpleadoZoo getEmpleadoZoo() {
		return empleadoZoo;
	}

	public void setEmpleadoZoo(EmpleadoZoo empleadoZoo) {
		this.empleadoZoo = empleadoZoo;
	}

	public Jefe getJefe() {
		return jefe;
	}

	public void setJefe(Jefe jefe) {
		this.jefe = jefe;
	}

	public void anadirSub(){}
	public void descripcion(){}
	public void eliminarSub(){}
	public void getSalario(){}
	public void getSalarios(){}
	public void setDescripcion(){}
	public void setZona(){}
	public void getDescripcion(){}
}//end Trabajador
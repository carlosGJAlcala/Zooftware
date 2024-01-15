package com.Zooftware.Zooftware.model.persona;


import com.Zooftware.Zooftware.model.interfaces.IDescripcion;
import jakarta.persistence.*;

import java.util.Date;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:03
 */
@Entity
@Table(name = "cliente")
public class ClienteZoo implements IDescripcion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int numVisitas;
	private Date fechaRegistro;
	private Date fechaUltimaVisita;

	public ClienteZoo(){
	}

	public ClienteZoo(int id, int numVisitas, Date fechaRegistro, Date fechaUltimaVisita) {
		this.id = id;
		this.numVisitas = numVisitas;
		this.fechaRegistro = fechaRegistro;
		this.fechaUltimaVisita = fechaUltimaVisita;
	}

	public void descripcion(){

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumVisitas() {
		return numVisitas;
	}

	public void setNumVisitas(int numVisitas) {
		this.numVisitas = numVisitas;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaUltimaVisita() {
		return fechaUltimaVisita;
	}

	public void setFechaUltimaVisita(Date fechaUltimaVisita) {
		this.fechaUltimaVisita = fechaUltimaVisita;
	}
}//end ClienteZoo
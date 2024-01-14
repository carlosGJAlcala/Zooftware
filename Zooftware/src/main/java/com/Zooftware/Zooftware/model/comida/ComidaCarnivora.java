package com.Zooftware.Zooftware.model.comida;


import com.Zooftware.Zooftware.model.comida.enums.EstadoComida;
import com.Zooftware.Zooftware.model.comida.interfaces.IAlimentacion;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:11
 */
public class ComidaCarnivora implements IAlimentacion {

	private int id;
	private EstadoComida estado;
	public ComidaCarnivora(){
		estado= EstadoComida.CRUDA;
	}
	public String getDescripcion(){
		return null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EstadoComida getEstado() {
		return estado;
	}

	public void setEstado(EstadoComida estado) {
		this.estado = estado;
	}
}//end ComidaCarnivora
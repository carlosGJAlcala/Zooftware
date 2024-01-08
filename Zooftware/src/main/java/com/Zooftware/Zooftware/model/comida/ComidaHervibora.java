package com.Zooftware.Zooftware.model.comida;


import com.Zooftware.Zooftware.model.interfaces.IAlimentacion;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:11
 */
public class ComidaHervibora implements IAlimentacion {

	private int id;
	private EstadoComida estado;
	public ComidaHervibora(){
		estado=EstadoComida.CRUDA;
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

	public String getDescripcion(){
		return "comida Hervibora";
	}
}//end ComidaHervibora
package com.Zooftware.Zooftware.model.comida;


import com.Zooftware.Zooftware.model.comida.enums.EstadoComida;
import com.Zooftware.Zooftware.model.comida.interfaces.IAlimentacion;
import jakarta.persistence.*;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:11
 */
@Entity
@Table(name = "comidaOmnivora")
public class ComidaOmnivora implements IAlimentacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Enumerated(EnumType.STRING)
	private EstadoComida estado;

	public ComidaOmnivora(int id, EstadoComida estado) {
		this.id = id;
		this.estado = estado;
	}

	public ComidaOmnivora(){
		estado= EstadoComida.CRUDA;
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

		return null;
	}
}//end ComidaOmnivora
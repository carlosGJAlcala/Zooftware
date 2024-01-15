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
@Table(name = "comidaCarnivora")
public class ComidaCarnivora implements IAlimentacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Enumerated(EnumType.STRING)
	private EstadoComida estado;

	public ComidaCarnivora(int id, EstadoComida estado) {
		this.id = id;
		this.estado = estado;
	}

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
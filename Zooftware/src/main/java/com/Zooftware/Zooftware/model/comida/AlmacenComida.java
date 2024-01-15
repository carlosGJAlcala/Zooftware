package com.Zooftware.Zooftware.model.comida;


import com.Zooftware.Zooftware.model.instalaciones.InstalacionAbs;
import jakarta.persistence.*;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:01
 */
@Entity
@Table(name = "almacenComida")
public class AlmacenComida extends InstalacionAbs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
//
//	private IComidaBuilder ComidaBuilder;
//	public IComidaBuilder m_IComidaBuilder;

	public AlmacenComida(){

	}

	public AlmacenComida(int id) {
		this.id = id;
	}

	public String descripcion(){
		return "";
	}
	public String getDescripcion() {
		return this.descripcion();
	}

	public void crearComida(){

	}

	public void getComida(){

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setComidaBuilder(){

	}
}//end AlmacenComida
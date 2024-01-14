package com.Zooftware.Zooftware.model.instalaciones;


import com.Zooftware.Zooftware.model.comida.interfaces.IComidaBuilder;
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

	public void setComidaBuilder(){

	}
}//end AlmacenComida
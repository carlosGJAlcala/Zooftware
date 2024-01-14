package com.Zooftware.Zooftware.model.instalaciones;


import com.Zooftware.Zooftware.model.instalaciones.interfaces.IRecipiente;
import jakarta.persistence.*;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:02
 */
@Entity
@Table(name = "bebedero")
public class Bebedero implements IRecipiente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public Bebedero(){

	}


	public void getCantidad(){

	}

	public void IsVacio(){

	}

	public void rellenar(){

	}
}//end Bebedero
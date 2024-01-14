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


	public int getCantidad(){

		return 0;
	}

	public boolean IsVacio(){

		return false;
	}

	public void rellenar(){

	}

	@Override
	public void vaciar() {

	}
}//end Bebedero
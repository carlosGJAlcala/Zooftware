package com.Zooftware.Zooftware.model.instalaciones;


import com.Zooftware.Zooftware.model.instalaciones.interfaces.IComedero;
import jakarta.persistence.*;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:02
 */

@Entity
@Table(name = "comedero")
public class Comedero implements IComedero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	//pendiente revisar!!

//	private IAlimentacion Alimentacion;

	public Comedero(){

	}

	public void setAlimento(){

	}

	public void setTipoComida(){

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
}//end Comedero
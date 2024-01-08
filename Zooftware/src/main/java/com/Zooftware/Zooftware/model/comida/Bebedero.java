package com.Zooftware.Zooftware.model.comida;


import com.Zooftware.Zooftware.model.interfaces.IRecipiente;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:02
 */
public class Bebedero implements IRecipiente {

	public int Cantidad;

	public Bebedero(){
		this.Cantidad=0;

	}


	public int getCantidad(){
		return Cantidad;
	}

	public boolean IsVacio(){

		return (Cantidad==0)? true:false;


	}

	public void rellenar(){
		Cantidad=100;

	}

	@Override
	public void vaciar() {
		Cantidad--;
	}
}//end Bebedero
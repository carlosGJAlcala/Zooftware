package com.Zooftware.Zooftware.model.comida;


import com.Zooftware.Zooftware.model.interfaces.IAlimentacion;
import com.Zooftware.Zooftware.model.interfaces.IComedero;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:02
 */
public class Comedero implements IComedero {

	private int Cantidad;
	private IAlimentacion Alimentacion;

	public Comedero(){
		Cantidad=0;
	}

	@Override
	public void setTipoComida() {

	}

	@Override
	public int getCantidad() {
		return 0;
	}

	@Override
	public boolean IsVacio() {
		return (Cantidad==0)? true:false;
	}

	@Override
	public void rellenar() {
		Cantidad=100;
	}
	@Override
	public void vaciar() {
		Cantidad--;
	}
}//end Comedero
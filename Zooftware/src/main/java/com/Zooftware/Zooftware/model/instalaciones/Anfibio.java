package com.Zooftware.Zooftware.model.instalaciones;


import com.Zooftware.Zooftware.model.organismos.SueloImpl;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:01
 */
public class Anfibio extends Habitat {

	private int NumComedores;

	public Anfibio(SueloImpl tipoSuelo) {
		super(tipoSuelo);
		NumComedores=0;
	}

	public int getNumComedores() {
		return NumComedores;
	}

	public void setNumComedores(int numComedores) {
		NumComedores = numComedores;
	}

	@Override
	public String descripcion() {
		return "Anfibio";
	}
}//end Anfibio
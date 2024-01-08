package com.Zooftware.Zooftware.model.instalaciones;


import com.Zooftware.Zooftware.model.interfaces.ISuelo;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:01
 */
public class Acuatico extends HabitaAbs {

	public Acuatico(ISuelo tipoSuelo) {
		super(tipoSuelo);
	}

	@Override
	public String descripcion() {
		return "Acuatico";
	}

	public enum TipoAgua{SALADA, DULCE}

	private TipoAgua tipoAgua;



}//end Acuatico
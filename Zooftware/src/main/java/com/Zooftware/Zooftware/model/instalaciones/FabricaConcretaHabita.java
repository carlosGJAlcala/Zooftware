package com.Zooftware.Zooftware.model.instalaciones;


import com.Zooftware.Zooftware.model.interfaces.IFabricaAbsInstalaciones;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:10
 */
public class FabricaConcretaHabita implements IFabricaAbsInstalaciones {

	public FabricaConcretaHabita(){

	}

	public void finalize() throws Throwable {

	}
	public AlmacenComida crearCocina(){
		return null;
	}

	public HabitaAbs crearHabita(){
		return null;
	}
}//end FabricaConcretaHabita
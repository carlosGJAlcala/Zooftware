package com.Zooftware.Zooftware.model.instalaciones.fabrica;


import com.Zooftware.Zooftware.model.comida.AlmacenComida;
import com.Zooftware.Zooftware.model.instalaciones.*;
import com.Zooftware.Zooftware.model.instalaciones.interfaces.IFabricaAbsInstalaciones;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:10
 */
public class FabricaConcretaHabita implements IFabricaAbsInstalaciones {

	public FabricaConcretaHabita(){

	}

	public AlmacenComida crearCocina(){
		return null;
	}

	@Override
	public AlmacenComida crearAlmacenComida() {
		return null;
	}

	@Override
	public Anfibio crearHabitaAnfibio() {
		return null;
	}

	@Override
	public Terrestre crearHabitaTerrestre() {
		return null;
	}

	@Override
	public Acuatico crearHabitaAcuatico() {
		return null;
	}

	public Habitat crearHabita(){
		return null;
	}
}//end FabricaConcretaHabita
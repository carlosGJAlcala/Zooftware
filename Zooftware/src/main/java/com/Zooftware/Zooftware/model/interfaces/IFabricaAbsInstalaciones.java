package com.Zooftware.Zooftware.model.interfaces;


import com.Zooftware.Zooftware.model.comida.AlmacenComida;
import com.Zooftware.Zooftware.model.instalaciones.Acuatico;
import com.Zooftware.Zooftware.model.instalaciones.Anfibio;
import com.Zooftware.Zooftware.model.instalaciones.HabitaAbs;
import com.Zooftware.Zooftware.model.instalaciones.Terrestre;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:10
 */
public interface IFabricaAbsInstalaciones {

	public AlmacenComida crearAlmacenComida();

	public Anfibio crearHabitaAnfibio();
	public Terrestre crearHabitaTerrestre();
	public Acuatico crearHabitaAcuatico();



}
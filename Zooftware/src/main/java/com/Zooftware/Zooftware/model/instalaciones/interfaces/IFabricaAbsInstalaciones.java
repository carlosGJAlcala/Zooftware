package com.Zooftware.Zooftware.model.interfaces;


import com.Zooftware.Zooftware.model.instalaciones.AlmacenComida;
import com.Zooftware.Zooftware.model.instalaciones.HabitaAbs;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:10
 */
public interface IFabricaAbsInstalaciones {

	public AlmacenComida crearCocina();

	public HabitaAbs crearHabita();

}
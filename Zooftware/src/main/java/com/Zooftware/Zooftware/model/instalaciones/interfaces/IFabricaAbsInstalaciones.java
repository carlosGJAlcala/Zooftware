package com.Zooftware.Zooftware.model.instalaciones.interfaces;


import com.Zooftware.Zooftware.model.instalaciones.AlmacenComida;
import com.Zooftware.Zooftware.model.instalaciones.Habitat;
import com.Zooftware.Zooftware.model.instalaciones.Habitat;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:10
 */
public interface IFabricaAbsInstalaciones {

	public AlmacenComida crearCocina();

	public Habitat crearHabita();

}
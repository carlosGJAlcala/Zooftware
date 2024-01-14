package com.Zooftware.Zooftware.model.organismos.interfaces;


import com.Zooftware.Zooftware.model.interfaces.IDimesion;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:49:59
 */
public interface IDimensionAnimal extends IDimesion {

	public void setAltura(float altura);

	public int getId();
	public void setId(int id);


	public void setPeso(float peso);


}
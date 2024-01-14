package com.Zooftware.Zooftware.model.organismos;


import com.Zooftware.Zooftware.model.instalaciones.interfaces.IDimesionHabita;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:00
 */

public class DimesionImpl implements IDimesionHabita {


	//¿Utilidad de esta clase?

	private int id;
	private int dim1;
	private int dim2;
	private int dim3;


	public DimesionImpl(){

	}

	public int getArea(){
		return 0;
	}

	public void setArea(){

	}
}//end DimesionImpl
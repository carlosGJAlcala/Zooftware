package com.Zooftware.Zooftware.model.instalaciones;


import com.Zooftware.Zooftware.model.instalaciones.interfaces.IDimesionHabita;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:00
 */
public class DimesionImpl implements IDimesionHabita {

	private int Area;

	public DimesionImpl(){
	Area=0;
	}

	public int getArea(){
		return Area;
	}

	@Override
	public void setArea(int Area) {
		this.Area=Area;
	}


}//end DimesionImpl
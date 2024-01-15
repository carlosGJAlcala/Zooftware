package com.Zooftware.Zooftware.model.instalaciones;


import com.Zooftware.Zooftware.model.instalaciones.interfaces.IDimesionHabita;
import jakarta.persistence.*;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:00
 */
@Entity
@Table(name = "dimension")
public class DimensionImpl implements IDimesionHabita {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int Area;

	public DimensionImpl(int id, int area) {
		this.id = id;
		Area = area;
	}

	public DimensionImpl(){
	Area=0;
	}

	public int getArea(){
		return Area;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void setArea(int Area) {
		this.Area=Area;
	}


}//end DimesionImpl
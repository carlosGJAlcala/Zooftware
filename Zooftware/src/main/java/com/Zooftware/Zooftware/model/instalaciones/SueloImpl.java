package com.Zooftware.Zooftware.model.instalaciones;


import com.Zooftware.Zooftware.model.interfaces.ISuelo;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:00
 */
public class SueloImpl implements ISuelo {

	private int id;
	private int porcentajeHumedad;
	private TipoSuelo tipo;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int getPorcentajeHumedad() {
		return porcentajeHumedad;
	}

	@Override
	public void setPorcentajeHumedad(int porcentajeHumedad) {
		this.porcentajeHumedad = porcentajeHumedad;
	}

	public TipoSuelo getTipoSuelo() {
		return tipo;
	}

	public void setTipoSuelo(TipoSuelo tipo) {
		this.tipo = tipo;
	}
}//end SueloImpl
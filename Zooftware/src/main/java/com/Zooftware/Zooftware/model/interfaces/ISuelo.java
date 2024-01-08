package com.Zooftware.Zooftware.model.interfaces;


import com.Zooftware.Zooftware.model.instalaciones.TipoSuelo;
import com.Zooftware.Zooftware.model.organismos.Planta;
import com.Zooftware.Zooftware.model.instalaciones.HabitaAbs;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:49:59
 */
public interface ISuelo {


	public int getPorcentajeHumedad();

	public TipoSuelo getTipoSuelo();

	public void setPorcentajeHumedad(int Porcentaje);

	public void setTipoSuelo(TipoSuelo tipo);

}

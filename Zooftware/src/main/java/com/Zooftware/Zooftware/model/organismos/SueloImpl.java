package com.Zooftware.Zooftware.model.organismos;


import com.Zooftware.Zooftware.model.instalaciones.interfaces.ISuelo;
import com.Zooftware.Zooftware.model.organismos.enums.TipoSuelo;
import jakarta.persistence.*;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:00
 */
@Entity
@Table
public class SueloImpl implements ISuelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int porcentajeHumedad;

	@Enumerated(EnumType.STRING)
	private TipoSuelo tipo;

	public SueloImpl(int id, int porcentajeHumedad, TipoSuelo tipo) {
		this.id = id;
		this.porcentajeHumedad = porcentajeHumedad;
		this.tipo = tipo;
	}

	public SueloImpl() {

	}

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

	public TipoSuelo getTipo() {
		return tipo;
	}

	public void setTipo(TipoSuelo tipo) {
		this.tipo = tipo;
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
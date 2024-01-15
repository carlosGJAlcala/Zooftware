package com.Zooftware.Zooftware.model.instalaciones;


import com.Zooftware.Zooftware.model.instalaciones.enums.TipoHabitat;
import com.Zooftware.Zooftware.model.instalaciones.interfaces.ISuelo;
import com.Zooftware.Zooftware.model.organismos.Organismo;
import com.Zooftware.Zooftware.model.organismos.SueloImpl;
import jakarta.persistence.*;

import java.util.List;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:01
 */
@Entity
@Table(name = "acuatico")
public class Acuatico extends Habitat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public Acuatico(){}
	public Acuatico(SueloImpl tipoSuelo) {
		super(tipoSuelo);
	}

	public Acuatico(int id, List<Comedero> comedero, List<Bebedero> bebedero, List<Organismo> organismos, TipoHabitat tipoHabitat, SueloImpl suelo, DimensionImpl dimension, int id1, TipoAgua tipoAgua) {
		super(id, comedero, bebedero, organismos, tipoHabitat, suelo, dimension);
		this.id = id1;
		this.tipoAgua = tipoAgua;
	}

	public Acuatico(SueloImpl suelo, int id, TipoAgua tipoAgua) {
		super(suelo);
		this.id = id;
		this.tipoAgua = tipoAgua;
	}

	public Acuatico(int id, TipoAgua tipoAgua) {
		this.id = id;
		this.tipoAgua = tipoAgua;
	}

	@Override
	public String descripcion() {
		return "Acuatico";
	}

	public enum TipoAgua{SALADA, DULCE}

	private TipoAgua tipoAgua;

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	public TipoAgua getTipoAgua() {
		return tipoAgua;
	}

	public void setTipoAgua(TipoAgua tipoAgua) {
		this.tipoAgua = tipoAgua;
	}
}//end Acuatico
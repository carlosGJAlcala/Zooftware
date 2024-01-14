package com.Zooftware.Zooftware.model.instalaciones;


import com.Zooftware.Zooftware.model.instalaciones.interfaces.ISuelo;
import com.Zooftware.Zooftware.model.organismos.SueloImpl;
import jakarta.persistence.*;

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

	@Override
	public String descripcion() {
		return "Acuatico";
	}

	public enum TipoAgua{SALADA, DULCE}

	private TipoAgua tipoAgua;



}//end Acuatico
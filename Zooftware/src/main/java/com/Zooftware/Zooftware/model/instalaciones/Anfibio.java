package com.Zooftware.Zooftware.model.instalaciones;


import com.Zooftware.Zooftware.model.instalaciones.enums.TipoHabitat;
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
@Table(name = "anfibio")
public class Anfibio extends Habitat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public Anfibio(){}
	private int NumComedores;

	public Anfibio(SueloImpl tipoSuelo) {
		super(tipoSuelo);
		NumComedores=0;
	}

	public Anfibio(int id, List<Comedero> comedero, List<Bebedero> bebedero, List<Organismo> organismos, TipoHabitat tipoHabitat, SueloImpl suelo, DimensionImpl dimension, int id1, int numComedores) {
		super(id, comedero, bebedero, organismos, tipoHabitat, suelo, dimension);
		this.id = id1;
		NumComedores = numComedores;
	}

	public Anfibio(SueloImpl suelo, int id, int numComedores) {
		super(suelo);
		this.id = id;
		NumComedores = numComedores;
	}

	public Anfibio(int id, int numComedores) {
		this.id = id;
		NumComedores = numComedores;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	public int getNumComedores() {
		return NumComedores;
	}

	public void setNumComedores(int numComedores) {
		NumComedores = numComedores;
	}

	@Override
	public String descripcion() {
		return "Anfibio";
	}
}//end Anfibio
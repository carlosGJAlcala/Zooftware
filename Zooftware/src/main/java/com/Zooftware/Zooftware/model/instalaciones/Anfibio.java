package com.Zooftware.Zooftware.model.instalaciones;


import com.Zooftware.Zooftware.model.organismos.SueloImpl;
import jakarta.persistence.*;

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
package com.Zooftware.Zooftware.model.organismos;


import com.Zooftware.Zooftware.model.organismos.interfaces.IDimensionAnimal;
import jakarta.persistence.*;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:49:59
 */
@Entity
@Table(name = "dimension")
public class DimensionAnimalImpl implements IDimensionAnimal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private float Altura;
	private float Peso;

	public void setAltura(float altura) {
		Altura = altura;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPeso(float peso) {
		Peso = peso;
	}


}//end DimensionAnimalImpl
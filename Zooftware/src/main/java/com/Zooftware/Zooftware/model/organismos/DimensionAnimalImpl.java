package com.Zooftware.Zooftware.model.organismos;


import com.Zooftware.Zooftware.model.organismos.interfaces.IDimensionAnimal;
import jakarta.persistence.*;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:49:59
 */
@Entity
@Table(name = "dimensionAnimal")
public class DimensionAnimalImpl implements IDimensionAnimal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private float Altura;
	private float Peso;

	public DimensionAnimalImpl(int id, float altura, float peso) {
		this.id = id;
		Altura = altura;
		Peso = peso;
	}

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

	public float getAltura() {
		return Altura;
	}

	public float getPeso() {
		return Peso;
	}
}//end DimensionAnimalImpl
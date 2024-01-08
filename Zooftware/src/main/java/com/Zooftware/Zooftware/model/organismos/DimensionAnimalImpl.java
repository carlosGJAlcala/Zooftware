package com.Zooftware.Zooftware.model.organismos;


import com.Zooftware.Zooftware.model.interfaces.IDimensionAnimal;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:49:59
 */
public class DimensionAnimalImpl implements IDimensionAnimal {

	private float Altura;
	private int id;
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
package com.Zooftware.Zooftware.model.comida;


import com.Zooftware.Zooftware.model.interfaces.IAlimentacion;
import com.Zooftware.Zooftware.model.interfaces.IComidaBuilder;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:11
 */
public class ComidaHerviboraBuilder implements IComidaBuilder {

	ComidaHervibora comida;
	public ComidaHerviboraBuilder(){
		comida= new ComidaHervibora();
	}

	public void abrirBolsa(){

	}

	public void calentarComida(){
		comida.setEstado(EstadoComida.HACIENDOSE);
	}

	public IAlimentacion getAlimento(){
		return comida;
	}

	public void ponerComidaEnUnCubo(){
		comida.setEstado(EstadoComida.HECHA);
	}
}//end ComidaHerviboraBuilder
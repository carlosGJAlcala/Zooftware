package com.Zooftware.Zooftware.model.comida;


import com.Zooftware.Zooftware.model.comida.ComidaOmnivora;
import com.Zooftware.Zooftware.model.interfaces.IAlimentacion;
import com.Zooftware.Zooftware.model.interfaces.IComidaBuilder;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:10
 */
public class ComidaOmnivoraBuilder implements IComidaBuilder {

	public ComidaOmnivoraBuilder(){
		comida= new ComidaOmnivora();
	}
	ComidaOmnivora comida ;

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
}//end ComidaOmnivoraBuilder
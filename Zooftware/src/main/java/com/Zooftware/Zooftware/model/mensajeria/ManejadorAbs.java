package com.Zooftware.Zooftware.model.mensajeria;


import com.Zooftware.Zooftware.model.persona.Trabajador;
import com.Zooftware.Zooftware.model.interfaces.IManejador;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:08
 */
public abstract class ManejadorAbs implements IManejador {

	private int ListaTrabajadores;
	public Trabajador m_Trabajador;

	public ManejadorAbs(){

	}

	public void enviar(){

	}
}//end ManejadorAbs
package com.Zooftware.Zooftware.model.mensajeria.patron;


import com.Zooftware.Zooftware.model.mensajeria.interfaces.IMensaje;
import com.Zooftware.Zooftware.model.persona.interfaces.ITrabajador;
import com.Zooftware.Zooftware.model.persona.Trabajador;
import com.Zooftware.Zooftware.model.interfaces.*;

import java.util.List;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:06
 */
public class MiddlewareConcreto implements IMiddleware, IObservador {

	private List<IManejador> ListaManejadores;
	private IMensaje Mensaje;
	private List<ITrabajador> Trabajadores;
	public IMensaje m_IMensaje;
	public Trabajador m_Trabajador;
	public IManejador m_IManejador;
	public ISujeto m_ISujeto;

	public MiddlewareConcreto(){

	}

	public void Actualizar(){

	}

	public void enviar(){

	}

	public void enviarAInstalacion(){

	}

	public void getDestinatario(){

	}

	public void setDestinatario(){

	}
}//end MiddlewareConcreto
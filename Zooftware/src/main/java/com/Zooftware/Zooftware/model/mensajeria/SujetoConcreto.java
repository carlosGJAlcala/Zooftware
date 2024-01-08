package com.Zooftware.Zooftware.model.mensajeria;


import com.Zooftware.Zooftware.model.interfaces.IMiddleware;
import com.Zooftware.Zooftware.model.interfaces.IRecipiente;
import com.Zooftware.Zooftware.model.interfaces.ISujeto;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:09
 */
public class SujetoConcreto implements ISujeto {

	private com.Zooftware.Zooftware.model.interfaces.IRecipiente IRecipiente;
	private IMiddleware MidleWare;
	public IRecipiente m_IRecipiente;

	public SujetoConcreto(){

	}

	public void finalize() throws Throwable {

	}
	public void anadirObservador(){

	}

	public void eliminarObservador(){

	}

	public void getRecipiente(){

	}

	public void notificarMiddleware(){

	}

	public void setRecipiente(){

	}
}//end SujetoConcreto
package com.Zooftware.Zooftware.model.acceso;


import com.Zooftware.Zooftware.model.interfaces.IAccionesEmpleado;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:12
 */
public class ProxyEmpleado implements IAccionesEmpleado {

	private IAccionesEmpleado AccionesEmpleado;

	public ProxyEmpleado(){

	}

	public void finalize() throws Throwable {

	}
	public void mandarMensajes(){

	}

	public void verAnimales(){

	}

	public void verInstalaciones(){

	}

	public void verMensajes(){

	}
}//end ProxyEmpleado
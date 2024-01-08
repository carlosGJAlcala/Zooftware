package com.Zooftware.Zooftware.model.acceso;


import com.Zooftware.Zooftware.model.interfaces.IAccionesCliente;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:12
 */
public class ProxyCliente implements IAccionesCliente {

	private IAccionesCliente AccionesCliente;

	public ProxyCliente(){

	}

	public void finalize() throws Throwable {

	}
	public void verAnimales(){

	}

	public void verInstalaciones(){

	}
}//end ProxyCliente
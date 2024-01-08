package com.Zooftware.Zooftware.model.personas;


import com.Zooftware.Zooftware.model.interfaces.IContacto;
import com.Zooftware.Zooftware.model.interfaces.IDescripcion;
import com.Zooftware.Zooftware.model.interfaces.IPersona;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:02
 */
public class Persona implements IPersona {

	private String Apellidos;
	private IContacto Contacto;
	private IDescripcion Descripcion;
	private String Dni;
	private int Edad;
	private String Nombre;
	public IDescripcion m_IDescripcion;
	public IContacto m_IContacto;

	public Persona(){

	}

	public void finalize() throws Throwable {

	}
	public void getApellido(){

	}

	public IContacto getContacto(){
		return null;
	}

	public void getDni(){

	}

	public void getEdad(){

	}

	public void getNombre(){

	}

	public void setApellido(){

	}

	public void setContacto(){

	}

	public void setDni(){

	}

	public void setEdad(){

	}

	public void setNombre(){

	}
}//end Persona
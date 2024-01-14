package com.Zooftware.Zooftware.model.persona;


import com.Zooftware.Zooftware.model.interfaces.IContacto;
import jakarta.persistence.*;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:03
 */
@Entity
@Table(name = "contacto")
public class ContactoImpl implements IContacto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int Correo;
	private int NumeroTlf;

	public ContactoImpl(){

	}

	public String getCorreo(){
		return "";
	}

	public String getNumeroTlf(){
		return "";
	}

	public void setCorreo(){
	}

	public void setNumeroTlf(){

	}
}//end ContactoImpl
package com.Zooftware.Zooftware.model.persona;


import com.Zooftware.Zooftware.model.interfaces.IPersona;
import jakarta.persistence.*;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:02
 */


@Entity
@Table(name = "persona")
public class Persona implements IPersona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Apellidos;
	private String Dni;
	private int Edad;
	private String Nombre;
	@OneToOne
	@JoinColumn(name = "contacto_id")
	private ContactoImpl contactoImp;
	@OneToOne
	@JoinColumn(name = "trabajador_id")
	private Trabajador trabajador;
	@OneToOne
	@JoinColumn(name = "clienteZoo_id")
	private ClienteZoo clienteZoo;
	public Persona(){
	}

	public Persona(String apellidos, String dni, int edad, String nombre, ContactoImpl contactoImp, Trabajador trabajador, ClienteZoo clienteZoo) {
		Apellidos = apellidos;
		Dni = dni;
		Edad = edad;
		Nombre = nombre;
		this.contactoImp = contactoImp;
		this.trabajador = trabajador;
		this.clienteZoo = clienteZoo;
	}

	public void getApellido(){
	}
	public void setApellido(){
	}

	public void getDni(){
	}
	public void setDni(){
	}
	public void getEdad(){
	}
	public void setEdad(){
	}
	public void getNombre(){
	}
	public void setNombre(){
	}
	public ContactoImpl getContacto(){
		return null;
	}
	public void setContacto(){
	}
	public Trabajador getTrabajador() {	return trabajador;}
	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}
	public ClienteZoo getClienteZoo() {
		return clienteZoo;
	}
	public void setClienteZoo(ClienteZoo clienteZoo) {
		this.clienteZoo = clienteZoo;
	}
}//end Persona
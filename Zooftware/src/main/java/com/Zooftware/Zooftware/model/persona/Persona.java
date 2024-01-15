package com.Zooftware.Zooftware.model.persona;


import com.Zooftware.Zooftware.model.persona.enums.Rol;
import com.Zooftware.Zooftware.model.persona.interfaces.IPersona;
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

	private String username;
	private String password;

	@Enumerated(EnumType.STRING)
	private Rol rol;

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

	public Persona(int id, String apellidos, String dni, int edad, String nombre, String username, String password, Rol rol, ContactoImpl contactoImp, Trabajador trabajador, ClienteZoo clienteZoo) {
		this.id = id;
		Apellidos = apellidos;
		Dni = dni;
		Edad = edad;
		Nombre = nombre;
		this.username = username;
		this.password = password;
		this.rol = rol;
		this.contactoImp = contactoImp;
		this.trabajador = trabajador;
		this.clienteZoo = clienteZoo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public void getApellido(){
	}
	public void setApellido(){
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public void setDni(String dni) {
		Dni = dni;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public ContactoImpl getContactoImp() {
		return contactoImp;
	}

	public void setContactoImp(ContactoImpl contactoImp) {
		this.contactoImp = contactoImp;
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
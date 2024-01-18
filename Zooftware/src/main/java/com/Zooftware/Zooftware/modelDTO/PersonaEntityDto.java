package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.Rol;
import com.Zooftware.Zooftware.modelJPA.persona.ClienteEntity;
import com.Zooftware.Zooftware.modelJPA.persona.ContactoEntity;
import com.Zooftware.Zooftware.modelJPA.persona.PersonaEntity;
import com.Zooftware.Zooftware.modelJPA.persona.TrabajadorEntity;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link PersonaEntity}
 */
public class PersonaEntityDto implements Serializable {
    private int id;
    private String apellidos;
    private String dni;
    private int edad;
    private String nombre;
    private String password;
    private Rol rol;
    private String username;
    private ClienteEntity clienteZooId;
    private ContactoEntity contactoId;
    private TrabajadorEntity trabajadorId;

    public PersonaEntityDto(int id, String apellidos, String dni, int edad, String nombre, String password, Rol rol, String username, ClienteEntity clienteZooId, ContactoEntity contactoId, TrabajadorEntity trabajadorId) {
        this.id = id;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
        this.password = password;
        this.rol = rol;
        this.username = username;
        this.clienteZooId = clienteZooId;
        this.contactoId = contactoId;
        this.trabajadorId = trabajadorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ClienteEntity getClienteZooId() {
        return clienteZooId;
    }

    public void setClienteZooId(ClienteEntity clienteZooId) {
        this.clienteZooId = clienteZooId;
    }

    public ContactoEntity getContactoId() {
        return contactoId;
    }

    public void setContactoId(ContactoEntity contactoId) {
        this.contactoId = contactoId;
    }

    public TrabajadorEntity getTrabajadorId() {
        return trabajadorId;
    }

    public void setTrabajadorId(TrabajadorEntity trabajadorId) {
        this.trabajadorId = trabajadorId;
    }
}
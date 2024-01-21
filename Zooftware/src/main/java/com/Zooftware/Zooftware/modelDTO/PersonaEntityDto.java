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
public abstract class PersonaEntityDto implements Serializable {
    private int id;
    private String apellidos;
    private String dni;
    private int edad;
    private String nombre;
    private String password;
    private Rol rol;
    private String username;
    private ContactoEntityDto contacto;

    public PersonaEntityDto(String apellidos, String dni, int edad, String nombre, String password, Rol rol, String username, ContactoEntityDto contacto) {
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
        this.password = password;
        this.rol = rol;
        this.username = username;
        this.contacto = contacto;
    }

    public ContactoEntityDto getContacto() {
        return contacto;
    }

    public void setContacto(ContactoEntityDto contacto) {
        this.contacto = contacto;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getRol() {
        return this.rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
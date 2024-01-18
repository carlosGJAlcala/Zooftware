package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.Rol;
import com.Zooftware.Zooftware.modelJPA.persona.PersonaEntity;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link PersonaEntity}
 */
public class PersonaEntityDto implements Serializable {
    private final int id;
    private final String apellidos;
    private final String dni;
    private final int edad;
    private final String nombre;
    private final String password;
    private final Rol rol;
    private final String username;
    private final Integer clienteZooId;
    private final Integer contactoId;
    private final Integer trabajadorId;

    public PersonaEntityDto(int id, String apellidos, String dni, int edad, String nombre, String password, Rol rol, String username, Integer clienteZooId, Integer contactoId, Integer trabajadorId) {
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

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public Rol getRol() {
        return rol;
    }

    public String getUsername() {
        return username;
    }

    public Integer getClienteZooId() {
        return clienteZooId;
    }

    public Integer getContactoId() {
        return contactoId;
    }

    public Integer getTrabajadorId() {
        return trabajadorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonaEntityDto entity = (PersonaEntityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.apellidos, entity.apellidos) &&
                Objects.equals(this.dni, entity.dni) &&
                Objects.equals(this.edad, entity.edad) &&
                Objects.equals(this.nombre, entity.nombre) &&
                Objects.equals(this.password, entity.password) &&
                Objects.equals(this.rol, entity.rol) &&
                Objects.equals(this.username, entity.username) &&
                Objects.equals(this.clienteZooId, entity.clienteZooId) &&
                Objects.equals(this.contactoId, entity.contactoId) &&
                Objects.equals(this.trabajadorId, entity.trabajadorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, apellidos, dni, edad, nombre, password, rol, username, clienteZooId, contactoId, trabajadorId);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "apellidos = " + apellidos + ", " +
                "dni = " + dni + ", " +
                "edad = " + edad + ", " +
                "nombre = " + nombre + ", " +
                "password = " + password + ", " +
                "rol = " + rol + ", " +
                "username = " + username + ", " +
                "clienteZooId = " + clienteZooId + ", " +
                "contactoId = " + contactoId + ", " +
                "trabajadorId = " + trabajadorId + ")";
    }
}
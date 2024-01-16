package com.Zooftware.Zooftware.modelJPA;

import com.Zooftware.Zooftware.modelJPA.enums.Rol;
import jakarta.persistence.*;

@Entity
@Table(name = "persona", schema = "testbbdd", catalog = "")
public class PersonaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "apellidos")
    private String apellidos;
    @Basic
    @Column(name = "dni")
    private String dni;
    @Basic
    @Column(name = "edad")
    private int edad;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "rol")
    private Rol rol;
    @Basic
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "cliente_zoo_id")
    private Integer clienteZooId;
    @Basic
    @Column(name = "contacto_id")
    private Integer contactoId;
    @Basic
    @Column(name = "trabajador_id")
    private Integer trabajadorId;

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

    public Integer getClienteZooId() {
        return clienteZooId;
    }

    public void setClienteZooId(Integer clienteZooId) {
        this.clienteZooId = clienteZooId;
    }

    public Integer getContactoId() {
        return contactoId;
    }

    public void setContactoId(Integer contactoId) {
        this.contactoId = contactoId;
    }

    public Integer getTrabajadorId() {
        return trabajadorId;
    }

    public void setTrabajadorId(Integer trabajadorId) {
        this.trabajadorId = trabajadorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonaEntity that = (PersonaEntity) o;

        if (id != that.id) return false;
        if (edad != that.edad) return false;
        if (apellidos != null ? !apellidos.equals(that.apellidos) : that.apellidos != null) return false;
        if (dni != null ? !dni.equals(that.dni) : that.dni != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (rol != null ? !rol.equals(that.rol) : that.rol != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (clienteZooId != null ? !clienteZooId.equals(that.clienteZooId) : that.clienteZooId != null) return false;
        if (contactoId != null ? !contactoId.equals(that.contactoId) : that.contactoId != null) return false;
        if (trabajadorId != null ? !trabajadorId.equals(that.trabajadorId) : that.trabajadorId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (apellidos != null ? apellidos.hashCode() : 0);
        result = 31 * result + (dni != null ? dni.hashCode() : 0);
        result = 31 * result + edad;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (rol != null ? rol.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (clienteZooId != null ? clienteZooId.hashCode() : 0);
        result = 31 * result + (contactoId != null ? contactoId.hashCode() : 0);
        result = 31 * result + (trabajadorId != null ? trabajadorId.hashCode() : 0);
        return result;
    }
}

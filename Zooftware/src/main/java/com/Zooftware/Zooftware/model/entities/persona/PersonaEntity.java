package com.Zooftware.Zooftware.model.entities.persona;

import com.Zooftware.Zooftware.model.entities.enums.Rol;
import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "persona", schema = "testbbdd", catalog = "")
public abstract class PersonaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String apellidos;
    private String dni;
    private int edad;
    private String nombre;

    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    @OneToOne
    @JoinColumn(name = "contacto_id")
    private ContactoEntity contacto;


    public PersonaEntity(){}

    public PersonaEntity(String apellidos, String dni, int edad, String nombre, String username, String password, Rol rol, ContactoEntity contacto) {
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
        this.username = username;
        this.password = password;
        this.rol = rol;
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

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public ContactoEntity getContacto() {
        return this.contacto;
    }

    public void setContacto(ContactoEntity contacto) {
        this.contacto = contacto;
    }
}

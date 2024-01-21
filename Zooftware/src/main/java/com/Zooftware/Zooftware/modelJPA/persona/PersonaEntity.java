package com.Zooftware.Zooftware.modelJPA.persona;

import com.Zooftware.Zooftware.modelJPA.enums.Rol;
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
    private ContactoEntity contactoEntity;


    public PersonaEntity(){}

    public PersonaEntity(int id, String apellidos, String dni, int edad, String nombre, String username, String password, Rol rol, ContactoEntity contactoEntity) {
        this.id = id;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
        this.username = username;
        this.password = password;
        this.rol = rol;
        this.contactoEntity = contactoEntity;
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

    public ContactoEntity getContactoEntity() {
        return contactoEntity;
    }

    public void setContactoEntity(ContactoEntity contactoEntity) {
        this.contactoEntity = contactoEntity;
    }
}

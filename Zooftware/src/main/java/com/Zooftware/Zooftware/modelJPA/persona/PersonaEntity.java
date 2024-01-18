package com.Zooftware.Zooftware.modelJPA.persona;

import com.Zooftware.Zooftware.modelJPA.enums.Rol;
import jakarta.persistence.*;

@Entity
@Table(name = "persona", schema = "testbbdd", catalog = "")
public class PersonaEntity {
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
    private ContactoEntity contactoImp;
    @OneToOne
    @JoinColumn(name = "trabajador_id")
    private TrabajadorEntity trabajador;
    @OneToOne
    @JoinColumn(name = "clienteZoo_id")
    private ClienteEntity clienteZoo;

    public PersonaEntity(int id, String apellidos, String dni, int edad, String nombre, String username, String password, Rol rol, ContactoEntity contactoImp, TrabajadorEntity trabajador, ClienteEntity clienteZoo) {
        this.id = id;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
        this.username = username;
        this.password = password;
        this.rol = rol;
        this.contactoImp = contactoImp;
        this.trabajador = trabajador;
        this.clienteZoo = clienteZoo;
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
        apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
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

    public ContactoEntity getContactoImp() {
        return contactoImp;
    }

    public void setContactoImp(ContactoEntity contactoImp) {
        this.contactoImp = contactoImp;
    }

    public TrabajadorEntity getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(TrabajadorEntity trabajador) {
        this.trabajador = trabajador;
    }

    public ClienteEntity getClienteZoo() {
        return clienteZoo;
    }

    public void setClienteZoo(ClienteEntity clienteZoo) {
        this.clienteZoo = clienteZoo;
    }
}

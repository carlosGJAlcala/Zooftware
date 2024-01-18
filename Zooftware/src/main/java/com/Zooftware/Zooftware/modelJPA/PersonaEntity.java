package com.Zooftware.Zooftware.modelJPA;

import com.Zooftware.Zooftware.modelJPA.enums.Rol;
import jakarta.persistence.*;

@Entity
@Table(name = "persona", schema = "testbbdd", catalog = "")
public class PersonaEntity {
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
    private ContactoEntity contactoImp;
    @OneToOne
    @JoinColumn(name = "trabajador_id")
    private TrabajadorEntity trabajador;
    @OneToOne
    @JoinColumn(name = "clienteZoo_id")
    private ClienteEntity clienteZoo;

    public PersonaEntity(int id, String apellidos, String dni, int edad, String nombre, String username, String password, Rol rol, ContactoEntity contactoImp, TrabajadorEntity trabajador, ClienteEntity clienteZoo) {
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

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
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

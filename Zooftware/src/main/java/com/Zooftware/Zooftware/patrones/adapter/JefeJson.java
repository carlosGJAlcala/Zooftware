package com.Zooftware.Zooftware.patrones.adapter;

import com.Zooftware.Zooftware.modelJPA.enums.Rol;

public class JefeJson {

    int id;
    String apellidos;
    String dni;
    String nombre;
    String password;

    String username;
    int edad;
    long numeroSeguridadSocial;

    public String correo;
    public int numeroTlf;


    int salario;


    public JefeJson(int id, String apellidos, String dni, String nombre, String password, String username, int edad, long numeroSeguridadSocial, String correo, int numeroTlf, Rol rol) {
        this.id = id;
        this.apellidos = apellidos;
        this.dni = dni;
        this.nombre = nombre;
        this.password = password;
        this.username = username;
        this.edad = edad;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.correo = correo;
        this.numeroTlf = numeroTlf;
        this.salario = salario;

    }

    public String getCorreo() {
        return correo;
    }

    public int getNumeroTlf() {
        return numeroTlf;
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

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public int getEdad() {
        return edad;
    }

    public long getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }


    public int getSalario() {
        return salario;
    }

}

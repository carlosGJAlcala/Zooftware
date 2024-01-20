package com.Zooftware.Zooftware.patrones.adapter;

import com.Zooftware.Zooftware.modelJPA.enums.Rol;

public class EmpleadoJson {

    int id;
    String apellidos;
    String dni;String nombre;
    String password;

    String username;
    int edad;
    long numeroSeguridadSocial;

    public String correo;
    public int numeroTlf;

    int jefe_id;

    int salario;


    public EmpleadoJson(int id, String apellidos, String dni, String nombre, String password, String username, int edad, long numeroSeguridadSocial, String correo, int numeroTlf, int jefe_id, int salario) {
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
        this.jefe_id = jefe_id;
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


    public int getJefe_id() {
        return jefe_id;
    }

    public int getSalario() {
        return salario;
    }

}

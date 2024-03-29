package com.Zooftware.Zooftware.model.services.patrones.adapter;

import java.util.Date;

public class JefeJson {

    int id;
    int idJefe;
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

    Date fechaFinContrato;

    public JefeJson(int id, String apellidos, String dni, String nombre, String password, String username, int edad, long numeroSeguridadSocial, String correo, int numeroTlf, int salario, Date fechaFinContrato) {
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
        this.fechaFinContrato = fechaFinContrato;
    }

    public int getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }

    public Date getFechaFinContrato() {
        return fechaFinContrato;
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

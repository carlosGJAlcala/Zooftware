package com.Zooftware.Zooftware.modelJPA;

import jakarta.persistence.*;

@Entity
@Table(name = "contacto", schema = "testbbdd", catalog = "")
public class ContactoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int Correo;
    private int NumeroTlf;
    private String numeroTlf;

    public ContactoEntity(int id, int correo, int numeroTlf, String numeroTlf1) {
        this.id = id;
        Correo = correo;
        NumeroTlf = numeroTlf;
        this.numeroTlf = numeroTlf1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCorreo() {
        return Correo;
    }

    public void setCorreo(int correo) {
        Correo = correo;
    }

    public int getNumeroTlf() {
        return NumeroTlf;
    }

    public void setNumeroTlf(String numeroTlf) {
        this.numeroTlf = numeroTlf;
    }

    public void setNumeroTlf(int numeroTlf) {
        NumeroTlf = numeroTlf;
    }
}

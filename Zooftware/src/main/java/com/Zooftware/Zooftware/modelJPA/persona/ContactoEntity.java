package com.Zooftware.Zooftware.modelJPA.persona;

import jakarta.persistence.*;

@Entity
@Table(name = "contacto", schema = "testbbdd", catalog = "")
public class ContactoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int Correo;
    private int NumeroTlf;

    public ContactoEntity(int id, int correo, int numeroTlf, String numeroTlf1) {
        this.id = id;
        Correo = correo;
        NumeroTlf = numeroTlf;
    }

    public ContactoEntity() {
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


    public void setNumeroTlf(int numeroTlf) {
        NumeroTlf = numeroTlf;
    }
}

package com.Zooftware.Zooftware.modelJPA.persona;

import jakarta.persistence.*;

@Entity
@Table(name = "contacto", schema = "testbbdd", catalog = "")
public class ContactoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String correo;
    private int numeroTlf;

    public ContactoEntity(int id, String correo, int numeroTlf) {
        this.id = id;
        this.correo = correo;
        this.numeroTlf = numeroTlf;
    }

    public ContactoEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumeroTlf() {
        return numeroTlf;
    }


    public void setNumeroTlf(int numeroTlf) {
        this.numeroTlf = numeroTlf;
    }
}

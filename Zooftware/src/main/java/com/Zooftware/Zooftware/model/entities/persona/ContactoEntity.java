package com.Zooftware.Zooftware.model.entities.persona;

import jakarta.persistence.*;

@Entity
@Table(name = "contacto")
public class ContactoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String correo;
    private int numeroTlf;

    public ContactoEntity(String correo, int numeroTlf) {
        this.correo = correo;
        this.numeroTlf = numeroTlf;
    }

    public ContactoEntity() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumeroTlf() {
        return this.numeroTlf;
    }


    public void setNumeroTlf(int numeroTlf) {
        this.numeroTlf = numeroTlf;
    }
}

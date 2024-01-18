package com.Zooftware.Zooftware.modelJPA;

import jakarta.persistence.*;

@Entity
@Table(name = "contacto", schema = "testbbdd", catalog = "")
public class ContactoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "correo")
    private String correo;
    @Basic
    @Column(name = "numero_tlf")
    private int numeroTlf;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactoEntity that = (ContactoEntity) o;

        if (id != that.id) return false;
        if (correo != that.correo) return false;
        if (numeroTlf != that.numeroTlf) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
